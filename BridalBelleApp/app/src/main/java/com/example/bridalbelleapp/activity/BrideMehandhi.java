package com.example.bridalbelleapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bridalbelleapp.R;
import com.example.bridalbelleapp.adapter.BrideRecyclerViewAdapter;

public class BrideMehandhi extends AppCompatActivity {

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bride_mehandhi);
        recyclerView = findViewById(R.id.groomoutfit);
        int images[] = {
                R.drawable.mehandhi1,
                R.drawable.mehandhi2,
                R.drawable.mehandhi3,
                R.drawable.mehandhi4,
                R.drawable.mehandhi5,
                R.drawable.mehandhi6,
                R.drawable.mehandhi7


        };
        String titles[] = {
                "Arabic Mehendi /-3,000.00",
                "Mehendi Design1 /-2,500.00",
                "Mehendi Design2 /-3,500.00",
                "Mehendi Design3 /-2,500.00",
                "Mehendi Design4 /-2,000.00",
                "Mehendi Design5 /-1,999.00",
                "Mehendi Design6 /-3,999.00"

        };
        BrideRecyclerViewAdapter groomRecyclerViewAdapter =
                new BrideRecyclerViewAdapter(images,titles, BrideMehandhi.this);
        recyclerView.setAdapter(groomRecyclerViewAdapter);
    }
}
