package com.coderhouse;

import java.util.ArrayList;
import java.util.List;

public class Iterator {
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

        Iterator iterator = (Iterator) listaDeColores.iterator();
        while (((java.util.Iterator<?>) iterator).hasNext()) {

        }
    }
}