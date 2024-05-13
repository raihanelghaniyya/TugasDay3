package com.example.tugasday3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgBaju = findViewById(R.id.imgBaju);
        ImageView imgCelana = findViewById(R.id.imgCelana);
        ImageView imgJaket = findViewById(R.id.imgJaket);
        Button btnBaju = findViewById(R.id.btnBaju);
        Button btnCelana = findViewById(R.id.btnCelana);
        Button btnJaket = findViewById(R.id.btnJaket);

        imgBaju.setOnClickListener(this);
        imgCelana.setOnClickListener(this);
        imgJaket.setOnClickListener(this);
        btnBaju.setOnClickListener(this);
        btnCelana.setOnClickListener(this);
        btnJaket.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgBaju || v.getId() == R.id.btnBaju){
            Intent intent = new Intent(this, BajuActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.imgCelana || v.getId() == R.id.btnCelana) {
            Intent intent = new Intent(this, CelanaActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.imgJaket || v.getId() == R.id.btnJaket) {
            Intent intent = new Intent(this, JaketActivity.class);
            startActivity(intent);
        }
    }
}