package com.example.rbara.tictactoe;

/**
 * Created by Javier on 15/6/2017.
 */

public class Player {
    public static Player player1;
    public static Player player2;
    private int partidas;
    private int empate;

    public Player(){

        this.partidas=0;
        this.empate=0;

    }

    public int getPartidas(){
        return this.partidas;
    }

    public void gano(){
        this.partidas++;
    }

    public void empate(){
     this.empate++;
    }

    public int getEmpate(){
        return empate;
    }

}
