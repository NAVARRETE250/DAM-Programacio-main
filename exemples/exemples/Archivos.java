package Aprendizaje;

import java.io.*;

public class Archivos {
    public static void ejecutar() {
        System.out.println("\n--- Ejemplo: Archivos (Lectura y Escritura) ---");

        String ruta = "archivo.txt";

        // Escribir en un archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))) {
            writer.write("Hola, este es un ejemplo de escritura en un archivo.");
            writer.newLine();
            writer.write("¡Aprender Java es genial!");
            System.out.println("Se ha escrito en el archivo correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        // Leer desde un archivo
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            System.out.println("\nContenido del archivo:");
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
