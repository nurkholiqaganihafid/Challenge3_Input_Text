package com.example.challenge3_input_text;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.challenge3_input_text.databinding.ActivityOutputBiodataBinding;

public class OutputBiodataActivity extends AppCompatActivity {

    private ActivityOutputBiodataBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output_biodata);
        binding = ActivityOutputBiodataBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String getName = intent.getStringExtra("name");
        String getEmail = intent.getStringExtra("email");
        String getPhone = intent.getStringExtra("phone");
        String getUniversity = intent.getStringExtra("university");
        String getStudy = intent.getStringExtra("study");

        binding.outputName.setText(getName);
        binding.outputEmail.setText(getEmail);
        binding.outputPhone.setText(getPhone);
        binding.outputUniversity.setText(getUniversity);
        binding.outputStudy.setText(getStudy);

    }
}