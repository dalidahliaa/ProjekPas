package com.example.pas2021dali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fotoGalunggung extends AppCompatActivity {
    Button btnBackfotoGalunggung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_galunggung);
        btnBackfotoGalunggung=(Button) findViewById(R.id.btn_gggg);

        btnBackfotoGalunggung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnGalunggung = new Intent(fotoGalunggung.this,MainActivity.class);
                startActivity(pindahBtnGalunggung);
            }
        });
    }
}