package com.maxlab.maxbook.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.maxlab.maxbook.R;
import com.maxlab.maxbook.databinding.FragmentPassresetBinding;


public class PassresetFragment extends Fragment {

   FragmentPassresetBinding binding;
    public PassresetFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPassresetBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
}