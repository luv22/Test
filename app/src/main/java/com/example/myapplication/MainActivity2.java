package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        try {

            Intent intent = getIntent();

            String name  = intent.getStringExtra("name");
            String last = intent.getStringExtra("lastname");
            String lang = intent.getStringExtra("lang");
            TextView textView = findViewById(R.id.data);
            textView.setText("first name "+ name+" last name "+last+" lang is "+lang);
        }catch (Exception e) {

        }
    }
}