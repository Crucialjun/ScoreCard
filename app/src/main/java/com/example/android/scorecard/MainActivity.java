package com.example.android.scorecard;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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
    public void calculateTeamAGoals(View view) {
        teamAGoals++;
        setTeamAGoals(teamAGoals);

    }

    // Goal Team B on Click action
    public void calculateTeamBGoals(View view) {
        teamBGoals++;
        setTeamBGoals(teamBGoals);

    }

    // Corner Team A on Click action
    public void calculateTeamACorners(View view) {
        teamACorners++;
        setTeamACorners(teamACorners);

    }

    // Corner Team B on Click action
    public void calculateTeamBCorners(View view) {
        teamBCorners++;
        setTeamBCorners(teamBCorners);

    }

    // Foul Team A on Click action
    public void calculateTeamAFouls(View view) {
        teamAFouls++;
        setTeamAFouls(teamAFouls);

    }

    // Foul Team B on Click action
    public void calculateTeamBFouls(View view) {
        teamBFouls++;
        setTeamBFouls(teamBFouls);

    }

    // Display Team A Goal Count
    public void setTeamAGoals(int teamAGoals) {
        this.teamAGoals = teamAGoals;
        TextView score = findViewById(R.id.goalsTeamA);
        score.setText(String.valueOf(teamAGoals));
    }

    // Display Team B Goal Count
    public void setTeamBGoals(int teamBGoals) {
        this.teamBGoals = teamBGoals;
        TextView score = findViewById(R.id.goalsTeamB);
        score.setText(String.valueOf(teamBGoals));
    }

    // Display Team A Corner Count
    public void setTeamACorners(int teamACorners) {
        this.teamACorners = teamACorners;
        TextView score = findViewById(R.id.cornerTeamA);
        score.setText(String.valueOf(teamACorners));
    }

    // Display Team B Corner Count
    public void setTeamBCorners(int teamBCorners) {
        this.teamBCorners = teamBCorners;
        TextView score = findViewById(R.id.cornerTeamB);
        score.setText(String.valueOf(teamBCorners));
    }

    // Display Team A foul Count
    public void setTeamAFouls(int teamAFouls) {
        this.teamAFouls = teamAFouls;
        TextView score = findViewById(R.id.foulsTeamA);
        score.setText(String.valueOf(teamAFouls));
    }

    // Display Team A foul Count
    public void setTeamBFouls(int teamBFouls) {
        this.teamBFouls = teamBFouls;
        TextView score = findViewById(R.id.foulsTeamB);
        score.setText(String.valueOf(teamBFouls));
    }

    //Reset all counters
    public void resetAll(View view) {
        teamAGoals = 0;
        teamBGoals = 0;
        teamACorners = 0;
        teamBCorners = 0;
        teamAFouls = 0;
        teamBFouls = 0;

        setTeamAGoals(teamAGoals);
        setTeamBGoals(teamBGoals);
        setTeamACorners(teamACorners);
        setTeamBCorners(teamBCorners);
        setTeamAFouls(teamAFouls);
        setTeamBFouls(teamBFouls);
    }
}