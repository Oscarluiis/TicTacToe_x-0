package com.example.rbara.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Player p1= new Player();
        Player p2= new Player();
        Player.player1=p1;
        Player.player2=p2;

    }

    public void callesta(View view) {
        Intent i= new Intent(this, Estadisticas.class);
        startActivity(i);
    }

    public void callnuevo(View view) {
        Intent i= new Intent(this, MainActivity.class);
        startActivity(i);

    }
}
