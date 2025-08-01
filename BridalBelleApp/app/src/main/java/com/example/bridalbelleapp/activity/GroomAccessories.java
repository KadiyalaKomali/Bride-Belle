package com.example.bridalbelleapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import com.example.bridalbelleapp.R;
import com.example.bridalbelleapp.adapter.GroomRecyclerViewAdapter;

public class GroomAccessories extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groom_accessories);
        recyclerView = findViewById(R.id.groomaccessories);
        int images[] = {
                R.drawable.watch1,
                R.drawable.watch2,
                R.drawable.watch3,
                R.drawable.watch4,
                R.drawable.watch5,
                R.drawable.watch6,
                R.drawable.watch7,


        };
        String titles[] = {
                "Allensolly /-5,499.00",
                "Rollsroyce /-5,899.00",
                "Fasttrack /-6,999.00",
                "Titan /-6,749.00",
                "Luminox /-7,000.00",
                "Rado /-6,499.00",
                "Seiko /-5,000.00"

        };
        GroomRecyclerViewAdapter groomRecyclerViewAdapter =
                new GroomRecyclerViewAdapter(images,titles,GroomAccessories.this);
        recyclerView.setAdapter(groomRecyclerViewAdapter);
    }
}