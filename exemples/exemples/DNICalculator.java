import java.util.Scanner;

public class DNICalculator {
    // Tabla de letras para los DNI
    private static final char[] letras = {
        'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
        'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
        'C', 'K', 'E'
    };

    // Método para calcular la letra del DNI
    public char calcularLetra(int dni) {
        int resto = dni % 23;
        return letras[resto];
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase DNICalculator
        DNICalculator calculator = new DNICalculator();
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su DNI
        System.out.print("Introduce tu número de DNI (sin letra): ");
        int dni = scanner.nextInt();

        // Calcular la letra del DNI
        char letra = calculator.calcularLetra(dni);

        // Mostrar el resultado
        System.out.println("La letra del DNI " + dni + " es: " + letra);
        
        // Cerrar el scanner
        scanner.close();
    }
}
