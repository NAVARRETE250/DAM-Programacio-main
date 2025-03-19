package Aprendizaje;

public class ClasesYObjetos {
    public static void ejecutar() {
        System.out.println("\n--- Ejemplo: Clases y Objetos ---");

        Persona persona1 = new Persona("Ana", 25);
        Persona persona2 = new Persona("Carlos", 30);

        persona1.mostrarInformacion();
        persona2.mostrarInformacion();
        System.out.println("------------------------------");

    }
}
