package com.ourdevelops.ourjek.activity.chat

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.google.firebase.database.*
import com.ourdevelops.ourjek.constants.BaseApp
import com.ourdevelops.ourjek.constants.Constants
import com.ourdevelops.ourjek.constants.Functions
import com.ourdevelops.ourjek.constants.logDebug
import com.ourdevelops.ourjek.databinding.ActivityMessageBinding
import com.ourdevelops.ourjek.item.MessageItem
import com.ourdevelops.ourjek.models.MessageModels
import com.ourdevelops.ourjek.models.User
import com.ourdevelops.ourjek.utils.AppLogger
import java.util.*

class MessageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMessageBinding
    private var inboxArraylist: ArrayList<MessageModels>? = null
    private var rootRef: DatabaseReference? = null
    lateinit var loginUser:User
    private var inboxItem: MessageItem? = null
    private var inboxQuery: Query? = null
    private var valueEventListener: ValueEventListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loginUser = BaseApp.getInstance(applicationContext).loginUser
        val imageUrl = "${Constants.IMAGESUSER}${BaseApp.loginUser.fotopelanggan}"
        logDebug(loginUser.fotopelanggan)
        logDebug(imageUrl)
        rootRef = FirebaseDatabase.getInstance().reference
        inboxArraylist = ArrayList()
        setUpViews()
    }

    private fun setUpViews() {
        onShowProgress()
        binding.inboxlist.layoutManager = LinearLayoutManager(applicationContext)
        binding.inboxlist.setHasFixedSize(false)
        AppLogger.log(loginUser.fotopelanggan)
        Glide.with(applicationContext)
                .load(loginUser.fotopelanggan)
                .into(binding.profileimage)

        inboxItem = MessageItem(applicationContext, inboxArraylist) { item ->
            if (checkReadStoragepermission()) {
                val intent = Intent(this@MessageActivity, ChatActivity::class.java)
                intent.putExtra("senderid", loginUser.id)
                intent.putExtra("receiverid", item.id)
                intent.putExtra("name", item.name)
                intent.putExtra("tokendriver", loginUser.token)
                intent.putExtra("tokenku", item.tokenuser)
                intent.putExtra("pic", item.picture)
                startActivity(intent)
            }
        }

        binding.inboxlist.adapter = inboxItem

        binding.root.setOnClickListener {
            Functions.hideSoftKeyboard(this)
        }

    }

    private fun onShowProgress() {
        binding.rlProgress.visibility = View.VISIBLE
        binding.inboxlist.visibility = View.GONE
    }

    private fun onHideProgress() {
        binding.rlProgress.visibility = View.GONE
        binding.inboxlist.visibility = View.VISIBLE
    }

    override fun onStart() {
        super.onStart()
        inboxQuery = rootRef!!.child("Inbox").child(loginUser.id).orderByChild("date")
        valueEventListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                onHideProgress()
                inboxArraylist!!.clear()
                for (ds in dataSnapshot.children) {
                    val model = MessageModels()
                    model.id = ds.key
                    model.name = Objects.requireNonNull(ds.child("name").value).toString()
                    model.message = Objects.requireNonNull(ds.child("msg").value).toString()
                    model.timestamp = Objects.requireNonNull(ds.child("date").value).toString()
                    model.status = Objects.requireNonNull(ds.child("status").value).toString()
                    model.picture = Objects.requireNonNull(ds.child("pic").value).toString()
                    model.tokendriver =
                            Objects.requireNonNull(ds.child("tokendriver").value).toString()
                    model.tokenuser =
                            Objects.requireNonNull(ds.child("tokenuser").value).toString()
                    inboxArraylist!!.add(model)
                }
                inboxArraylist?.reverse()
                inboxItem!!.notifyDataSetChanged()
                if (inboxArraylist!!.isEmpty()) {
                    binding.rlnodata.visibility = View.VISIBLE
                    binding.inboxlist.visibility = View.GONE
                } else {
                    binding.inboxlist.visibility = View.VISIBLE
                    binding.rlnodata.visibility = View.GONE
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {}
        }
        inboxQuery?.addValueEventListener(valueEventListener!!)
    }

    override fun onStop() {
        super.onStop()
        if (inboxQuery != null) inboxQuery?.removeEventListener(valueEventListener!!)
    }


    private fun checkReadStoragepermission(): Boolean {
        if (ContextCompat.checkSelfPermission(applicationContext, Manifest.permission.READ_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED) {
            return true
        } else {
            try {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    requestPermissions(
                            arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),
                            Constants.permission_Read_data
                    )
                }
            } catch (e: Exception) {
                e.printStackTrace()
                throw e
            }
        }
        return false
    }


}