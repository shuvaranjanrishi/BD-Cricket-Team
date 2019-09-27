package com.example.asus.bdcricketteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    private CardView masrafeeCV,sakibCV,tamimCV,musfiqCV,mahmudullaCV,soummoCV,litonCV,mustafizCV;
    private String[] playerName;
    private String[] playerDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerName = getResources().getStringArray(R.array.player_name);
        playerDescription = getResources().getStringArray(R.array.player_description);

        masrafeeCV = findViewById(R.id.masrafeeCVId);
        sakibCV = findViewById(R.id.sakibCVId);
        tamimCV = findViewById(R.id.tamimCVId);
        musfiqCV = findViewById(R.id.musfiqCVId);
        mahmudullaCV = findViewById(R.id.mahmudullaCVId);
        soummoCV = findViewById(R.id.soummoCVId);
        litonCV = findViewById(R.id.litonCVId);
        mustafizCV = findViewById(R.id.mustafizCVId);

        masrafeeCV.setOnClickListener(this);
        sakibCV.setOnClickListener(this);
        tamimCV.setOnClickListener(this);
        musfiqCV.setOnClickListener(this);
        mahmudullaCV.setOnClickListener(this);
        soummoCV.setOnClickListener(this);
        litonCV.setOnClickListener(this);
        mustafizCV.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.masrafeeCVId){

            Intent intent = new Intent(MainActivity.this,PlayerDetailsActivity.class);
            intent.putExtra("PLAYER_IMAGE",R.drawable.masrafee);
            intent.putExtra("PLAYER_NAME",playerName[0]);
            intent.putExtra("PLAYER_DESCRIPTION",playerDescription[0]);
            startActivity(intent);

        }else if(v.getId() == R.id.sakibCVId){

            Intent intent = new Intent(MainActivity.this,PlayerDetailsActivity.class);
            intent.putExtra("PLAYER_IMAGE",R.drawable.sakib);
            intent.putExtra("PLAYER_NAME",playerName[1]);
            intent.putExtra("PLAYER_DESCRIPTION",playerDescription[1]);
            startActivity(intent);

        }else if(v.getId() == R.id.tamimCVId){

            Intent intent = new Intent(MainActivity.this,PlayerDetailsActivity.class);
            intent.putExtra("PLAYER_IMAGE",R.drawable.tamim);
            intent.putExtra("PLAYER_NAME",playerName[2]);
            intent.putExtra("PLAYER_DESCRIPTION",playerDescription[2]);
            startActivity(intent);

        }else if(v.getId() == R.id.musfiqCVId){

            Intent intent = new Intent(MainActivity.this,PlayerDetailsActivity.class);
            intent.putExtra("PLAYER_IMAGE",R.drawable.musfiqur);
            intent.putExtra("PLAYER_NAME",playerName[3]);
            intent.putExtra("PLAYER_DESCRIPTION",playerDescription[3]);
            startActivity(intent);

        }else if(v.getId() == R.id.mahmudullaCVId){

            Intent intent = new Intent(MainActivity.this,PlayerDetailsActivity.class);
            intent.putExtra("PLAYER_IMAGE",R.drawable.mahmudulla);
            intent.putExtra("PLAYER_NAME",playerName[4]);
            intent.putExtra("PLAYER_DESCRIPTION",playerDescription[4]);
            startActivity(intent);

        }else if(v.getId() == R.id.soummoCVId){

            Intent intent = new Intent(MainActivity.this,PlayerDetailsActivity.class);
            intent.putExtra("PLAYER_IMAGE",R.drawable.soummo);
            intent.putExtra("PLAYER_NAME",playerName[5]);
            intent.putExtra("PLAYER_DESCRIPTION",playerDescription[5]);
            startActivity(intent);

        }
        else if(v.getId() == R.id.litonCVId){

            Intent intent = new Intent(MainActivity.this,PlayerDetailsActivity.class);
            intent.putExtra("PLAYER_IMAGE",R.drawable.liton);
            intent.putExtra("PLAYER_NAME",playerName[6]);
            intent.putExtra("PLAYER_DESCRIPTION",playerDescription[6]);
            startActivity(intent);

        }
        else if(v.getId() == R.id.mustafizCVId){

            Intent intent = new Intent(MainActivity.this,PlayerDetailsActivity.class);
            intent.putExtra("PLAYER_IMAGE",R.drawable.mustafiz);
            intent.putExtra("PLAYER_NAME",playerName[7]);
            intent.putExtra("PLAYER_DESCRIPTION",playerDescription[7]);
            startActivity(intent);

        }
    }
}
