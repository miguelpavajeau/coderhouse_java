package com.coderhouse.clase05;

public class Animal {
    // generar los atributos extinto, edad, genero. Y el metodo comer.
    private String clase;
    private boolean extinto;
    private int edad;
    private String genero;

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public boolean isExtinto() {
        return extinto;
    }

    public void setExtinto(boolean extinto) {
        this.extinto = extinto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "clase='" + clase + '\'' +
                ", extinto=" + extinto +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }

    public void comer() {
        System.out.println("El animal esta comiendo");
    }

    public void hacerRuido() {
        System.out.println("El animal esta haciendo ruido");
    }

    public void dormir() {
        System.out.println("El animal esta durmiendo");
    }

    public void moverse() {
        System.out.println("El animal esta moviendose");
    }

    

}

