package com.ourdevelops.ourjek.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import com.ourdevelops.ourjek.databinding.FragmentIncreaseDecreaseDilaogeBinding;
import com.ourdevelops.ourjek.json.cart.cartResponse.Datum;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link IncreaseDecreaseDilaogeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class IncreaseDecreaseDilaogeFragment extends DialogFragment {


    // TODO: Rename and change types of parameters
    private String mParam1;
    private int mParam2;
    String qty;

    OnOkayClicked okayClicked;
    private FragmentIncreaseDecreaseDilaogeBinding binding;


    public IncreaseDecreaseDilaogeFragment() {
        // Required empty public constructor
    }


    public void onbtn_remove_quantity() {
        if ((Integer.parseInt(qty) != 1)) {
            this.qty = String.valueOf(Integer.parseInt(qty) - 1);
        }
        binding.tvQuantity.setText(qty);
    }

//    @BindView(R.id.tv_quantity_text)
//    TextView tv_quantity_text;

    public void onbtn_add_quantity() {
        this.qty = String.valueOf(Integer.parseInt(qty) + 1);
        binding.tvQuantity.setText(qty);
    }

    public void onbtn_okay() {
        okayClicked.onClick(qty);
    }

    public static IncreaseDecreaseDilaogeFragment newInstance(Datum data, Integer count) {
        IncreaseDecreaseDilaogeFragment fragment = new IncreaseDecreaseDilaogeFragment();
        Bundle args = new Bundle();
        args.putSerializable("fooddata", data);
        args.putInt("count", count);
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
        binding = FragmentIncreaseDecreaseDilaogeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            Datum itemdata = (Datum) getArguments().getSerializable("fooddata");
            this.qty = itemdata.getQuantity();
            try {
                binding.tvQuantity.setText(qty);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        binding.btnOkay.setOnClickListener(v -> onbtn_okay());

        binding.btnAddQuantity.setOnClickListener(v -> onbtn_add_quantity());

        binding.btnRemoveQuantity.setOnClickListener(v -> onbtn_remove_quantity());
    }

    public interface OnOkayClicked {
        void onClick(String qty);
    }

    public void onOkayClickedListener(OnOkayClicked onOkayClicked) {
        this.okayClicked = onOkayClicked;
    }

}