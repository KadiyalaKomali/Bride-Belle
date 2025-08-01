package com.example.bridalbelleapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bridalbelleapp.R;

public class BrideDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bride_details2);
    }


    public void openBrideDetails(View view) {
        Intent i = new Intent(BrideDetailsActivity.this, BrideOutfitActivity.class);
        startActivity(i);
    }

    public void openMehandhi(View view) {
        Intent i = new Intent(BrideDetailsActivity.this, BrideMehandhi.class);
        startActivity(i);
    }
}