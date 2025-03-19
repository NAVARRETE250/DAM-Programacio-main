package com.project;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.github.stefanbirkner.systemlambda.SystemLambda;

public class TestMain {

        @Test
    public void testMainOutput() throws Exception {
        String text = SystemLambda.tapSystemOut(() -> {
            // Executa el main per a provar la seva sortida
            String[] args = {}; // Passa els arguments necessaris si n'hi ha
            Main.main(args);
        });
        text = text.replace("\r\n", "\n");

        // Comprova que la sortida conté el text esperat
        String expectedOutput = "Informació del Cotxe:\n" +
            "Marca: Toyota, Model: Corolla, Any: 2020\n" +
            "Nombre de portes: 4\n\n" +
            "Informació de la Moto:\n" +
            "Marca: Honda, Model: CBR, Any: 2021\n" +
            "Cilindrada: 650cc";
        assertTrue(text.contains(expectedOutput), 
            ">>>>>>>>>> >>>>>>>>>>\n" +
            "El missatge de sortida no coincideix amb l'esperat. \n" +
            "Esperat: \n" + expectedOutput + "\n" + 
            "Obtingut: \n" + text + 
            "<<<<<<<<<<< <<<<<<<<<<\n");
    }

    @Test
    public void testMainValidation() {
        // Test per la classe Vehicle
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 2020);
        assertEquals("Toyota", vehicle.getMarca(), "La marca del vehicle no coincideix");
        assertEquals("Corolla", vehicle.getModel(), "El model del vehicle no coincideix");
        assertEquals(2020, vehicle.getAny(), "L'any del vehicle no coincideix");

        // Test per la classe Cotxe
        Cotxe cotxe = new Cotxe("Toyota", "Corolla", 2020, 4);
        assertEquals("Toyota", cotxe.getMarca(), "La marca del cotxe no coincideix");
        assertEquals("Corolla", cotxe.getModel(), "El model del cotxe no coincideix");
        assertEquals(2020, cotxe.getAny(), "L'any del cotxe no coincideix");
        assertEquals(4, cotxe.getNumPortes(), "El nombre de portes del cotxe no coincideix");

        // Test per la classe Moto
        Moto moto = new Moto("Honda", "CBR", 2021, 650);
        assertEquals("Honda", moto.getMarca(), "La marca de la moto no coincideix");
        assertEquals("CBR", moto.getModel(), "El model de la moto no coincideix");
        assertEquals(2021, moto.getAny(), "L'any de la moto no coincideix");
        assertEquals(650, moto.getCilindrada(), "La cilindrada de la moto no coincideix");
    }

    @Test
    public void testMainPrivateAttributes() {
        Field[] fields = Vehicle.class.getDeclaredFields();

        // Iterem per cada camp per verificar que sigui privat
        for (Field field : fields) {
            assertTrue(Modifier.isProtected(field.getModifiers()), "El camp " + field.getName() + " (Vehicle) hauria de ser protected");
        }

        fields = Cotxe.class.getDeclaredFields();

        // Iterem per cada camp per verificar que sigui privat
        for (Field field : fields) {
            assertTrue(Modifier.isPrivate(field.getModifiers()), "El camp " + field.getName() + " (Cotxe) hauria de ser privat");
        }

        fields = Moto.class.getDeclaredFields();

        // Iterem per cada camp per verificar que sigui privat
        for (Field field : fields) {
            assertTrue(Modifier.isPrivate(field.getModifiers()), "El camp " + field.getName() + " (Moto) hauria de ser privat");
        }
    }
}
