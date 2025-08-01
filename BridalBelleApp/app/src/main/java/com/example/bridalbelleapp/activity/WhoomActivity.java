package com.example.bridalbelleapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bridalbelleapp.R;

public class WhoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whoom);
    }

    public void openBride(View view) {
        Intent i = new Intent(WhoomActivity.this,BrideDetailsActivity.class);
        startActivity(i);
    }

    public void openGroom(View view) {
        Intent i = new Intent(WhoomActivity.this,GroomDetailsActivity.class);
        startActivity(i);
    }
}