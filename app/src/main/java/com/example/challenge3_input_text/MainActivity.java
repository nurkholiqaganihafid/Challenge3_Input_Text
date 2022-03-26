package com.example.challenge3_input_text;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.challenge3_input_text.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSubmit.setOnClickListener(view -> createUser());

    }

    private void createUser() {

        String name = binding.edtName.getText().toString();
        String email = binding.edtEmail.getText().toString();
        String phone = binding.edtPhone.getText().toString();
        String university = binding.edtUniversity.getText().toString();
        String studyProgram = binding.edtStudyProgram.getText().toString();
        String password = binding.edtPassword.getText().toString();
        String confirmPass = binding.edtConfPassword.getText().toString();

        if (!name.isEmpty() && !email.isEmpty() && !phone.isEmpty() && !university.isEmpty() && !studyProgram.isEmpty()) {
            if (confirmPass.equals(password)) {
                Intent moveIntent = new Intent(this, OutputBiodataActivity.class);
                moveIntent.putExtra("name", name);
                moveIntent.putExtra("email", email);
                moveIntent.putExtra("phone", phone);
                moveIntent.putExtra("university", university);
                moveIntent.putExtra("study", studyProgram);
//                moveIntent.putExtra("password", password);
                startActivity(moveIntent);
            } else {
                Toast.makeText(MainActivity.this, "Password tidak valid", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(MainActivity.this, "Tolong masukan semua informasi anda", Toast.LENGTH_SHORT).show();
        }
    }
}