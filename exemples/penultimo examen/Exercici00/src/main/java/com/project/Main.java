package com.project;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    
    // Función que determina si un número es primo
    public static boolean esPrimer(int num) {
        if (num <= 1) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Función que inicializa la lista con números aleatorios
    public static ArrayList<Integer> inicialitzarLlista(int total, int numPrimers) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();
        int contPrimers = 0;

        while (lista.size() < total) {
            int numero = random.nextInt(100);
            lista.add(numero);
            if (esPrimer(numero)) {
                contPrimers++;
            }
            // Asegurarse de tener al menos 'numPrimers' números primos
            if (lista.size() == total - 1 && contPrimers < numPrimers) {
                while (contPrimers < numPrimers) {
                    numero = random.nextInt(100);
                    if (esPrimer(numero)) {
                        lista.add(numero);
                        contPrimers++;
                    }
                }
            }
        }
        return lista;
    }

    // Función que busca los números primos en la lista
    public static ArrayList<Integer> cercaPrimers(ArrayList<Integer> lista) {
        ArrayList<Integer> primos = new ArrayList<>();
        for (int num : lista) {
            if (esPrimer(num)) {
                primos.add(num);
            }
        }
        return primos;
    }

    // Función principal para probar el código
    public static void main(String[] args) {
        ArrayList<Integer> numeros = inicialitzarLlista(20, 10);
        ArrayList<Integer> primers = cercaPrimers(numeros);

        System.out.println("Llista de números: " + numeros);
        System.out.println("Números primers trobats: " + primers);
    }
}
