package Aprendizaje;

public class ClasesAbstractas {
    public static void ejecutar() {
        System.out.println("\n--- Ejemplo: Clases Abstractas ---");

        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("------------------------------");

    }
}

// Clase abstracta
abstract class Figura {
    public abstract double calcularArea();
}

// Subclases que implementan el método abstracto
class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Figura {
    private double ancho, alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
