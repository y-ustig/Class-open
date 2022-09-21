package com.probing.Exercise3;

public class SmartPhone {

    // 1 atributos

    int peso;
    String model;
    int price;
    String color;
    boolean waterproof;
    int minutewaterproof;

    // 2 contructor

    public SmartPhone (){

    }

    public SmartPhone(int peso, String model, int price, String color, boolean waterproof, int minutewaterproof ){

        this.peso = peso;
        this.model = model;
        this.price = price;
        this.color = color;
        this.waterproof=waterproof;
        this.minutewaterproof = minutewaterproof;


    }

    // 3 metodos
    public int resiswaterproof (int quantyminute){

        if ( waterproof == true){
            this.minutewaterproof += quantyminute;
            return minutewaterproof;
        }

        else {

            return 0;
        }


    }
}
