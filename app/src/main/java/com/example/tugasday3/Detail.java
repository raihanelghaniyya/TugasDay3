package com.example.tugasday3;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Detail implements Parcelable {
    public String jenis;
    public String bahan;
    public String warna;
    public String harga;
    public String gambar;

    public Detail() {
    }

    protected Detail(Parcel in) {
        jenis = in.readString();
        bahan = in.readString();
        warna = in.readString();
        harga = in.readString();
        gambar = in.readString();
    }

    public static final Creator<Detail> CREATOR = new Creator<Detail>() {
        @Override
        public Detail createFromParcel(Parcel in) {
            return new Detail(in);
        }

        @Override
        public Detail[] newArray(int size) {
            return new Detail[size];
        }
    };

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(jenis);
        dest.writeString(bahan);
        dest.writeString(warna);
        dest.writeString(harga);
        dest.writeString(gambar);
    }
}

