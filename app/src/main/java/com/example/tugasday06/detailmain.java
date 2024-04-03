package com.example.tugasday06;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

public class detailmain extends AppCompatActivity {
    public static final String key_data = "object";
    private TextView tva1,tva2,tva3,tva4;
    private Button bt2;
    private ImageView iva1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailmain);
        tva1 = findViewById(R.id.tva1);
        tva2 = findViewById(R.id.tva2);
        tva3 = findViewById(R.id.tva3);
        tva4 = findViewById(R.id.tva4);
        iva1 = findViewById(R.id.iva1);
        bt2 = findViewById(R.id.bt2);


        itemmodel model = getIntent().getParcelableExtra(key_data);
        iva1.setImageResource(model.getLogoitem());
        tva1.setText(model.getDesk());
        tva2.setText(model.getNamaitem());
        tva3.setText(model.getHarga());
        tva4.setText(model.getWarna());

        bt2.setOnClickListener(click -> {
            Uri imageUri = getImageUri(iva1);
            Intent intent1 = new Intent(Intent.ACTION_SEND);
            intent1.setType("text/plain");
            String shareMessage ="harga : " +tva1.getText() + "\n nama : "+tva2.getText() + "\n model : " +tva3.getText() +"\n deskripsi : "+ tva4.getText();
            intent1.putExtra(Intent.EXTRA_TEXT, shareMessage);
            intent1.putExtra(Intent.EXTRA_STREAM, imageUri); // Menambahkan URI gambar ke Intent
            intent1.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            startActivity(Intent.createChooser(intent1, "Bagikan melalui"));
        });
    }
    private Uri getImageUri(ImageView imageView) {
        Uri imageUri;
        try {
            // Mendapatkan URI gambar dari ImageView
            BitmapDrawable drawable = (BitmapDrawable) imageView.getDrawable();
            Bitmap bitmap = drawable.getBitmap();
            String path = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "Title", null);
            imageUri = Uri.parse(path);
        } catch (Exception e) {
            e.printStackTrace();
            imageUri = null;
        }
        return imageUri;
    }

}