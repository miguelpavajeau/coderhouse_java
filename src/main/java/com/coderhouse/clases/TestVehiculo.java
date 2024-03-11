package com.coderhouse.clases;

public class TestVehiculo {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setCantidadRuedas(4);
        vehiculo.setMarca("Ford");
        vehiculo.setColor("Rojo");;
        vehiculo.setPrecio(2500);
        vehiculo.setEsElectrico(true);
        System.out.println(vehiculo);
        System.out.println("Enciende el auto?");
        vehiculo.encender();
    }
}
