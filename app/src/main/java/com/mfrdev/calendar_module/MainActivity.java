package com.mfrdev.calendar_module;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mfrdev.calendar_module.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnCalendar.setOnClickListener(this::onClickBtn);

    }

    private void onClickBtn(View view) {
        startActivity(new Intent(this,CalendarActivity.class));
    }
}