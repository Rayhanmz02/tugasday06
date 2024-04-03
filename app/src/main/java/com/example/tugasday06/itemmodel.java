package com.example.tugasday06;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class itemmodel implements Parcelable {
    private String namaitem;
    private  String merkitem;
    private  String warna;
    private  String desk;
    private String harga;
    private int logoitem;


    public itemmodel(String namaitem, int logoitem, String merkitem, String warna,String desk,String harga) {
        this.namaitem = namaitem;
        this.logoitem = logoitem;
        this.merkitem = merkitem;
        this.desk = desk;
        this.harga = harga;
        this.warna = warna;
    }


    protected itemmodel(Parcel in) {
        namaitem = in.readString();
        merkitem = in.readString();
        warna = in.readString();
        desk = in.readString();
        harga = in.readString();
        logoitem = in.readInt();
    }

    public static final Creator<itemmodel> CREATOR = new Creator<itemmodel>() {
        @Override
        public itemmodel createFromParcel(Parcel in) {
            return new itemmodel(in);
        }

        @Override
        public itemmodel[] newArray(int size) {
            return new itemmodel[size];
        }
    };

    public String getNamaitem() {
        return namaitem;
    }

    public void setNamaitem(String namaitem) {
        this.namaitem = namaitem;
    }

    public String getMerkitem() {
        return merkitem;
    }

    public void setMerkitem(String merkitem) {
        this.merkitem = merkitem;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getDesk() {
        return desk;
    }

    public void setDesk(String desk) {
        this.desk = desk;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getLogoitem() {
        return logoitem;
    }

    public void setLogoitem(int logoitem) {
        this.logoitem = logoitem;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(namaitem);
        dest.writeString(merkitem);
        dest.writeString(desk);
        dest.writeString(harga);
        dest.writeString(warna);
        dest.writeInt(logoitem);
    }
}
