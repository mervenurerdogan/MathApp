package com.example.mathapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PlayActivity extends AppCompatActivity {


    ImageView addition,sub,multi,divie,square;
    Button btnHomePage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        btnHomePage= this.<Button>findViewById(R.id.btnHomePage);

        addition = (ImageView) findViewById(R.id.addition);
        sub = (ImageView) findViewById(R.id.sub);
        multi =(ImageView) findViewById(R.id.multi);
        divie =(ImageView) findViewById(R.id.divie);
        square =(ImageView) findViewById(R.id.square);





        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calInt= new Intent(PlayActivity.this, MainActivity.class);

                startActivity(calInt);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calInt=new Intent(PlayActivity.this,SubtractionActivity.class);

                startActivity(calInt);

            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calInt= new Intent(PlayActivity.this, MultipActivity.class);

                startActivity(calInt);            }
        });

        divie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent calInt= new Intent(PlayActivity.this, DivideActivity.class);

                startActivity(calInt);

            }
        });


        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent calInt= new Intent(PlayActivity.this, SquareActivity.class);

                startActivity(calInt);

            }
        });

        btnHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PlayActivity.this,OpenActivity2.class);
                startActivity(intent);
            }
        });










    }
}