package com.probing.estructurasControl;

public class Exercisejava3 {
    public static void main(String[] args) {

        String [] names = {"Me", "llamo","Esteban"};
        String saludo = "";
        for (int i = 0 ; i < names.length; i++){
            saludo = saludo  + names[i] + " ";
        }

        System.out.println( saludo);
    }
}
