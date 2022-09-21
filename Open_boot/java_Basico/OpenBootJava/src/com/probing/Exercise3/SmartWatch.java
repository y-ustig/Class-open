package com.probing.Exercise3;

public class SmartWatch {

    // 1 atributos

    boolean connect;
    SmartPhone smartPhone;


    // 2 contructor

    public SmartWatch (){

    }

    public SmartWatch(SmartPhone smartPhone, boolean connect){

        this.smartPhone = smartPhone;
        this.connect = connect;


    }

    // 3 metodos
    public void whatchAndPhone (boolean connect){

        this.connect = connect;


    }
}




