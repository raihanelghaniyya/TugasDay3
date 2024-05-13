package com.example.tugasday3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CelanaActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celana);

        ImageView imgCelanaJeans = findViewById(R.id.imgCelanaJeans);
        ImageView imgCelanaBahan = findViewById(R.id.imgCelanaBahan);
        ImageView imgCelanaChino = findViewById(R.id.imgCelanaChino);
        ImageView imgCelanaTrainingPendek = findViewById(R.id.imgCelanaTrainingPendek);
        ImageView imgCelanaTrainingPanjang = findViewById(R.id.imgCelanaTrainingPanjang);

        Button btnCelanaJeans = findViewById(R.id.btnCelanaJeans);
        Button btnCelanaBahan = findViewById(R.id.btnCelanaBahan);
        Button btnCelanaChino = findViewById(R.id.btnCelanaChino);
        Button btnCelanaTrainingPendek = findViewById(R.id.btnCelanaTrainingPendek);
        Button btnCelanaTrainingPanjang = findViewById(R.id.btnCelanaTrainingPanjang);

        imgCelanaJeans.setOnClickListener(this);
        imgCelanaBahan.setOnClickListener(this);
        imgCelanaChino.setOnClickListener(this);
        imgCelanaTrainingPendek.setOnClickListener(this);
        imgCelanaTrainingPanjang.setOnClickListener(this);
        btnCelanaJeans.setOnClickListener(this);
        btnCelanaBahan.setOnClickListener(this);
        btnCelanaChino.setOnClickListener(this);
        btnCelanaTrainingPendek.setOnClickListener(this);
        btnCelanaTrainingPanjang.setOnClickListener(this);
    }

    Detail detail = new Detail();
    Intent intent;

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgCelanaJeans || v.getId() == R.id.btnCelanaJeans){
            detail.setJenis("Jenis Celana : Jeans\n");
            detail.setBahan("Bahan : Katun\n");
            detail.setWarna("Berwarna Hitam\n");
            detail.setHarga("Harga : Rp450.000");
            detail.setGambar("celana1");
            intent = new Intent(CelanaActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgCelanaBahan || v.getId() == R.id.btnCelanaBahan) {
            detail.setJenis("Jenis Celana : Bahan\n");
            detail.setBahan("Bahan : Katun\n");
            detail.setWarna("Berwarna Abu-abu\n");
            detail.setHarga("Harga : Rp350.000");
            detail.setGambar("celana2");
            intent = new Intent(CelanaActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgCelanaChino || v.getId() == R.id.btnCelanaChino) {
            detail.setJenis("Jenis Celana : Chino\n");
            detail.setBahan("Bahan : Kapas\n");
            detail.setWarna("Berwarna Orange\n");
            detail.setHarga("Harga : Rp350.000");
            detail.setGambar("celana3");
            intent = new Intent(CelanaActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgCelanaTrainingPendek || v.getId() == R.id.btnCelanaTrainingPendek) {
            detail.setJenis("Jenis Celana : Training Pendek\n");
            detail.setBahan("Bahan : Polyester\n");
            detail.setWarna("Berwarna Biru\n");
            detail.setHarga("Harga : Rp200.000");
            detail.setGambar("celana4");
            intent = new Intent(CelanaActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgCelanaTrainingPanjang || v.getId() == R.id.btnCelanaTrainingPanjang) {
            detail.setJenis("Jenis Celana : Training Panjang\n");
            detail.setBahan("Bahan : Polyester\n");
            detail.setWarna("Berwarna Hitam\n");
            detail.setHarga("Harga : Rp350.000");
            detail.setGambar("celana5");
            intent = new Intent(CelanaActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }
    }
}