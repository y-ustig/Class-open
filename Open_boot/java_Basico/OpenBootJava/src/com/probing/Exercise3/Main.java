package com.probing.Exercise3;

public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone(14,"samsung",800000, "verde",false,0);
        SmartWatch watch = new SmartWatch(14,"apple",400000,"rojo",true,true);
        System.out.println( "el telefono es " + phone);
        System.out.println( "el reloj es " + watch);
        watch.whatchAndPhone(false);
        phone.resiswaterproof(30);
        System.out.println( "el reloj es " + watch);
        System.out.println( "el telefono es " + phone);

    }
}
