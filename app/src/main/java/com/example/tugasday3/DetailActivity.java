package com.example.tugasday3;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.ByteArrayOutputStream;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView imgDetail;
    private TextView txtDetail;
    private Button btnShare;
    public static final String KEY_DATA = "key_data";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgDetail = findViewById(R.id.imgDetail);
        txtDetail = findViewById(R.id.txtDetail);
        btnShare = findViewById(R.id.btnShare);

        Detail detail;

        if (Build.VERSION.SDK_INT >= 33){
            detail = getIntent().getParcelableExtra(KEY_DATA, Detail.class);
        } else {
            detail = getIntent().getParcelableExtra(KEY_DATA);
        }

        String sourceGambar = detail.getGambar();
        int sourceGambarID = getResources().getIdentifier(sourceGambar, "drawable", getPackageName());
        imgDetail.setImageResource(sourceGambarID);

        String jenis = detail.getJenis();
        String bahan = detail.getBahan();
        String warna = detail.getWarna();
        String harga = detail.getHarga();

        String gabungan = jenis + bahan + warna + harga;

        txtDetail.setText(gabungan);
        btnShare.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        shareImageAndText();
    }

    private void shareImageAndText() {
        Bitmap bitmap = ((BitmapDrawable) imgDetail.getDrawable()).getBitmap();
        String text = txtDetail.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("image/*");

        Uri uri = getImageUri(this, bitmap);
        intent.putExtra(Intent.EXTRA_STREAM, uri);
        intent.putExtra(Intent.EXTRA_TEXT, text);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(Intent.createChooser(intent, "Share melalui"));
        } else {
            Toast.makeText(this, "Tidak ada aplikasi yang dapat menangani intent ini", Toast.LENGTH_SHORT).show();
        }
    }

    private Uri getImageUri(Context context, Bitmap bitmap) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String path = MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, "Title", null);
        return Uri.parse(path);
    }
}