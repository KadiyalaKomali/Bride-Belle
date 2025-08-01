package com.example.bridalbelleapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bridalbelleapp.R;
import com.example.bridalbelleapp.activity.BrideOutfitActivity;
import com.example.bridalbelleapp.activity.PaymentActivity;

public class BrideRecyclerViewAdapter extends
        RecyclerView.Adapter<BrideRecyclerViewAdapter.MovieInfo> {
    int images[];
    String titles[];

    Context context;

    public BrideRecyclerViewAdapter(int[] images, String[] titles, Context context){
        this.images = images;
        this.titles = titles;
        this.context = context;
    }
    @NonNull
    @Override
    public MovieInfo onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.groomoutfitrow,parent,false);
        return new MovieInfo(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieInfo holder, int position) {
        holder.img.setImageResource(images[position]);
        holder.tv.setText(titles[position]);

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, PaymentActivity.class);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    public class MovieInfo extends RecyclerView.ViewHolder {
        AppCompatImageView img;
        AppCompatTextView tv;
        public MovieInfo(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.posterImg);
            tv = itemView.findViewById(R.id.titleTv);
        }
    }
}


