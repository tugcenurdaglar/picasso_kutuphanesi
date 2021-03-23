package com.tugcenurdaglar.picassocalismasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewResimTutucu;
    private Button buttonLocal, buttonInternet1, buttonInternet2, buttonDegistir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewResimTutucu = findViewById(R.id.imageViewResimTutucu);
        buttonLocal = findViewById(R.id.buttonLocal);
        buttonInternet1 = findViewById(R.id.buttonInternet1);
        buttonInternet2 = findViewById(R.id.buttonInternet2);
        buttonDegistir = findViewById(R.id.buttonDegistir);

        buttonLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get().load(R.drawable.interstellar).into(imageViewResimTutucu);


            }
        });
        buttonInternet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://kasimadalan.pe.hu/filmler/resimler/django.png";
                Picasso.get().load(url).into(imageViewResimTutucu);

            }
        });
        buttonInternet2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://kasimadalan.pe.hu/filmler/resimler/"+"thehatefuleight"+".png";
                Picasso.get().load(url).placeholder(R.drawable.hata).into(imageViewResimTutucu);
            }
        });
        buttonDegistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://kasimadalan.pe.hu/filmler/resimler/"+"thehatefuleight"+".png";

                Picasso.get().load(url).resize(400,600).into(imageViewResimTutucu);




            }
        });



    }
}