package com.example.bridalbelleapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bridalbelleapp.R;

public class GroomDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groom_details2);
    }


    public void openAccessories(View view) {
        Intent i = new Intent(GroomDetailsActivity.this,GroomAccessories.class);
        startActivity(i);
    }

    public void openOutFits(View view) {
        Intent i = new Intent(GroomDetailsActivity.this,GroomOutfitsActivity.class);
        startActivity(i);
    }
}