package com.example.asus.bdcricketteam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayerDetailsActivity extends AppCompatActivity {

    TextView playerNameTV,playerDescriptionTV;
    ImageView playerIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_details);

        playerIV = findViewById(R.id.playerIVId);
        playerNameTV = findViewById(R.id.nameTVId);
        playerDescriptionTV = findViewById(R.id.descriptionTVId);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            playerIV.setImageResource(bundle.getInt("PLAYER_IMAGE"));
            playerNameTV.setText(bundle.getString("PLAYER_NAME"));
            playerDescriptionTV.setText(bundle.getString("PLAYER_DESCRIPTION"));
        }
    }
}
