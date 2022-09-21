package com.probing.Exercise3;

public class SmartPhone extends SmartDevice{

    // 1 atributos
    int minutewaterproof;

    // 2 contructor

    public SmartPhone (){
        /* la aplicación utiliza super para referirse a una variable local en un método y a una variable de la superclase que tiene el mismo nombre.
        El programa también utiliza super para invocar al constructor de la superclase desde en constructor de la subclase.
        LA super clase en este caso es SmartDevice
         */
        super ();
    }

    public SmartPhone( int peso, String model, int price, String color, boolean waterproof,int minutewaterproof ){
        super(peso, model, price, color, waterproof);

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

    @Override
    public String toString() {
        return "com.probing.Exercise3.SmartPhone{" +
                "peso=" + peso +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", waterproof=" + waterproof +
                ", minutewaterproof=" + minutewaterproof +
                '}';
    }
}
