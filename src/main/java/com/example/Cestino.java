package com.example;

public class Cestino {
    private int contatore;

    public int getContatore() {
        return contatore;
    }

    public Cestino(int contatore){
        this.contatore = contatore;
    }

    public void aggiungimoneta(){
        contatore = contatore +1;
    }
    



}
