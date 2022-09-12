package com.probing;

public class ExerciseJava2 {

    public static void main(String[] args) {

        int PrecioFinal = PrecioConIva( 1200000);
        System.out.println( "El precio del tv es " + PrecioFinal);
    }

    static int PrecioConIva (int PrecioSinIva){

        int iva = 19 ;
        int precio = ((PrecioSinIva * iva) / 100)+ PrecioSinIva;
        return  precio;
    }
}


