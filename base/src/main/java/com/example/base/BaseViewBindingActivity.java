package com.example.base;

import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

/**
 * @author dongzf
 * @since 2024/11/1
 */
public abstract class BaseViewBindingActivity<VB extends ViewBinding> extends AppCompatActivity {
    protected VB binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = onInflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();
    }

    @NonNull
    protected abstract VB onInflate(@NonNull LayoutInflater layoutInflater);

    protected abstract void init();
}
