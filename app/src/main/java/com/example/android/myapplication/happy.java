package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class happy extends AppCompatActivity {

    TextView happy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);
        happy = findViewById(R.id.happybirthday);
        Intent intent = getIntent();
        String message = intent.getStringExtra("arsh");
        happy.setText(message+" today is your Birthday.");
    }
}