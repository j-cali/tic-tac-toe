package com.johncalilung.tic_tac_toe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    // Member Variables
    private char mHumanPlayerMark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mHumanPlayerMark = getIntent().getCharExtra("HUMAN_PLAYER_MARK", 'X');

        TextView tempTextView = (TextView) findViewById(R.id.temp_textview);
        tempTextView.append("" + mHumanPlayerMark);
    }
}
