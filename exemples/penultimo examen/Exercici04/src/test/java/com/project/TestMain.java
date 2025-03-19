package com.project;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

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
        String expectedOutput = "Nom: Televisor, Preu: 599.99€, Garantia: 2 anys\n" +
            "Nom: Pa, Preu: 1.5€, Data de caducitat: 2024-05-01\n" +
            "Nom: Smartphone, Preu: 999.99€, Garantia: 1 anys\n" +
            "Nom: Llet, Preu: 0.99€, Data de caducitat: 2023-12-31";
        assertTrue(text.contains(expectedOutput), 
            ">>>>>>>>>> >>>>>>>>>>\n" +
            "El missatge de sortida no coincideix amb l'esperat. \n" +
            "Esperat: \n" + expectedOutput + "\n" + 
            "Obtingut: \n" + text + 
            "<<<<<<<<<<< <<<<<<<<<<\n");
    }

    @Test
    public void testMainValidation() {
        Producte producte = new Producte("Cafè", 3.50);
        // Comprovar getters
        assertEquals("Cafè", producte.getNom(), "El nom del producte no coincideix");
        assertEquals(3.50, producte.getPreu(), "El preu del producte no coincideix");

        // Crear una instància d'Electronica
        Electronica electronica = new Electronica("Televisor", 599.99, 2);
        // Comprovar getters
        assertEquals("Televisor", electronica.getNom(), "El nom de l'electrònica no coincideix");
        assertEquals(599.99, electronica.getPreu(), "El preu de l'electrònica no coincideix");
        assertEquals(2, electronica.getGarantia(), "La garantia de l'electrònica no coincideix");

        // Crear una instància d'Alimentacio
        Alimentacio alimentacio = new Alimentacio("Pa", 1.50, "2024-05-01");
        // Comprovar getters
        assertEquals("Pa", alimentacio.getNom(), "El nom de l'alimentació no coincideix");
        assertEquals(1.50, alimentacio.getPreu(), "El preu de l'alimentació no coincideix");
        assertEquals("2024-05-01", alimentacio.getDataCaducitat(), "La data de caducitat de l'alimentació no coincideix");

        electronica = new Electronica("Televisor", 1200.0, 2);
        alimentacio = new Alimentacio("Poma", 0.5, "2024-01-01");

        // Comprovar que els getters i setters de 'nom' i 'preu' funcionen a través de la herència
        // Test per Electronica
        assertEquals("Televisor", electronica.getNom(), "El getter de 'nom' no funciona correctament a Electronica.");
        assertEquals(1200.0, electronica.getPreu(), "El getter de 'preu' no funciona correctament a Electronica.");

        // Canviar els valors utilitzant setters
        electronica.setNom("Televisor Nou");
        electronica.setPreu(1400.0);

        assertEquals("Televisor Nou", electronica.getNom(), "El setter de 'nom' no funciona correctament a Electronica.");
        assertEquals(1400.0, electronica.getPreu(), "El setter de 'preu' no funciona correctament a Electronica.");

        // Test per Alimentacio
        assertEquals("Poma", alimentacio.getNom(), "El getter de 'nom' no funciona correctament a Alimentacio.");
        assertEquals(0.5, alimentacio.getPreu(), "El getter de 'preu' no funciona correctament a Alimentacio.");

        // Canviar els valors utilitzant setters
        alimentacio.setNom("Pera");
        alimentacio.setPreu(0.6);

        assertEquals("Pera", alimentacio.getNom(), "El setter de 'nom' no funciona correctament a Alimentacio.");
        assertEquals(0.6, alimentacio.getPreu(), "El setter de 'preu' no funciona correctament a Alimentacio.");
    }

    @Test
    public void testMainDefinitsBase() {
        try {
            // Comprovar que els mètodes getNom i getPreu estan definits a Producte
            Method getNom = Producte.class.getMethod("getNom");
            Method getPreu = Producte.class.getMethod("getPreu");

            // Asegurar-se que Electronica i Alimentacio no redefineixen els mètodes
            assertFalse(Electronica.class.getDeclaredMethods().toString().contains(getNom.getName()), "Electronica redefineix getNom");
            assertFalse(Electronica.class.getDeclaredMethods().toString().contains(getPreu.getName()), "Electronica redefineix getPreu");

            assertFalse(Alimentacio.class.getDeclaredMethods().toString().contains(getNom.getName()), "Alimentacio redefineix getNom");
            assertFalse(Alimentacio.class.getDeclaredMethods().toString().contains(getPreu.getName()), "Alimentacio redefineix getPreu");
        } catch (NoSuchMethodException e) {
            fail("El mètode no està definit a la classe base.");
        }
    }

    @Test
    public void testMainPrivateAttributes() {
        // Obtenim tots els camps de la classe 
        Field[] fields = Producte.class.getDeclaredFields();

        // Iterem per cada camp per verificar que sigui privat
        for (Field field : fields) {
            assertTrue(Modifier.isProtected(field.getModifiers()), "El camp " + field.getName() + " (Producte) hauria de ser protected");
        }

        fields = Alimentacio.class.getDeclaredFields();

        // Iterem per cada camp per verificar que sigui privat
        for (Field field : fields) {
            assertTrue(Modifier.isPrivate(field.getModifiers()), "El camp " + field.getName() + " (Alimentacio) hauria de ser privat");
        }

        fields = Electronica.class.getDeclaredFields();

        // Iterem per cada camp per verificar que sigui privat
        for (Field field : fields) {
            assertTrue(Modifier.isPrivate(field.getModifiers()), "El camp " + field.getName() + " (Electronica) hauria de ser privat");
        }

        fields = Inventari.class.getDeclaredFields();

        // Iterem per cada camp per verificar que sigui privat
        for (Field field : fields) {
            assertTrue(Modifier.isPrivate(field.getModifiers()), "El camp " + field.getName() + " (Inventari) hauria de ser privat");
        }
    }
}
