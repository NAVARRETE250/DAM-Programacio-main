package Aprendizaje;

public class Concurrencia {
    public static void ejecutar() {
        System.out.println("\n--- Ejemplo: Concurrencia (Threads) ---");

        // Crear un Thread usando la clase Thread
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1: Iniciando tarea...");
            try {
                Thread.sleep(2000);  // Simula una tarea que tarda 2 segundos
            } catch (InterruptedException e) {
                System.out.println("Thread 1 interrumpido.");
            }
            System.out.println("Thread 1: Tarea completada.");
        });

        // Crear un Thread usando la interfaz Runnable
        Runnable tarea2 = () -> {
            System.out.println("Thread 2: Iniciando tarea...");
            try {
                Thread.sleep(1000);  // Simula una tarea que tarda 1 segundo
            } catch (InterruptedException e) {
                System.out.println("Thread 2 interrumpido.");
            }
            System.out.println("Thread 2: Tarea completada.");
        };

        Thread t2 = new Thread(tarea2);

        // Iniciar los Threads
        t1.start();
        t2.start();

        // Esperar que ambos Threads terminen
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Error al esperar a los Threads.");
        }

        System.out.println("\nAmbos Threads han completado su ejecución.");
    }
}
