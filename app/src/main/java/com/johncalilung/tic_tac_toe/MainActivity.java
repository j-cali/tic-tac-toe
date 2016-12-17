package com.johncalilung.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    // Member Variables
    private char mHumanPlayerMark;
    private RadioButton mMarkedButton;
    private Button mPlayButton;
    private RadioGroup mRadioGroupMark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayButton = (Button) findViewById(R.id.play_button);
        mRadioGroupMark = (RadioGroup) findViewById(R.id.radio_mark_choice);


        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, GameActivity.class);
                i.putExtra("HUMAN_PLAYER_MARK", getHumanPlayerMark());
                startActivity(i);
            }
        });

        mRadioGroupMark.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                mMarkedButton = (RadioButton) findViewById(checkedId);
                mHumanPlayerMark = mMarkedButton.getText().charAt(0);
            }
        });
    }

    private char getHumanPlayerMark() {
        return mHumanPlayerMark;
    }
}
