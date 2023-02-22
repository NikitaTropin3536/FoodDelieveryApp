package com.example.fooddelieveryapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.fooddelieveryapp.R;
import com.example.fooddelieveryapp.activities.adapters.EnterPagerAdapter;
import com.example.fooddelieveryapp.databinding.ActivityEnterBinding;

public class EnterActivity extends AppCompatActivity {

    ActivityEnterBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEnterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        new Thread(() -> {
            try {
                Thread.sleep(1000);
                runOnUiThread(() -> {
                    findViewById(R.id.main_icon).setVisibility(View.VISIBLE);
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


        binding.pager.setAdapter(new EnterPagerAdapter(getSupportFragmentManager()));

        binding.tabs.setupWithViewPager(binding.pager);
    }
}