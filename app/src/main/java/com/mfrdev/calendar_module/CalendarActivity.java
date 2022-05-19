package com.mfrdev.calendar_module;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mfrdev.calendar_module.databinding.ActivityCalendarBinding;

public class CalendarActivity extends AppCompatActivity {
    private ActivityCalendarBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCalendarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}