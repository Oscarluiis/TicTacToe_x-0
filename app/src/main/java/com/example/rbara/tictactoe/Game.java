package com.example.rbara.tictactoe;

import android.media.MediaPlayer;
import android.widget.Button;



public class Game {

    public static Game juegoActual;
    private String turnoPlayer, letra;
    private boolean turno, terminado;
    private String[][] tabla;




    public Game(){
        this.turnoPlayer="Jugador 1 -> X";
        this.turno=true;
        this.tabla= new String[3][3];
        this.letra="X";
        this.terminado=true;
        vaciar();

    }

    public boolean empate(){
        for(int f=0;f<3;f++){
            for(int c=0;c<3;c++){
                if(tabla[f][c].equals(""))
                    return false;
            }
        }
        setTerminado();
        Player.player1.empate();
        return true;
    }

    public boolean validar(Button btn){
        if(btn.getText().equals(" ")){
            return terminado;
        }
        return false;
    }

    private void vaciar(){
        for(int f=0;f<3;f++){
            for(int c=0;c<3;c++){
                tabla[f][c]="";
            }
        }
    }

    private boolean verificarH(int f,int c,String l){
        if(f<3) {
            if (c > 2) {
                return true;
            }
            else if (tabla[f][c].equals(l)) {
                return verificarH(f, c + 1, l);
            } else {
                return verificarH(f+1,0,l);
            }
        }
        return false;
    }

    private boolean verificarV(int f,int c,String l){
        if(c<3) {
            if (f > 2) {
                return true;
            }
            else if (tabla[f][c].equals(l)) {
                return verificarV(f+1,c, l);
            } else {
                return verificarV(0,c+1,l);
            }
        }
        return false;
    }


    public boolean verificarGano(){
        String l=getLetra();
        if(verificarH(0,0,l)|| verificarV(0,0,l))
            return true;
        if(tabla[0][0].equals(l)&& tabla[1][1].equals(l)&& tabla[2][2].equals(l))
            return true;
         return (tabla[0][2].equals(l)&& tabla[1][1].equals(l) && tabla[2][0].equals(l));
    }


    public void escribir(int f,int c){
        tabla[f][c]=getLetra();
    }

    public String getLetra(){
        return this.letra;
    }

    public void setLetra(String l){
        this.letra=l;
    }

    public Game getJuegoActual(){
        return juegoActual;
    }

    public void setJuegoActual(Game g){
        juegoActual=g;
    }

    public boolean isTurno(){
        return this.turno;
    }

    public  void setTurno(){
        if(turno){
            turno=false;
            setLetra("0");
            setTurnoPlayer("Jugador 2 -> 0");
        }
        else{
            turno = true;
            setLetra("X");
            setTurnoPlayer("Jugador 1 -> X");
        }
    }

    public String getTurnoPlayer(){
        return this.turnoPlayer;
    }

    public void setTurnoPlayer(String t){
        this.turnoPlayer=t;
    }

    public void setTerminado(){
        this.terminado=false;
    }

    public boolean isTerminado(){
        return this.terminado;
    }


}
