package Aprendizaje;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class FechasYHora {
    public static void ejecutar() {
        System.out.println("\n--- Ejemplo: Fechas y Hora ---");

        // Obtener la fecha actual (sin hora)
        LocalDate fechaActual = LocalDate.now();
        // Obtener la hora actual (sin fecha)
        LocalTime horaActual = LocalTime.now();
        // Obtener fecha y hora actual
        LocalDateTime fechaHoraActual = LocalDateTime.now();

        // Mostrar la fecha y hora actuales
        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("Hora actual: " + horaActual);
        System.out.println("Fecha y hora actual: " + fechaHoraActual);

        // Formatear la fecha a un formato específico
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Fecha formateada: " + fechaHoraActual.format(formato));

        // Realizar operaciones con fechas y horas
        LocalDate fechaFutura = fechaActual.plusDays(5);  // Sumar 5 días
        LocalTime horaFutura = horaActual.plusHours(3);   // Sumar 3 horas
        LocalDateTime fechaHoraFutura = fechaHoraActual.plusWeeks(2);  // Sumar 2 semanas

        System.out.println("\nFecha 5 días en el futuro: " + fechaFutura);
        System.out.println("Hora 3 horas en el futuro: " + horaFutura);
        System.out.println("Fecha y hora 2 semanas en el futuro: " + fechaHoraFutura);

        // Restar fechas (ejemplo: cuántos días hay entre dos fechas)
        long diasEntre = ChronoUnit.DAYS.between(fechaActual, fechaFutura);
        System.out.println("\nDías entre la fecha actual y la fecha futura: " + diasEntre);

        // Manejo de zonas horarias
        ZoneId zonaHoraria = ZoneId.of("America/New_York");
        ZonedDateTime horaZona = ZonedDateTime.now(zonaHoraria); // Hora en la zona horaria especificada
        System.out.println("\nHora en la zona horaria 'America/New_York': " + horaZona);
    }
}

