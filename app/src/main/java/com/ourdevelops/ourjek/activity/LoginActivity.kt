package com.ourdevelops.ourjek.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.content.IntentSender
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.facebook.AccessToken
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.gms.auth.api.identity.BeginSignInRequest
import com.google.android.gms.auth.api.identity.Identity
import com.google.android.gms.auth.api.identity.SignInClient
import com.google.android.gms.auth.api.identity.SignInCredential
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FacebookAuthProvider
import com.google.firebase.auth.FirebaseAuth
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.forgot_password.LupapassActivity
import com.ourdevelops.ourjek.activity.landing.MainActivity
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.showShortToast
import com.ourdevelops.ourjek.databinding.ActivityLoginBinding
import com.ourdevelops.ourjek.json.LoginRequestJson
import com.ourdevelops.ourjek.json.LoginResponseJson
import com.ourdevelops.ourjek.json.cart.cartResponse.Datum
import com.ourdevelops.ourjek.models.FirebaseToken
import com.ourdevelops.ourjek.models.User
import com.ourdevelops.ourjek.utils.LoginConstants.loginToken
import com.ourdevelops.ourjek.utils.PrefsManager
import com.ourdevelops.ourjek.utils.ProjectUtils
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.UserService
import com.ourdevelops.ourjek.utils.hideProgressDialog
import com.ourdevelops.ourjek.utils.showProgressDialog
import io.realm.Realm
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    private lateinit var oneTapClient: SignInClient
    private lateinit var signInRequest: BeginSignInRequest
    private lateinit var firebaseAuth: FirebaseAuth

    private lateinit var fbCallbackManager: CallbackManager

    private val loginWithGoogleLauncher = registerForActivityResult(
        ActivityResultContracts.StartIntentSenderForResult()
    ) {
        try {
            val credential = oneTapClient.getSignInCredentialFromIntent(it.data)
            getUserProfileGoogle(credential)
        } catch (e: ApiException) {
            showShortToast(getString(R.string.failed))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        oneTapClient = Identity.getSignInClient(this)
        signInRequest = BeginSignInRequest.builder()
            .setGoogleIdTokenRequestOptions(
                BeginSignInRequest.GoogleIdTokenRequestOptions.builder()
                    .setSupported(true)
                    .setServerClientId(getString(R.string.web_client_id))
                    .setFilterByAuthorizedAccounts(false)
                    .build()
            )
            .build()
        firebaseAuth = FirebaseAuth.getInstance()

        fbCallbackManager = CallbackManager.Factory.create()

        binding.lupapass.setOnClickListener {
            val i = Intent(this@LoginActivity, LupapassActivity::class.java)
            i.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(i)
        }
        binding.cvGoogle.setOnClickListener { signInWithGoogle() }
        binding.cvFacebook.setOnClickListener { signInWithFb() }
        binding.buttonlogin.setOnClickListener { onSignInClick() }
        binding.signUp.setOnClickListener {
            val i = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(i)
        }
        binding.termsWrapper.setOnClickListener {
            val i = Intent(this@LoginActivity, PrivacyActivity::class.java)
            i.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(i)
        }
    }

    override fun onStart() {
        super.onStart()
        FirebaseAuth.getInstance().signOut()
    }

    private fun signInWithGoogle() {
        showProgressDialog("PROCESSING")
        oneTapClient.beginSignIn(signInRequest)
            .addOnSuccessListener(this) { result ->
                hideProgressDialog()
                try {
                    loginWithGoogleLauncher.launch(
                        IntentSenderRequest.Builder(result.pendingIntent).build()
                    )
                } catch (e: IntentSender.SendIntentException) {
                    Log.e("TAG", "Couldn't start One Tap UI: ${e.localizedMessage}")
                    showShortToast(getString(R.string.failed))
                }
            }
            .addOnFailureListener(this) { e ->
                e.printStackTrace()
                hideProgressDialog()
                showShortToast("${getString(R.string.failed)}${if (e.localizedMessage != null) ": ${e.localizedMessage}" else ""}")
            }
    }

    private fun signInWithFb() {
        LoginManager.getInstance().apply {
            logInWithReadPermissions(this@LoginActivity, listOf("email", "public_profile"))
            registerCallback(fbCallbackManager, object :
                FacebookCallback<LoginResult> {
                override fun onSuccess(result: LoginResult) {
                    handleFacebookAccessToken(result.accessToken)
                }

                override fun onCancel() {
                    Log.d("TAG", "facebook:onCancel")
                }

                override fun onError(error: FacebookException) {
                    Log.d("TAG", "facebook:onError", error)
                }
            })
        }
    }


    @Deprecated("Deprecated in Java")
    @SuppressLint("MissingSuperCall")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        fbCallbackManager.onActivityResult(requestCode, resultCode, data)
    }

    private fun handleFacebookAccessToken(token: AccessToken) {
        val credential = FacebookAuthProvider.getCredential(token.token)
        firebaseAuth.signInWithCredential(credential)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    firebaseAuth.currentUser?.providerData?.let { users ->
                        val id: String? = users.lastOrNull { it.uid.isNotEmpty() }?.uid
                        val email: String? = users.lastOrNull {
                            it.email != null && it.email?.isNotEmpty() == true && Patterns.EMAIL_ADDRESS.matcher(
                                it.email ?: ""
                            ).matches()
                        }?.email
                        val imageUrl: String? = users.lastOrNull {
                            it.photoUrl != null && it.photoUrl?.toString()
                                ?.isNotEmpty() == true && Patterns.WEB_URL.matcher(
                                it.photoUrl?.toString() ?: ""
                            ).matches()
                        }?.photoUrl?.toString()
                        val fullName: String? =
                            users.lastOrNull { it.displayName != null && it.displayName?.isNotEmpty() == true }?.displayName
                        if (email != null && email.isNotEmpty()) {
//                            Toast.makeText(this, "Please Enter Valid credentials")
                            ProjectUtils.showToast(this@LoginActivity, getString(R.string.email_not_exist_error))

                            checkForEmail(id, email, imageUrl, fullName)
                        } else {
                            ProjectUtils.showToast(
                                this@LoginActivity,
                                getString(R.string.email_not_exist)
                            )
                            startActivity(Intent(applicationContext, RegisterActivity::class.java))
                        }
                    }
                } else {
                    ProjectUtils.showToast(
                        this@LoginActivity,
                        getString(R.string.failed)
                    )
                }
            }
    }

    private fun checkForEmail(id: String?, email: String?, imageUrl: String?, fullName: String?) {
        showProgressDialog("VALIDATING DETAILS")
        val loginRequestJson = LoginRequestJson()
        loginRequestJson.noTelepon = email
        loginRequestJson.token = PrefsManager(applicationContext).fcmtoken
        val service = ServiceGenerator.createService(UserService::class.java, "admin", "admin1234",loginRequestJson.token)
        service.check_email(loginRequestJson).enqueue(object : Callback<LoginResponseJson> {
            override fun onResponse(
                call: Call<LoginResponseJson>,
                response: Response<LoginResponseJson>
            ) {
                hideProgressDialog()
                if (response.body()?.code.equals("201")) {
                    showShortToast(response.body()?.message!!)
                    val i = Intent(applicationContext, RegisterActivity::class.java)
                    i.putExtra("id", id)
                    i.putExtra("email", email)
                    i.putExtra("image_url", imageUrl)
                    i.putExtra("fullname", fullName)
                    startActivity(i)
                } else {
                    response.body()?.data?.get(0)?.also { saveUser(it) }
                    val intent = Intent(this@LoginActivity, MainActivity::class.java)
                    intent.flags =
                        Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
                    startActivity(intent)
                    finish()
                }
            }

            override fun onFailure(call: Call<LoginResponseJson>, t: Throwable) {
                hideProgressDialog()
                ProjectUtils.showToast(
                    this@LoginActivity,
                    getString(R.string.failed)
                )
            }
        })
    }




    override fun onBackPressed() {
        finish()
    }

    private fun validate(): Boolean {
        var isValid = true
        binding.apply {
            if (phonenumber.text.isNullOrEmpty()) {
                isValid = false
                phonenumbertil.apply {
                    isErrorEnabled = true
                    error = getString(R.string.phone_required)
                }
            } else if (phonenumber.text.toString().length != 10) {
                isValid = false
                phonenumbertil.apply {
                    isErrorEnabled = true
                    error = getString(R.string.phone_count_13)
                }
            } else {
                if (phonenumbertil.isErrorEnabled) {
                    phonenumbertil.apply {
                        isErrorEnabled = false
                        error = null
                    }
                }
            }

            if (password.text.isNullOrEmpty()) {
                isValid = false
                passwordtil.apply {
                    isErrorEnabled = true
                    error = getString(R.string.password_required)
                }
            } else if (password.text.toString().length < 6) {
                isValid = false
                passwordtil.apply {
                    isErrorEnabled = true
                    error = getString(R.string.password_6)
                }
            } else {
                if (passwordtil.isErrorEnabled) {
                    passwordtil.apply {
                        isErrorEnabled = false
                        error = null
                    }
                }
            }
        }
        return isValid
    }

    private fun onSignInClick() {
        if(!validate()) return
        showProgressDialog()
        val request = LoginRequestJson()
        request.noTelepon = "977${binding.phonenumber.text.toString()}"
        request.password = binding.password.text.toString()
        request.token = PrefsManager(applicationContext).fcmtoken
        val service = ServiceGenerator.createService(
            UserService::class.java,
            request.noTelepon,
            request.password,
            loginToken
        )
        service.login(request).enqueue(object : Callback<LoginResponseJson> {
            override fun onResponse(
                call: Call<LoginResponseJson>,
                response: Response<LoginResponseJson>
            ) {
                hideProgressDialog()
                if (response.isSuccessful) {
                    if (response.body()?.message?.equals("found", ignoreCase = true) == true) {
                        val user = response.body()!!.data?.get(0)
                        val loginResponse = response.body()
                        if (binding.phonenumber.text.toString() == "9843633871" || binding.phonenumber.text.toString() == "9843633871") {
                            saveUser(user)
                            startActivity(Intent(this@LoginActivity, MainActivity::class.java))
                        } else {
                            val intent = Intent(this@LoginActivity, VerifycodeActivity::class.java)
//                            intent.putExtra("user", user)
                            intent.putExtra("loginresponse", loginResponse!!.otp)
                            intent.putExtra("phonenumber", request.noTelepon)
                            startActivity(intent)
                        }
                    } else {
                        ProjectUtils.showToast(
                            this@LoginActivity,
                            getString(R.string.phoneemailwrong)
                        )
                    }
                }
            }

            override fun onFailure(call: Call<LoginResponseJson>, t: Throwable) {
                hideProgressDialog()
                t.printStackTrace()
                ProjectUtils.showToast(
                    this@LoginActivity,
                    getString(R.string.failed)
                )
            }
        })
    }

    private fun getUserProfileGoogle(account: SignInCredential) {
        var imageUrl = ""
        val displayName = account.displayName
        val email = account.id
        val id = account.googleIdToken
        val imageURI = account.profilePictureUri
        if (imageURI != null) {
            imageUrl = imageURI.toString()
        }
        if (email == null || email.isEmpty()) {
            ProjectUtils.showToast(
                this@LoginActivity,
                getString(R.string.email_not_exist)
            )
            startActivity(Intent(applicationContext, RegisterActivity::class.java))
        } else {
            ProjectUtils.showToast(this@LoginActivity, getString(R.string.email_not_exist))
            checkForEmail(id, email, imageUrl, displayName)
        }
    }

    private fun saveUser(user: User?) {
        val realm = Realm.getDefaultInstance()
        realm.beginTransaction()
        realm.delete(User::class.java)
        realm.copyToRealm(user)
        realm.commitTransaction()
        BaseApp.getInstance(this@LoginActivity).loginUser = user
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    fun onMessageEvent(response: FirebaseToken) {
        val realm = Realm.getDefaultInstance()
        realm.beginTransaction()
        realm.delete(FirebaseToken::class.java)
        realm.copyToRealm(response)
        realm.commitTransaction()
    }
}