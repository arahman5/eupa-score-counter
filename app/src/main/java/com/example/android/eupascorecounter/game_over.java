package com.example.android.eupascorecounter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Abid on 2015-07-12.
 */
public class game_over extends AppCompatActivity {


  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_over);
        String winner = getIntent().getExtras().getString("winner");
        showWinningTeam(winner);


    }

    public void showWinningTeam(String winner) {
        TextView scoreView = (TextView) findViewById(R.id.winningTeam);
        scoreView.setText(String.valueOf(winner));
    }


    public void backToScores(View v) {
        finish();
    }




}
