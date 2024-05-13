package com.example.tugasday3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class BajuActivity extends AppCompatActivity implements View.OnClickListener {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baju);

        ImageView imgBajuGamis = findViewById(R.id.imgBajuGamis);
        ImageView imgBajuKemejaKantor = findViewById(R.id.imgBajuKemejaKantor);
        ImageView imgBajuKemejaPolos = findViewById(R.id.imgBajuKemejaPolos);
        ImageView imgBajuKemejaSantai = findViewById(R.id.imgBajuKemejaSantai);
        ImageView imgBajuKemejaRompi = findViewById(R.id.imgBajuKemejaRompi);

        Button btnBajuGamis = findViewById(R.id.btnBajuGamis);
        Button btnBajuKemejaKantor = findViewById(R.id.btnBajuKemejaKantor);
        Button btnBajuKemejaPolos = findViewById(R.id.btnBajuKemejaPolos);
        Button btnBajuKemejaSantai = findViewById(R.id.btnBajuKemejaSantai);
        Button btnBajuKemejaRompi = findViewById(R.id.btnBajuKemejaRompi);

        imgBajuGamis.setOnClickListener(this);
        imgBajuKemejaKantor.setOnClickListener(this);
        imgBajuKemejaPolos.setOnClickListener(this);
        imgBajuKemejaSantai.setOnClickListener(this);
        imgBajuKemejaRompi.setOnClickListener(this);
        btnBajuGamis.setOnClickListener(this);
        btnBajuKemejaKantor.setOnClickListener(this);
        btnBajuKemejaPolos.setOnClickListener(this);
        btnBajuKemejaSantai.setOnClickListener(this);
        btnBajuKemejaRompi.setOnClickListener(this);
    }

    Detail detail = new Detail();
    Intent intent;

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgBajuKemejaPolos || v.getId() == R.id.btnBajuKemejaPolos){
            detail.setJenis("Jenis Baju : Kemeja Polos\n");
            detail.setBahan("Bahan : Katun\n");
            detail.setWarna("Berwarna Hitam\n");
            detail.setHarga("Harga : Rp350.000");
            detail.setGambar("baju1");
            intent = new Intent(BajuActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgBajuKemejaRompi || v.getId() == R.id.btnBajuKemejaRompi) {
            detail.setJenis("Jenis Baju : Kemeja Rompi\n");
            detail.setBahan("Bahan : Katun\n");
            detail.setWarna("Berwarna Putih Hitam\n");
            detail.setHarga("Harga : Rp450.000");
            detail.setGambar("baju2");
            intent = new Intent(BajuActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgBajuGamis || v.getId() == R.id.btnBajuGamis) {
            detail.setJenis("Jenis Baju : Gamis\n");
            detail.setBahan("Bahan : Katun\n");
            detail.setWarna("Berwarna Abu-abu\n");
            detail.setHarga("Harga : Rp550.000");
            detail.setGambar("baju3");
            intent = new Intent(BajuActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgBajuKemejaKantor || v.getId() == R.id.btnBajuKemejaKantor) {
            detail.setJenis("Jenis Baju : Kemeja Kantor\n");
            detail.setBahan("Bahan : Katun\n");
            detail.setWarna("Berwarna Coklat\n");
            detail.setHarga("Harga : Rp400.000");
            detail.setGambar("baju4");
            intent = new Intent(BajuActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgBajuKemejaSantai || v.getId() == R.id.btnBajuKemejaSantai) {
            detail.setJenis("Jenis Baju : Kemeja Santai\n");
            detail.setBahan("Bahan : Katun\n");
            detail.setWarna("Berwarna Abu-abu\n");
            detail.setHarga("Harga : Rp450.000");
            detail.setGambar("baju5");
            intent = new Intent(BajuActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }
    }
}