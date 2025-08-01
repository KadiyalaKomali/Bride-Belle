package com.example.bridalbelleapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bridalbelleapp.R;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment2);
    }

    public void goFinish(View view) {
        Intent intent = new
                Intent(PaymentActivity.this,FinishActivity.class);
        startActivity(intent);
    }
}