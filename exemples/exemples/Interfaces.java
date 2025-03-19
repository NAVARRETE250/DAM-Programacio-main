package Aprendizaje;

public class Interfaces {
    public static void ejecutar() {
        System.out.println("\n--- Ejemplo: Interfaces ---");

        Animal perro = new Perro();
        perro.hacerSonido(); // Llama al método definido en la interfaz
    }
}

// Interfaz
interface Animal {
    void hacerSonido();
}

// Implementación
class Perro implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau guau!");
        System.out.println("------------------------------");

    }
}
