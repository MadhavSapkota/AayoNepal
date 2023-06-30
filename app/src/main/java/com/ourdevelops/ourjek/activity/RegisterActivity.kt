package com.ourdevelops.ourjek.activity

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.text.TextUtils
import android.util.Base64
import android.util.Log
import android.util.Patterns
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Response
import com.bumptech.glide.Glide
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.iid.FirebaseInstanceId
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.activity.RegisterActivity
import com.ourdevelops.ourjek.constants.ActivityResultCodes
import com.ourdevelops.ourjek.constants.showLongToast
import com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYes
import com.ourdevelops.ourjek.databinding.ActivityRegisterBinding
import com.ourdevelops.ourjek.json.RegisterRequestJson
import com.ourdevelops.ourjek.json.RegisterResponseJson
import com.ourdevelops.ourjek.models.FirebaseToken
import com.ourdevelops.ourjek.utils.api.ServiceGenerator
import com.ourdevelops.ourjek.utils.api.service.UserService
import com.ourdevelops.ourjek.utils.hideProgressDialog
import com.ourdevelops.ourjek.utils.showProgressDialog
import com.squareup.picasso.Picasso
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import io.realm.Realm
import net.alhazmy13.mediapicker.Image.ImagePicker
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import retrofit2.Call
import retrofit2.Callback
import java.io.ByteArrayOutputStream
import java.text.SimpleDateFormat
import java.util.*

class RegisterActivity : AppCompatActivity() {
    private var binding: ActivityRegisterBinding? = null
    private var dateFormatter: SimpleDateFormat? = null
    private var dateFormatterview: SimpleDateFormat? = null
    var phoneNumber: String? = null
    var firebaseUser: FirebaseUser? = null
    private var fbAuth: FirebaseAuth? = null
    var mAuth: FirebaseAuth? = null
    var imageByteArray: ByteArray? = null
    var decoded: Bitmap? = null
    var dateview: String? = null
    var disableback: String? = null
    var verify: String? = null
    var token: String? = null
    var selectedImageUri: Uri? = null

    private var id: String? = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding!!.root)
        fbAuth = FirebaseAuth.getInstance()
        mAuth = FirebaseAuth.getInstance()
        firebaseUser = mAuth!!.currentUser
        token = FirebaseInstanceId.getInstance().token
        binding!!.backBtn.setOnClickListener {
            startActivity(Intent(applicationContext, LoginActivity::class.java))
            finish()
        }
        if (intent.extras != null) {
            id = intent.getStringExtra("id")
            binding!!.email.setText(intent.getStringExtra("email"))
            if (intent.getStringExtra("image_url")!!.isEmpty()) {
            } else {
                Picasso.with(this).load(intent.getStringExtra("image_url")).into(binding!!.foto)
            }
            binding!!.nama.setText(intent.getStringExtra("fullname"))
        }
        binding!!.foto.setOnClickListener { openImagePicker() }
        binding!!.editfoto.setOnClickListener { openImagePicker() }
        dateFormatter = SimpleDateFormat("yyyy-MM-dd", Locale.US)
        dateFormatterview = SimpleDateFormat("dd MMM yyyy", Locale.US)
        binding!!.submit.setOnClickListener(View.OnClickListener {
            if(validate()){
                upload("false")
            }
        })
        binding!!.tanggal.setOnClickListener { showTanggal() }
        disableback = "false"
        verify = "false"
    }

    private fun validate(): Boolean {
        var isValid = true

        binding?.apply {
            if (nama.text.isNullOrEmpty()) {
                isValid = false
                namaTil.apply {
                    isErrorEnabled = true
                    error = getString(R.string.name_required)
                }
            }  else {
                if (namaTil.isErrorEnabled) {
                    namaTil.apply {
                        isErrorEnabled = false
                        error = null
                    }
                }
            }

            if (phonenumber.text.isNullOrEmpty()) {
                isValid = false
                phonenumberTil.apply {
                    isErrorEnabled = true
                    error = getString(R.string.phone_required)
                }
            } else if (phonenumber.text.toString().length != 10) {
                isValid = false
                phonenumberTil.apply {
                    isErrorEnabled = true
                    error = getString(R.string.phone_count_13)
                }
            } else {
                if (phonenumberTil.isErrorEnabled) {
                    phonenumberTil.apply {
                        isErrorEnabled = false
                        error = null
                    }
                }
            }

            if (email.text.isNullOrEmpty()) {
                isValid = false
                emailTil.apply {
                    isErrorEnabled = true
                    error = getString(R.string.email_required)
                }
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches()) {
                    isValid = false
                emailTil.apply {
                        isErrorEnabled = true
                        error = getString(R.string.invalid_email_id)
                    }
                } else {
                if (emailTil.isErrorEnabled) {
                    emailTil.apply {
                        isErrorEnabled = false
                        error = null
                    }
                }
            }

            if (tanggal.text.isNullOrEmpty()) {
                isValid = false
                tanggalError.text = getString(R.string.dob_req)
                tanggalError.visibility = View.VISIBLE
            }  else {
                tanggalError.text = null
                tanggalError.visibility = View.GONE
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

            if (cpassword.text.isNullOrEmpty()) {
                isValid = false
                cpasswordtil.apply {
                    isErrorEnabled = true
                    error = getString(R.string.password_required)
                }
            } else if (cpassword.text.toString().length < 6) {
                isValid = false
                cpasswordtil.apply {
                    isErrorEnabled = true
                    error = getString(R.string.password_6)
                }
            } else if (cpassword.text.toString() != password.text.toString()) {
                isValid = false
                cpasswordtil.apply {
                    isErrorEnabled = true
                    error = getString(R.string.password_match)
                }
            } else {
                if (cpasswordtil.isErrorEnabled) {
                    cpasswordtil.apply {
                        isErrorEnabled = false
                        error = null
                    }
                }
            }
        }
        return isValid
    }

    private fun showTanggal() {
        val datePicker = DatePickerDialog.newInstance { view, year, monthOfYear, dayOfMonth ->
            val calendar = Calendar.getInstance()
            calendar[Calendar.YEAR] = year
            calendar[Calendar.MONTH] = monthOfYear
            calendar[Calendar.DAY_OF_MONTH] = dayOfMonth
            val date_ship_millis = calendar.timeInMillis
            binding!!.tanggal.text = dateFormatterview!!.format(date_ship_millis)
            dateview = dateFormatter!!.format(date_ship_millis)
        }
        datePicker.isThemeDark = false
        datePicker.accentColor = resources.getColor(R.color.colorgradient)
        datePicker.show(fragmentManager, "Datepickerdialog")
    }

    override fun onBackPressed() {
        if (disableback != "true") {
            finish()
        }
    }

    private fun openImagePicker() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        intent.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, false)
        startActivityForResult(
            Intent.createChooser(intent, "Select an image"),
            ActivityResultCodes.RequestImagePicker
        )
    }

    /**
     * uploadfoto-------------start.
     */
    private fun selectImage() {
        ImagePicker.Builder(this@RegisterActivity)
            .mode(ImagePicker.Mode.CAMERA_AND_GALLERY)
            .compressLevel(ImagePicker.ComperesLevel.HARD)
            .directory(ImagePicker.Directory.DEFAULT)
            .extension(ImagePicker.Extension.PNG)
            .scale(600, 600)
            .allowMultipleImages(false)
            .enableDebuggingMode(true)
            .build()
    }

    fun getPath(uri: Uri?): String {
        var result: String? = null
        val proj = arrayOf(MediaStore.Images.Media.DATA)
        val cursor = this.contentResolver.query(uri!!, proj, null, null, null)
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                val column_index = cursor.getColumnIndexOrThrow(proj[0])
                result = cursor.getString(column_index)
            }
            cursor.close()
        }
        if (result == null) {
            result = "Not found"
        }
        return result
    }

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK) {
            when (requestCode) {
                ActivityResultCodes.RequestImagePicker -> {
                    if (data?.data != null) {
                        selectedImageUri = data.data
                        Glide.with(this)
                            .load(selectedImageUri)
                            .into(binding?.foto!!)
                        decoded = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                            val src: ImageDecoder.Source =
                                ImageDecoder.createSource(contentResolver, selectedImageUri!!)
                            ImageDecoder.decodeBitmap(src)
                        } else {
                            @Suppress("DEPRECATION")
                            MediaStore.Images.Media.getBitmap(contentResolver, selectedImageUri)
                        }
                    }
                }
            }
        }
    }

    fun getStringImage(bmp: Bitmap): String {
        val baos = ByteArrayOutputStream()
        bmp.compress(Bitmap.CompressFormat.JPEG, 100, baos)
        imageByteArray = baos.toByteArray()
        return Base64.encodeToString(imageByteArray, Base64.DEFAULT)
    }

    /**
     * uploadfoto-------------end.
     */
    private fun upload(check: String) {
        showProgressDialog()
        val request = RegisterRequestJson()
        request.fullNama = binding!!.nama.text.toString()
        request.email = binding!!.email.text.toString()
        request.password = binding!!.password.text.toString()
        request.noTelepon = "977${binding!!.phonenumber.text.toString()}"
        request.phone = binding!!.phonenumber.text.toString()
        request.tglLahir = dateview
        phoneNumber = "977${binding!!.phonenumber.text.toString()}"
        if (decoded == null) {
            request.fotopelanggan = ""
        } else {
            request.fotopelanggan = getStringImage(decoded!!)
        }
        request.countrycode = "+977"
        request.checked = check
        val token = FirebaseInstanceId.getInstance()
        request.token = token.token
        val service = ServiceGenerator.createService(
            UserService::class.java, request.email, request.password,request.token
        )
        service.register(request).enqueue(object : Callback<RegisterResponseJson> {
            override fun onResponse(
                call: Call<RegisterResponseJson>,
                response: retrofit2.Response<RegisterResponseJson>
            ) {
                hideProgressDialog()
                if (response.isSuccessful) {
                    if (response.body()!!.code == ("201")) {
                        CustomDialogYes.apply {
                            setBtnText(getString(R.string.btn_ok))
                            setTitle("Error")
                            setMessage(response.body()!!.message)
                            showYesDialog(
                                this@RegisterActivity,
                                object : CustomDialogYes.dialogOnClickListener {
                                    override fun onClick() {
                                    }

                                    override fun onClose() {
                                    }
                                })
                        }
                    } else {
                        val intent = Intent(this@RegisterActivity, VerifycodeActivity::class.java)
                        intent.putExtra("user", response.body()!!.data[0])
                        intent.putExtra("loginresponse", response.body()!!.otp)
                        intent.flags =
                            Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
                        intent.putExtra("phonenumber", phoneNumber)
                        startActivity(intent)
                    }
                } else {
                    showLongToast(getString(R.string.failed))
                }
            }

            override fun onFailure(call: Call<RegisterResponseJson>, t: Throwable) {
                t.printStackTrace()
                CustomDialogYes.apply {
                    setBtnText(getString(R.string.btn_ok))
                    setTitle(getString(R.string.failed))
                    setMessage(getString(R.string.label_something_went_wrong))
                    showYesDialog(
                        this@RegisterActivity,
                        object : CustomDialogYes.dialogOnClickListener {
                            override fun onClick() {
                            }

                            override fun onClose() {
                            }
                        })
                }
            }
        })
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