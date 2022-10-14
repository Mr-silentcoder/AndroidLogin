package com.maxlab.maxbook.fragment;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;

import com.maxlab.maxbook.R;
import com.maxlab.maxbook.databinding.FragmentCreateBinding;


public class CreateFragment extends Fragment {
    FragmentCreateBinding binding;
    Dialog dialog;
    public CreateFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @SuppressLint("UseCompatLoadingForColorStateLists")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCreateBinding.inflate(getLayoutInflater());
        //agree box
        binding.checkBox.setOnClickListener(view -> {
            dialog = new Dialog(getContext());
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setContentView(R.layout.bottomsheet);
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
            dialog.getWindow().setGravity(Gravity.BOTTOM);

            if (binding.checkBox.isChecked()){
                dialog.show();
                binding.createButton.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.tangerine)));
                binding.createButton.setEnabled(true);
            }else {
                binding.createButton.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.disable_yellow)));
                binding.createButton.setEnabled(false);
            }
        });
        //create button
        binding.createButton.setOnClickListener(view -> {
            Toast.makeText(getContext(), "clicked", Toast.LENGTH_SHORT).show();
        });

        return binding.getRoot();
    }
}