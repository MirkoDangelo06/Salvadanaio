package com.example;

public class Persona extends Thread{
    private Cestino c;
    private int moneta;


    public Persona(Cestino c, int moneta){
        this.c = c;
        this.moneta = moneta;
    }

    @Override
    public void run() {
        for (int i = 0 ; i < moneta; i++){
            c.aggiungimoneta();
        }
    }




    
}
