package com.example.android.scorecard;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int teamAGoals = 0;
    int teamBGoals = 0;
    int teamACorners = 0;
    int teamBCorners = 0;
    int teamAFouls = 0;
    int teamBFouls = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Goal Team A on Click action
    public void teamAGoals(View view) {
        teamAGoals++;
    }


}