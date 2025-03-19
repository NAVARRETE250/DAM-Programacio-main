package Aprendizaje;

public class Encapsulamiento {
    public static void ejecutar() {
        System.out.println("\n--- Ejemplo: Encapsulamiento ---");

        Persona persona = new Persona("Lucía", 28);

        // Usando getters y setters
        System.out.println("Nombre inicial: " + persona.getNombre());
        persona.setEdad(35);
        System.out.println("Edad actualizada: " + persona.getEdad());
        System.out.println("------------------------------");

    }
}
