package com.example.rbara.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView turno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Game juego = new Game();
        Game.juegoActual=juego;
        turno = (TextView) findViewById(R.id.txtTurno);
        turno.setText(Game.juegoActual.getTurnoPlayer());
    }

    public void callbtn1(View view) {
        Button boton= (Button) findViewById(R.id.btn1);
        ejecutar(boton,0,0);
    }

    public void callbtn2(View view) {
        Button boton= (Button) findViewById(R.id.btn2);
        ejecutar(boton,0,1);
    }

    public void callbtn3(View view) {
        Button boton= (Button) findViewById(R.id.btn3);
        ejecutar(boton,0,2);
    }

    public void callbtn4(View view) {
        Button boton= (Button) findViewById(R.id.btn4);
        ejecutar(boton,1,0);
    }

    public void callbtn5(View view) {
        Button boton= (Button) findViewById(R.id.btn5);
        ejecutar(boton,1,1);
    }

    public void callbtn6(View view) {
        Button boton= (Button) findViewById(R.id.btn6);
        ejecutar(boton,1,2);
    }

    public void callbtn7(View view) {
        Button boton= (Button) findViewById(R.id.btn7);
        ejecutar(boton,2,0);
    }

    public void callbtn8(View view) {
        Button boton= (Button) findViewById(R.id.btn8);
        ejecutar(boton,2,1);
    }

    public void callbtn9(View view) {
        Button boton= (Button) findViewById(R.id.btn9);
        ejecutar(boton,2,2);

    }

    public void ejecutar(Button btn, int f, int c){
        if(Game.juegoActual.validar(btn)) {
            Game.juegoActual.escribir(f, c);
            btn.setText(Game.juegoActual.getLetra());
            if (Game.juegoActual.verificarGano()) {
                Toast.makeText(this, "Gano el " + Game.juegoActual.getTurnoPlayer(), Toast.LENGTH_LONG).show();
                if (Game.juegoActual.getTurnoPlayer().equals("Jugador 1 -> X"))
                    Player.player1.gano();
                else
                    Player.player2.gano();
                Game.juegoActual.setTerminado();
                return;
            }
            else if(Game.juegoActual.empate()){
                Toast.makeText(this, "El juego quedo empatado", Toast.LENGTH_LONG).show();
                return;
            }
            Game.juegoActual.setTurno();
            turno.setText(Game.juegoActual.getTurnoPlayer());
        }
        else {
            String s="EL juego ha terminado";
            if(Game.juegoActual.isTerminado()) {
                s = "Seleccione un boton valido";
            }
            Toast.makeText(this, s, Toast.LENGTH_LONG).show();
        }
    }

    public void callsalir(View view){
        finish();
    }

    public void callreiniciar(View view){
        Game reiniciar = new Game();
        Game.juegoActual=reiniciar;
        Button btn1= (Button) findViewById(R.id.btn1);
        Button btn2= (Button) findViewById(R.id.btn2);
        Button btn3= (Button) findViewById(R.id.btn3);
        Button btn4= (Button) findViewById(R.id.btn4);
        Button btn5= (Button) findViewById(R.id.btn5);
        Button btn6= (Button) findViewById(R.id.btn6);
        Button btn7= (Button) findViewById(R.id.btn7);
        Button btn8= (Button) findViewById(R.id.btn8);
        Button btn9= (Button) findViewById(R.id.btn9);
        btn1.setText(" ");
        btn2.setText(" ");
        btn3.setText(" ");
        btn4.setText(" ");
        btn5.setText(" ");
        btn6.setText(" ");
        btn7.setText(" ");
        btn8.setText(" ");
        btn9.setText(" ");


    }
}
