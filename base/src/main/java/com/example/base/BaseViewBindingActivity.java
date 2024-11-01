package com.example.base;

import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author dongzf
 * @since 2024/11/1
 */
public abstract class BaseViewBindingActivity<VB> extends AppCompatActivity {
    protected VB binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = onInflate(getLayoutInflater());
        onSetContentView(binding);
        init();
    }

    @NonNull
    protected abstract VB onInflate(@NonNull LayoutInflater layoutInflater);

    protected abstract void onSetContentView(@NonNull VB binding);

    protected abstract void init();
}
