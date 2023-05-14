package org.duolingo.lista;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import java.util.Set;

public class Lista {

    private Map<String, Set<String>> diccionario = new HashMap<>();

    public void anadirPalabra(String palabra) {
        String inicial = palabra.substring(0, 1);
        palabra = palabra.toLowerCase().trim();
        if (diccionario.containsKey(inicial)) {
            Set<String> palabrasAlmacenadas = diccionario.get(inicial);
            palabrasAlmacenadas.add(palabra);
            diccionario.put(inicial, palabrasAlmacenadas);
        } else {
            Set<String> listaDePalabrasNuevas = new HashSet<>();
            listaDePalabrasNuevas.add(palabra);
            diccionario.put(inicial, listaDePalabrasNuevas);
        }
        System.out.println(diccionario);
    }

    public void eliminarPalabra(String palabra) {
        String inicial = palabra.substring(0, 1);
        palabra = palabra.toLowerCase().trim();
        if (diccionario.containsKey(inicial)) {
            Set<String> palabraAlmacenadas = diccionario.get(inicial);
            palabraAlmacenadas.remove(palabra);
            diccionario.remove(inicial, palabra);
        } else {
            System.out.println("Hola");
        }
        System.out.println(diccionario);
    }

    public void encontrarPalabra(String palabra) {
        String inicial = palabra.substring(0, 1);
        palabra = palabra.toLowerCase().trim();
        if (diccionario.containsKey(inicial)) {
            Set<String> palabrasAlmacenadas = diccionario.get(inicial);
            if (palabrasAlmacenadas.contains(palabra)) {
                System.out.println("Existe la palabra");
            } else {
                System.out.println("No existe");
            }
        }
    }

    public void mostrarIniciales() {
        System.out.println(diccionario.keySet());
    }

    public void mostrarPalabras(String palabra) {
        if (diccionario.containsKey(palabra)) {
            Set<String> palabrasAlmacenadas = diccionario.get(palabra);
            if (palabrasAlmacenadas.size() != 0) {
                System.out.println(palabrasAlmacenadas);
            } else {
                System.out.println("No existe ninguna palabra registrada con esta inicial");
            }
        }
    }

}
