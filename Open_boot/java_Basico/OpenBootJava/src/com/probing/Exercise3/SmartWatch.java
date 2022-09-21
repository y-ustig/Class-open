package com.probing.Exercise3;

public class SmartWatch extends SmartDevice{

    // 1 atributos

    boolean connect;

    // 2 contructor

    public SmartWatch (){
         /* la aplicación utiliza super para referirse a una variable local en un método y a una variable de la superclase que tiene el mismo nombre.
        El programa también utiliza super para invocar al constructor de la superclase desde en constructor de la subclase.
        LA super clase en este caso es SmartDevice
         */
        super ();

    }

    public SmartWatch(int peso, String model, int price, String color, boolean waterproof, boolean connect){
        super(peso, model, price, color, waterproof);
        this.connect = connect;

    }

    // 3 metodos
    public void whatchAndPhone (boolean connect){

        this.connect = connect;

    }

    //el metodo toString se genera realizando clic izquierdo, da clic en la palabra generar, seleccion to string
    // y luego seleccionas todo lo que aparece


    @Override
    public String toString() {
        return "com.probing.Exercise3.SmartWatch{" +
                "peso=" + peso +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", waterproof=" + waterproof +
                ", connect=" + connect +
                '}';
    }
}




