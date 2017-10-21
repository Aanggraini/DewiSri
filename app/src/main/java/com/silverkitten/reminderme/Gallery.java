package com.silverkitten.reminderme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.content.Intent;
import android.view.View;

import com.silverkitten.reminderme.R;

public class Gallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);

        ImageButton makanan = (ImageButton)findViewById(R.id.makananbutton);

        ImageButton fasilitas = (ImageButton)findViewById(R.id.fasilitasbutton);
        makanan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Gallery.this, FotoMakanan.class));
            }
        });
        fasilitas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Gallery.this, FotoFasilitas.class));
            }
        });
    }
}
