package com.coderhouse;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> listaDeColores = new ArrayList<>();
        List<String> listaDeColoresNueva = new ArrayList<>();

        listaDeColores.add("Rojo");
        listaDeColores.add("Verde");
        listaDeColores.add("Azul");
        listaDeColores.add("Amarillo");
        listaDeColores.add("Rosa");
        listaDeColores.add("Naranja");
        listaDeColores.add("Marron");
        listaDeColores.add("Negro");
        listaDeColores.add("Blanco");

        listaDeColoresNueva.addAll(listaDeColores);
        listaDeColoresNueva.add("Violeta");
        listaDeColoresNueva.add("Gris");
        listaDeColoresNueva.add("Cafe");

        System.out.println("Esta es la lista de colores");
        for (String color : listaDeColores) {
            System.out.println("El color es : " + color);
        }

        System.out.println("Esta es la lista de colores nueva");
        for (String color : listaDeColoresNueva) {
            System.out.println("El color es : " + color);
        }

        listaDeColores.remove(0);
        System.out.println("Esta es la lista despues de remover el primer elemento.");
        for (String color : listaDeColores) {
            System.out.println("El color es : " + color);
        }

        listaDeColores.clear();
        if (listaDeColores.isEmpty() == true) {
            System.out.println("La lista esta vacia");
        } else {
            System.out.println("La lista no esta vacia");
        }
    }
}