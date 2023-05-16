package org.duolingo.lista;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import java.util.Set;

public class Lista {

    private Map<String, Set<String>> diccionario = new HashMap<>();

    // Metodo para añadir Palabras
    public void anadirPalabra(String palabra) {
        palabra = palabra.toLowerCase().trim();
        String inicial = palabra.substring(0, 1);
        if (diccionario.containsKey(inicial)) {
            Set<String> palabrasAlmacenadas = diccionario.get(inicial);
            palabrasAlmacenadas.add(palabra);
            System.out.println("Se ha añadido correctamente");
        } else {
            Set<String> listaDePalabrasNuevas = new HashSet<>();
            listaDePalabrasNuevas.add(palabra);
            System.out.println("Se ha añadido correctamente");
            diccionario.put(inicial, listaDePalabrasNuevas);
        }
    }

    // Metodo para eliminar Palabras
    public void eliminarPalabra(String palabra) {
        palabra = palabra.toLowerCase().trim();
        String inicial = palabra.substring(0, 1);
        if (diccionario.containsKey(inicial)) {
            Set<String> palabraAlmacenadas = diccionario.get(inicial);
            palabraAlmacenadas.remove(palabra);
            if (palabraAlmacenadas.size() == 0) {
                diccionario.remove(inicial);
            }
            System.out.println("Se ha eliminado");
        } else {
            System.out.println("No existe la palabra");
        }
    }

    // Metodo para encontrar la Palabra
    public void encontrarPalabra(String palabra) {
        palabra = palabra.toLowerCase().trim();
        String inicial = palabra.substring(0, 1);
        if (diccionario.containsKey(inicial)) {
            Set<String> palabrasAlmacenadas = diccionario.get(inicial);
            if (palabrasAlmacenadas.contains(palabra)) {
                System.out.println("Existe la palabra");
            } else {
                System.out.println("No existe");
            }
        } else {
            System.out.println("La inicial no existe");
        }
    }

    // Metodo para mostrar iniciales
    public void mostrarIniciales() {
        System.out.println("Estan son las iniciales que tiene alguna palabra");
        System.out.println(diccionario.keySet());
    }

    // Metodo para mostrar las palabras
    public void mostrarPalabras(String palabra) {
        if (diccionario.containsKey(palabra)) {
            Set<String> palabrasAlmacenadas = diccionario.get(palabra);
            if (palabrasAlmacenadas.size() != 0) {
                System.out.println("Aqui tiene sus palabras: ");
                System.out.println(palabrasAlmacenadas);
            } else {
                System.out.println("No existe ninguna palabra registrada con esta inicial");
            }
        } else {
            System.out.println("No existe la inicial");
        }
    }

}
