package com.coderhouse.clase05;

public class Gato extends Animal {

    @Override
    public void hacerRuido() {
        System.out.println("El gato maulla");
    }

    public void comer() {
        System.out.println("El gato come ratones");
    }
}