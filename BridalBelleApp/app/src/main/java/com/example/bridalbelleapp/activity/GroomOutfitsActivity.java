package com.example.bridalbelleapp.activity;

import android.annotation.SuppressLint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import com.example.bridalbelleapp.R;
import com.example.bridalbelleapp.adapter.GroomRecyclerViewAdapter;

public class GroomOutfitsActivity extends AppCompatActivity{
    RecyclerView recyclerView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groom_outfit);
        recyclerView = findViewById(R.id.groomoutfit);
        int images[] = {
                R.drawable.groomoutfit1,
                R.drawable.groomoutfit2,
                R.drawable.groomoutfit3,
                R.drawable.groomoutfit4,
                R.drawable.groomoutfit5,
                R.drawable.groomoutfit6,
                R.drawable.groomoutfit7

        };
        String titles[] = {
                "Achkan Sherwani /-8,899.00",
                "Jodhpuri Sherwani /-5,899.00",
                "JacketStyle Sherwani /-3,999.00",
                "IndoWestern Sherwani /-5,499.00",
                "Chipkan Sherwani /-7,599.00",
                "Angrakha Sherwani /-5,999.00",
                "Printed Modern Sherwani /-9,999.00"
        };
        GroomRecyclerViewAdapter groomRecyclerViewAdapter =
                new GroomRecyclerViewAdapter(images,titles,GroomOutfitsActivity.this);
        recyclerView.setAdapter(groomRecyclerViewAdapter);

    }
}
