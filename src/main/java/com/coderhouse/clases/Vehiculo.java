package com.coderhouse.clases;

public class Vehiculo {
    private int cantidadRuedas;
    private String color;
    private String marca;
    private float precio;
    private boolean esElectrico;

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public float getPrecio() {
        return precio;
    }

    public boolean isEsElectrico() {
        return esElectrico;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setEsElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }

    public void encender() {
        System.out.println("Encendido");
    }

    public String toString() {
        return "Vehiculos [cantidadRuedas=" + cantidadRuedas + ", color=" + color + ", marca=" + marca + ", precio=" + precio + ", esElectrico=" + esElectrico + "]";
    }

    public Vehiculo() {
        super();
    }
}
