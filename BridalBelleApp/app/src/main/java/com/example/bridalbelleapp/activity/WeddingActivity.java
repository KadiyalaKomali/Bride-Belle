package com.example.bridalbelleapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bridalbelleapp.R;

public class WeddingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wedding2);
    }

    public void next(View view) {
        Intent i = new Intent(WeddingActivity.this,DateActivity.class);
        startActivity(i);
    }
}