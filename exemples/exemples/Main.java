package Aprendizaje;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Clases y Objetos");
            System.out.println("2. Encapsulamiento");
            System.out.println("3. Herencia");
            System.out.println("4. Polimorfismo");
            System.out.println("5. Interfaces");
            System.out.println("6. Clases Abstractas");
            System.out.println("7. Sobrecarga de Métodos");
            System.out.println("8. Manejo de Excepciones");
            System.out.println("9. Arrays");
            System.out.println("10. Fechas y Hora");
            System.out.println("11. Archivos (Lectura/Escritura)");
            System.out.println("12. Colecciones de Java");
            System.out.println("13. Expresiones Lambda y Streams");
            System.out.println("14. Concurrencia (Threads)");
            System.out.println("15. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ClasesYObjetos.ejecutar(); // Llama a un método en otra clase
                    break;
                case 2:
                    Encapsulamiento.ejecutar();
                    break;
                case 3:
                    Herencia.ejecutar();
                    break;
                    case 4:
                    Polimorfismo.ejecutar();
                    break;
                case 5:
                    Interfaces.ejecutar();
                    break;
                case 6:
                    ClasesAbstractas.ejecutar();
                    break;
                case 7:
                    SobrecargaMetodos.ejecutar();
                    break;
                case 8:
                    ManejoExcepciones.ejecutar();
                    break;
                    case 9:
                    ArraysEjemplos.ejecutar();
                    break;
                    case 10:
                    FechasYHora.ejecutar();
                    break;
                    case 11:
                    Archivos.ejecutar();
                    break;
                case 12:
                    Colecciones.ejecutar();
                    break;
                case 13:
                    ExpresionesLambda.ejecutar();
                    break;
                case 14:
                    Concurrencia.ejecutar();
                    break;
                case 15:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
    
            }
        }

        scanner.close();
    }
}

