package com.example.istanbul;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.istanbul.fragments.HotelsFragment;

public class HotelsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new HotelsFragment())
                .commit();
    }
}