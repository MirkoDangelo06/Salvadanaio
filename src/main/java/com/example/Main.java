package com.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");

        Cestino c = new Cestino(0);
        Persona p1 = new Persona(c, 1000);
        Persona p2 = new Persona(c, 1000);

        // starto il run 
        p1.start();
        p2.start();

        // aspetta che i thread abbiano aspettato la fine di essi 
        p1.join();
        p2.join();
        System.out.println(c.getContatore());

    }
}