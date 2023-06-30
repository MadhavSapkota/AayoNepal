package com.ourdevelops.ourjek.fragment.new_profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ourdevelops.ourjek.R
import com.ourdevelops.ourjek.databinding.FragmentNewProfileBinding
import com.ourdevelops.ourjek.models.profile.ProfileObject
import com.ourdevelops.ourjek.models.profile.ProfileViewType

class NewProfileFragment : Fragment() {

    private lateinit var binding : FragmentNewProfileBinding
    private lateinit var adapter : NewProfileAdapter
    private val mlist = ArrayList<ProfileObject>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentNewProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
        createData()
    }

    private fun setupViews() {
        binding.recyclerView.layoutManager = LinearLayoutManager(activity)
        adapter = NewProfileAdapter(mlist, activity)
        binding.recyclerView.adapter = adapter
    }

    private fun createData() {
        mlist.clear()
        mlist.add(ProfileObject(ProfileViewType.head))
//        mlist.add(ProfileObject(ProfileViewType.item, "My Favourites", R.drawable.ic_new_favourite_image))
//        mlist.add(ProfileObject(ProfileViewType.item, "Change Password", R.drawable.ic_lock_alt))
//        mlist.add(ProfileObject(ProfileViewType.item, "Edit Profile", R.drawable.ic_profile_edit))
//        mlist.add(ProfileObject(ProfileViewType.item, "About Us", R.drawable.ic_info_circle))
//        mlist.add(ProfileObject(ProfileViewType.item, "Privacy Policy", R.drawable.ic_keyhole_circle))
//        mlist.add(ProfileObject(ProfileViewType.logout))


        mlist.add(ProfileObject(ProfileViewType.item, "Edit Details", R.drawable.edit_details_red, true))
        mlist.add(ProfileObject(ProfileViewType.item, "My Addresses", R.drawable.my_addresses, true))
        mlist.add(ProfileObject(ProfileViewType.item, "Change Password", R.drawable.change_password, true))
        mlist.add(ProfileObject(ProfileViewType.item, "Notifications", R.drawable.notifications, true))
        mlist.add(ProfileObject(ProfileViewType.item, "Privacy Policy", R.drawable.privacy_policy))
        mlist.add(ProfileObject(ProfileViewType.item, "Support", R.drawable.support))
        mlist.add(ProfileObject(ProfileViewType.item, "About app", R.drawable.about_app))


        adapter.notifyDataSetChanged()
    }
}