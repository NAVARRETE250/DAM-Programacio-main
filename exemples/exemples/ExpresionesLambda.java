package Aprendizaje;

import java.util.*;
import java.util.stream.Collectors;

public class ExpresionesLambda {
    public static void ejecutar() {
        System.out.println("\n--- Ejemplo: Expresiones Lambda y Streams ---");

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filtrar números pares
        System.out.println("\nNúmeros pares:");
        numeros.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);

        // Multiplicar cada número por 2
        System.out.println("\nNúmeros multiplicados por 2:");
        List<Integer> multiplicados = numeros.stream()
            .map(n -> n * 2)
            .collect(Collectors.toList());
        System.out.println(multiplicados);
    }
}
