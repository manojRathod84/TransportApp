package com.example.transportapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DeliveryReport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_report);

        getSupportActionBar().setTitle("Delivery Report");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
