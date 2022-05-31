package com.example.devanshusharmatictaktoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import length.length;

public class MainActivity extends AppCompatActivity {
    int player = 1; //player1 is cross
    int[][] winningStates = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
    int[] gameState = {-1, -1, -1, -1, -1, -1, -1, -1, -1};

    public void load(View View) {
        ImageView v = (ImageView) View;
        int tag = Integer.parseInt(v.getTag().toString());
        if (player == 1) {
            v.setImageResource(R.drawable.cross);
            gameState[tag] = player;
            Toast.makeText(this, tag + "" + "cross", Toast.LENGTH_SHORT).show();
            player = 0;
        } else {
            v.setImageResource(R.drawable.zero);
            gameState[tag] = player;
            Toast.makeText(this, tag + "" + "zero", Toast.LENGTH_SHORT).show();
            player = 1;
        }
        
    }

    0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}