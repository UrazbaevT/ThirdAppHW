package com.example.thirdapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) MaterialButton button = findViewById(R.id.export);
        button.setOnClickListener(view -> {
            finishAffinity();
        });
        TextView textView = findViewById(R.id.text_view1);
        textView.setText(getIntent().getStringExtra("key"));
    }
}