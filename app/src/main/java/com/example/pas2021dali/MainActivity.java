package com.example.pas2021dali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    CircleImageView imgGalunggung,imgAmpera,imgDanaulemona,imgSitugede;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgGalunggung=(CircleImageView) findViewById(R.id.circleImageView22);
        imgAmpera=(CircleImageView) findViewById(R.id.circleImageView23);
        imgDanaulemona=(CircleImageView) findViewById(R.id.circleImageView24);
        imgSitugede=(CircleImageView) findViewById(R.id.circleImageView25);

        imgGalunggung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahGalunggung = new Intent(MainActivity.this,Activitygalunggung.class);
                startActivity(pindahGalunggung);
            }
        });
        imgAmpera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahAmpera = new Intent(MainActivity.this,Activityampera.class);
                startActivity(pindahAmpera);
            }
        });
        imgDanaulemona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahDanaulemona = new Intent(MainActivity.this,Activitydanaulemona.class);
                startActivity(pindahDanaulemona);
            }
        });
        imgSitugede.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahSitugede =new Intent(MainActivity.this,Activitysitugede.class);
                startActivity(pindahSitugede);
            }
        });
    }
}