package Aprendizaje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraysEjemplos {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Ejemplo: Arrays ---");

        boolean salir = false;
        while (!salir) {
            System.out.println("\nElige una sección de Arrays:");
            System.out.println("1. Arrays Unidimensionales");
            System.out.println("2. Arrays Multidimensionales");
            System.out.println("3. Ordenación de Arrays");
            System.out.println("4. Búsqueda en Arrays");
            System.out.println("5. ArrayList (dinámico)");
            System.out.println("6. Volver al menú principal");

            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    arraysUnidimensionales();
                    break;
                case 2:
                    arraysMultidimensionales();
                    break;
                case 3:
                    ordenarArrays();
                    break;
                case 4:
                    buscarEnArrays();
                    break;
                case 5:
                    trabajarConArrayList();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }

    // 1. Arrays unidimensionales
    private static void arraysUnidimensionales() {
        System.out.println("\n--- Arrays Unidimensionales ---");
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Elementos del array:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSuma de los elementos:");
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        System.out.println("Suma total: " + suma);
    }

    // 2. Arrays multidimensionales
    private static void arraysMultidimensionales() {
        System.out.println("\n--- Arrays Multidimensionales ---");
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 3. Ordenación de Arrays
    private static void ordenarArrays() {
        System.out.println("\n--- Ordenación de Arrays ---");
        int[] numeros = {5, 1, 4, 2, 3};

        System.out.println("Array original:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        java.util.Arrays.sort(numeros);

        System.out.println("\nArray ordenado:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }

    // 4. Búsqueda en Arrays
    private static void buscarEnArrays() {
        System.out.println("\n--- Búsqueda en Arrays ---");
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.print("¿Qué número quieres buscar?: ");
        Scanner scanner = new Scanner(System.in);
        int buscar = scanner.nextInt();

        boolean encontrado = false;
        for (int numero : numeros) {
            if (numero == buscar) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("¡El número " + buscar + " está en el array!");
        } else {
            System.out.println("El número " + buscar + " no está en el array.");
        }
    }

    // 5. ArrayList (colecciones dinámicas)
    private static void trabajarConArrayList() {
        System.out.println("\n--- ArrayList (Colección Dinámica) ---");
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Cereza");

        System.out.println("Elementos de la lista:");
        for (String elemento : lista) {
            System.out.println("- " + elemento);
        }

        System.out.println("\nAñadiendo un nuevo elemento: Mango");
        lista.add("Mango");

        System.out.println("Lista actualizada:");
        for (String elemento : lista) {
            System.out.println("- " + elemento);
        }

        System.out.println("\nEliminando 'Banana'...");
        lista.remove("Banana");

        System.out.println("Lista después de la eliminación:");
        for (String elemento : lista) {
            System.out.println("- " + elemento);
            
        }


    }
}

