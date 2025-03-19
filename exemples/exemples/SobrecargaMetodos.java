package Aprendizaje;

public class SobrecargaMetodos {
    public static void ejecutar() {
        System.out.println("\n--- Ejemplo: Sobrecarga de Métodos ---");

        Calculadora calculadora = new Calculadora();
        System.out.println("Suma de 2 números: " + calculadora.sumar(4, 5));
        System.out.println("Suma de 3 números: " + calculadora.sumar(4, 5, 6));
        System.out.println("------------------------------");

    }
}

class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;

    }
}
