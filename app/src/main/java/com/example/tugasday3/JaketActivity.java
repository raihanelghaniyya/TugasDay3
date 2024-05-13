package com.example.tugasday3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class JaketActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaket);

        ImageView imgJaketKulit = findViewById(R.id.imgJaketKulit);
        ImageView imgJaketOlahraga = findViewById(R.id.imgJaketOlahraga);
        ImageView imgJaketHoodie = findViewById(R.id.imgJaketHoodie);
        ImageView imgJaketHoodiee = findViewById(R.id.imgJaketHoodiee);
        ImageView imgJaketJeans = findViewById(R.id.imgJaketJeans);

        Button btnJaketKulit = findViewById(R.id.btnJaketKulit);
        Button btnJaketOlahraga = findViewById(R.id.btnJaketOlahraga);
        Button btnJaketHoodie = findViewById(R.id.btnJaketHoodie);
        Button btnJaketHoodiee = findViewById(R.id.btnJaketHoodiee);
        Button btnJaketJeans = findViewById(R.id.btnJaketJeans);

        imgJaketKulit.setOnClickListener(this);
        imgJaketOlahraga.setOnClickListener(this);
        imgJaketHoodie.setOnClickListener(this);
        imgJaketHoodiee.setOnClickListener(this);
        imgJaketJeans.setOnClickListener(this);
        btnJaketKulit.setOnClickListener(this);
        btnJaketOlahraga.setOnClickListener(this);
        btnJaketHoodie.setOnClickListener(this);
        btnJaketHoodiee.setOnClickListener(this);
        btnJaketJeans.setOnClickListener(this);
    }

    Detail detail = new Detail();
    Intent intent;

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imgJaketKulit || v.getId() == R.id.btnJaketKulit){
            detail.setJenis("Jenis Jaket : Kulit\n");
            detail.setBahan("Bahan : Kulit\n");
            detail.setWarna("Berwarna Coklat\n");
            detail.setHarga("Harga : Rp450.000");
            detail.setGambar("jaket1");
            intent = new Intent(JaketActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgJaketOlahraga || v.getId() == R.id.btnJaketOlahraga) {
            detail.setJenis("Jenis Jaket : Olahraga\n");
            detail.setBahan("Bahan : Katun\n");
            detail.setWarna("Berwarna Merah\n");
            detail.setHarga("Harga : Rp250.000");
            detail.setGambar("jaket2");
            intent = new Intent(JaketActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgJaketHoodie || v.getId() == R.id.btnJaketHoodie) {
            detail.setJenis("Jenis Jaket : Hoodie\n");
            detail.setBahan("Bahan : Wol\n");
            detail.setWarna("Berwarna Hitam\n");
            detail.setHarga("Harga : Rp300.000");
            detail.setGambar("jaket3");
            intent = new Intent(JaketActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgJaketHoodiee || v.getId() == R.id.btnJaketHoodiee) {
            detail.setJenis("Jenis Jaket : Hoodie\n");
            detail.setBahan("Bahan : Wol\n");
            detail.setWarna("Berwarna Merah\n");
            detail.setHarga("Harga : Rp300.000");
            detail.setGambar("jaket4");
            intent = new Intent(JaketActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        } else if (v.getId() == R.id.imgJaketJeans || v.getId() == R.id.btnJaketJeans) {
            detail.setJenis("Jenis Jaket : Jeans\n");
            detail.setBahan("Bahan : Denim\n");
            detail.setWarna("Berwarna Abu-abu\n");
            detail.setHarga("Harga : Rp350.000");
            detail.setGambar("jaket5");
            intent = new Intent(JaketActivity.this, DetailActivity.class);
            intent.putExtra(DetailActivity.KEY_DATA, detail);
            startActivity(intent);
        }
    }
}