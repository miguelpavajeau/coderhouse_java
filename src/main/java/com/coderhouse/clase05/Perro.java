package com.coderhouse.clase05;

public class Perro extends Animal{

    private String raza;
    private String color;
    private String nombre;

    public Perro() {

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                super.toString();
    }

    public Perro(String raza, String color, String nombre) {
        this.raza = raza;
        this.color = color;
        this.nombre = nombre;
    }
}
