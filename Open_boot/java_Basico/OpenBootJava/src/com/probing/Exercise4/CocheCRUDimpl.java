package com.probing.Exercise4;

public class CocheCRUDimpl implements CocheCRUD {
    @Override
    public void save( ) {
        System.out.println("hola que paso");
    }

    @Override
    public void findAll() {

    }

    @Override
    public void delete() {

    }

    String save = "GUARDANDO";
    String finAll = "Buscar todos";
    String delete = "Borrar";

    @Override
    public String toString() {
        return "com.probing.Exercise4.CocheCRUDimpl{" +
                "save='" + save + '\'' +
                ", finAll='" + finAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}
