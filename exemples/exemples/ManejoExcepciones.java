package Aprendizaje;

public class ManejoExcepciones {
    public static void ejecutar() {
        System.out.println("\n--- Ejemplo: Manejo de Excepciones ---");

        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
            System.out.println("------------------------------");

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
            System.out.println("------------------------------");

        }
    }

    public static int dividir(int a, int b) {
        return a / b;

    }
}
