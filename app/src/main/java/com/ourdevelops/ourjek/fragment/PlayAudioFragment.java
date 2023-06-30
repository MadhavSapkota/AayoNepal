package com.ourdevelops.ourjek.fragment;


import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.databinding.FragmentPlayaudioBinding;

import java.util.Objects;

import androidx.fragment.app.Fragment;
import nl.changer.audiowife.AudioWife;


public class PlayAudioFragment extends Fragment {
    private FragmentPlayaudioBinding binding;

    private AudioWife audioWife;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPlayaudioBinding.inflate(inflater, container, false);
        // Inflate the layout for this fragment
        View getView = binding.getRoot();

        Context context = getContext();
        String filepath = Objects.requireNonNull(getArguments()).getString("path");
        Uri uri = Uri.parse(filepath);

        audioWife = AudioWife.getInstance();
        audioWife.init(context, uri)
                .setPlayView(binding.playbtn)
                .setPauseView(binding.pauseBtn)
                .setSeekBar(binding.seekbar)
                .setRuntimeView(binding.durationTime)
                .setTotalTimeView(binding.totaltime);

        audioWife.play();

        binding.closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requireActivity().onBackPressed();
            }
        });

        return getView;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        audioWife.pause();
        audioWife.release();
    }
}
