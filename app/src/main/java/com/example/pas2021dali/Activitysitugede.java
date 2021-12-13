package com.example.pas2021dali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activitysitugede extends AppCompatActivity {
    Button btnsitugede;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitysitugede);
        btnsitugede =(Button) findViewById(R.id.btn_stgd);

        btnsitugede.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahBtnsitugede = new Intent(Activitysitugede.this,fotoSitugede.class);
                startActivity(pindahBtnsitugede);
            }
        });
    }
}