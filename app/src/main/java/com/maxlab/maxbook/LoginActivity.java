package com.maxlab.maxbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.maxlab.maxbook.databinding.ActivityLoginBinding;
import com.maxlab.maxbook.fragment.CreateFragment;
import com.maxlab.maxbook.fragment.LoginFragment;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Objects.requireNonNull(getSupportActionBar()).hide();

        binding.createBtn.setBackgroundColor(getResources().getColor(R.color.tangerine_dark));
        login();
        //login Button
        binding.loginBtn.setOnClickListener(view -> {
            login();
            binding.createBtn.setBackgroundColor(getResources().getColor(R.color.tangerine));
            binding.loginBtn.setBackgroundColor(getResources().getColor(R.color.tangerine_dark));
        });
        //create Button
        binding.createBtn.setOnClickListener(view -> {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragframe, new CreateFragment());
            transaction.commit();
            binding.createBtn.setBackgroundColor(getResources().getColor(R.color.tangerine_dark));
            binding.loginBtn.setBackgroundColor(getResources().getColor(R.color.tangerine));
        });

    }

    public void  login(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragframe, new LoginFragment());
        transaction.commit();
    }
}