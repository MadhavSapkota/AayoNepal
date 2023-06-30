package com.ourdevelops.ourjek.activity.dialogefragment;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.databinding.FragmentMerchantFoodtimelineDialogeBinding;
import com.ourdevelops.ourjek.item.MercahntTimeTableAdapter;
import com.ourdevelops.ourjek.models.Daymodel;
import com.ourdevelops.ourjek.utils.Log;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MerchantFoodtimelineDialoge#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MerchantFoodtimelineDialoge extends DialogFragment {
    private FragmentMerchantFoodtimelineDialogeBinding binding;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    MercahntTimeTableAdapter mercahntTimeTableAdapter;

    ArrayList<Daymodel> daysList;
    public MerchantFoodtimelineDialoge() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
     * @return A new instance of fragment MerchantFoodtimelineDialoge.
     * @param daysList
     */
    // TODO: Rename and change types and number of parameters
    public static MerchantFoodtimelineDialoge newInstance(ArrayList<Daymodel> daysList) {
        MerchantFoodtimelineDialoge fragment = new MerchantFoodtimelineDialoge();
        Bundle args = new Bundle();
        args.putSerializable("timeline",daysList);
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMerchantFoodtimelineDialogeBinding.inflate(inflater, container, false);
        // Inflate the layout for this fragment
        View view = binding.getRoot();
        mercahntTimeTableAdapter = new MercahntTimeTableAdapter(getActivity());
        binding.recylerTimeline.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.recylerTimeline.setAdapter(mercahntTimeTableAdapter);
        if (getArguments() != null) {
            daysList = (ArrayList<Daymodel>) getArguments().getSerializable("timeline");
            mercahntTimeTableAdapter.setdata(daysList);
        }
        return view;
    }


}