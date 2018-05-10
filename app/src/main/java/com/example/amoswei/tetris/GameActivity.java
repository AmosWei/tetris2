package com.example.amoswei.tetris;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity implements GameOver {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tetris);
        TetrisView tetrisView = (TetrisView) findViewById(R.id.tetrisview);
        tetrisView.registerGameOver(this);
    }
}
