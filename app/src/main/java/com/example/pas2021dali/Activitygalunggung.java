package com.example.pas2021dali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activitygalunggung extends AppCompatActivity {
    Button btngalunggung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitygalunggung);
        btngalunggung =(Button) findViewById(R.id.btn_gg);

        btngalunggung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnGalunggung = new Intent(Activitygalunggung.this,fotoGalunggung.class);
                startActivity(pindahBtnGalunggung);
            }
        });
    }
}