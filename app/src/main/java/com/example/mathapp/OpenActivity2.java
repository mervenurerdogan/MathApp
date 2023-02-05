package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpenActivity2 extends AppCompatActivity {

    Button btnmathplay,btngeo,btnMathExample;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open2);

        btnmathplay=findViewById(R.id.btnmathplay);
        btngeo=findViewById(R.id.btngeo);
        btnMathExample=findViewById(R.id.btnMathExample);

        btnmathplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OpenActivity2.this,PlayActivity.class);
                startActivity(intent);
            }
        });

        btngeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OpenActivity2.this,GeoActivity.class);
                startActivity(intent);
            }
        });

        btnMathExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OpenActivity2.this,MathExampleActivity.class);
                startActivity(intent);
            }
        });
    }
}