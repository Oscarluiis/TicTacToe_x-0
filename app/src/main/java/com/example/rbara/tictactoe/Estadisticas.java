package com.example.rbara.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Estadisticas extends AppCompatActivity {
    TextView gano1;
    TextView gano2;
    TextView empate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadisticas);
        gano1 = (TextView) findViewById(R.id.txtg1);
        gano2 = (TextView) findViewById(R.id.txtg2);
        empate=(TextView) findViewById(R.id.em);

        gano1.setText(String.valueOf(Player.player1.getPartidas()));
        gano2.setText(String.valueOf(Player.player2.getPartidas()));
        empate.setText(String.valueOf(Player.player1.getEmpate()));

    }
}
