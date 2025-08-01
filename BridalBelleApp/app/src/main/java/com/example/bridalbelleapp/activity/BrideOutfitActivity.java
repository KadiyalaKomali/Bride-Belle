package com.example.bridalbelleapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.bridalbelleapp.R;
import com.example.bridalbelleapp.adapter.BrideRecyclerViewAdapter;

public class BrideOutfitActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bride_outfit);
        recyclerView = findViewById(R.id.groomOutFitRv);
        int images[] = {
                R.drawable.brideoutfit1,
                R.drawable.brideoutfit2,
                R.drawable.brideoutfit3,
                R.drawable.brideoutfit4,
                R.drawable.brideoutfit5,
                R.drawable.brideoutfit6,
                R.drawable.brideoutfit7

        };
        String titles[] = {
                "Saree style Lehanga /-7,599.00",
                "Straight cut Lehanga /-10,000.00",
                "Lehanga Suit /-5,999.00" ,
                "Paneled Lehanga /-8,999.00",
                "Anarkali Lehanga /-7,000.00",
                "Applique Lehanga /-8,500.00",
                "Benarasi Lehanga /-9,999.00"

        };
        BrideRecyclerViewAdapter groomRecyclerViewAdapter =
                new BrideRecyclerViewAdapter(images,titles, BrideOutfitActivity.this);
        recyclerView.setAdapter(groomRecyclerViewAdapter);

    }
}