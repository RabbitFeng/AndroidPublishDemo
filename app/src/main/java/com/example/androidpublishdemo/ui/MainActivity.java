package com.example.androidpublishdemo.ui;

import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.androidpublishdemo.R;
import com.example.androidpublishdemo.databinding.ActivityMainBinding;
import com.example.base.BaseViewBindingActivity;

public class MainActivity extends BaseViewBindingActivity<ActivityMainBinding> {

    @NonNull
    @Override
    protected ActivityMainBinding onInflate(@NonNull LayoutInflater layoutInflater) {
        return ActivityMainBinding.inflate(layoutInflater);
    }

    @Override
    protected void init() {

    }
}