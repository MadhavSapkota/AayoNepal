package com.ourdevelops.ourjek.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.constants.BaseApp;
import com.ourdevelops.ourjek.databinding.ActivityNotificationBinding;
import com.ourdevelops.ourjek.item.MessageItemRecyclerAdapter;
import com.ourdevelops.ourjek.models.MessageModel;

import java.util.ArrayList;
import io.realm.Realm;
import io.realm.RealmResults;

public class NotificationActivity extends AppCompatActivity {
    private ActivityNotificationBinding binding;
    public ArrayList<MessageModel> list = new ArrayList();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNotificationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Realm realm2 = BaseApp.getInstance(this).getRealmInstance();
        RealmResults<MessageModel> messageModel = realm2.where(MessageModel.class).findAll();
        if (messageModel.size() != 0) {
            list.addAll(messageModel);
            MessageItemRecyclerAdapter messageItemRecyclerAdapter = new MessageItemRecyclerAdapter(getApplicationContext(), list);
            binding.recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL, false));
            binding.recyclerView.setAdapter(messageItemRecyclerAdapter);
            messageItemRecyclerAdapter.SetOnItemClickListener((view, position, model) -> {
                Realm realm = Realm.getDefaultInstance();
                realm.executeTransaction((r) -> {
                    final MessageModel messageModel1 =  r.where(MessageModel.class).equalTo("title", model.getTitle()).findFirst();
                    messageModel1.setType("Old");
                });
                TextView textView =  view.findViewById(R.id.datetxt);
                textView.setBackgroundColor(getResources().getColor(R.color.white));
            });
        }else {
            binding.rlnodata.setVisibility(View.VISIBLE);
            binding.recyclerView.setVisibility(View.GONE);
        }
        binding.backBtn.setOnClickListener(v -> onBackPressed());
    }

}
