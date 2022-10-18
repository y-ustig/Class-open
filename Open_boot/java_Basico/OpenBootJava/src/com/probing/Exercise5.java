package com.probing;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Exercise5 {

    /*
          escribe el código que devuelva una cadena al revés.
     */
public static class cadenatoreves{
    public static void main (String[]args){

        boolean ok = false;
        char letra;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Escribe algo");
            try {
                String text = sc.next();
                for (int i = text.length() - 1; i >= 0; i--) {
                    letra = text.charAt(i);
                    System.out.print(letra);
                    ok = true;
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("Debes diligenciar palabras nada mas");
            }
        } while (!ok);

        System.out.println("**************************** Ejercicio 1**********************");
    }
}

/*
Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
 */
public static class arreglo{

    public static void main(String[] args) {


         String numeros []= {"camilo","Susan","MIguel","Beatriz","Steban","Se acabo"};

         for(String NUmber : numeros){

             System.out.println(NUmber);
         }

        System.out.println("**************************** Ejercicio 2 **********************");
    }

}
/*
    Crea un array bidimensionaldimensional de enteros y recórrelo, mostrando únicamente sus valores.
 */
    public static class bidi{
    public static void main(String[] args) {

        int arraybidi [][]= new int [2][3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arraybidi.length; i++){
            System.out.println("Estas en el primer array en la pocision " + i + " del array bidimensional");
            for(int j = 0; j < arraybidi[i].length; j++){
                System.out.println("ingresa un numero para la posición " +j+ "del segundo array");
                arraybidi[i][j] =sc.nextInt();
            }

        }

        for (int i = 0; i < arraybidi.length; i++){
            for(int j = 0; j < arraybidi[i].length; j++){
                System.out.println("este es el valor que tiene " + arraybidi[i][j]);
            }

        }

        System.out.println("**************************** Ejercicio 3 **********************");
    }

    }
/*
Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado fina
 */
    public static  class vector1{

    public static void main(String[] args) {

        Vector <String> vector = new Vector();
        vector.add("Camila");
        vector.add("Sofia");
        vector.add("Victoria");
        vector.add("Esperanza");
        vector.add("Fe");

        for (String i : vector){

            System.out.println(i);
        }

        vector.remove(4);
        vector.remove(1);


        for (String e : vector){

            System.out.println(e);
        }

        System.out.println("**************************** Ejercicio 4 **********************");

        /*
        El problema de crear un vector con el tamaño normal, significa un gran aumento computacional, debido a que la
        maquina lo que esta haciendo es copiando la información y sobrecopiando para aumentar hasta el tamaño requerido.
         */
    }
}
/*
  Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
 */
    public static class ListaArreglos {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();
        System.out.println("Cuantos datos deseas ingresar");
        Scanner sc = new Scanner(System.in);
        Scanner scx = new Scanner(System.in);
        Scanner scu = new Scanner(System.in);
        int datosUser = scx.nextInt();


        System.out.println("ingrese los datos");

        for (int i = 0; i < datosUser; i++){
            lista.add(sc.nextInt());
        }
        System.out.println(lista);


        System.out.println("con que divide deseas eliminar");
        int NUMBER = scu.nextInt();

        for (int i = 0; i < lista.size(); i++){

            int numero = lista.get(i);
            if (numero % NUMBER == 0){
                lista.remove(i);
                i = i - 1;
            }

            else{
                i = i;
            }
        }
        System.out.println(lista);

        System.out.println("**************************** Ejercicio 5 **********************");

    }
}

/*

 */




}

