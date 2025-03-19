package Aprendizaje;

public class Empleado extends Persona {
    private String puesto;

    public Empleado(String nombre, int edad, String puesto) {
        super(nombre, edad);
        this.puesto = puesto;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Puesto: " + puesto);
        System.out.println("------------------------------");

    }
}
