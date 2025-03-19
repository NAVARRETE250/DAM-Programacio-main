package Aprendizaje;

import java.util.*;

public class Colecciones {
    public static void ejecutar() {
        System.out.println("\n--- Ejemplo: Colecciones en Java ---");

        // HashMap
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Manzana", 10);
        mapa.put("Banana", 5);
        mapa.put("Cereza", 20);

        System.out.println("\nHashMap (Clave -> Valor):");
        for (String clave : mapa.keySet()) {
            System.out.println(clave + " -> " + mapa.get(clave));
        }

        // HashSet
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("Java"); // No se agregará porque ya existe

        System.out.println("\nHashSet (sin duplicados):");
        for (String lenguaje : conjunto) {
            System.out.println(lenguaje);
        }

        // LinkedList
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Primero");
        lista.add("Segundo");
        lista.add("Tercero");

        System.out.println("\nLinkedList (ordenada):");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}
