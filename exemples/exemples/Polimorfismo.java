package Aprendizaje;

public class Polimorfismo {
    public static void ejecutar() {
        System.out.println("\n--- Ejemplo: Polimorfismo ---");

        Persona persona = new Persona("Juan", 40);
        Persona empleado = new Empleado("Sofía", 35, "Diseñadora");

        persona.mostrarInformacion();
        empleado.mostrarInformacion(); // Aquí se llama al método sobrescrito en Empleado
        System.out.println("------------------------------");

    }
}
