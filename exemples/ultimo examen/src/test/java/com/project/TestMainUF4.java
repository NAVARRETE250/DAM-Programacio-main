package com.project;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.github.stefanbirkner.systemlambda.SystemLambda;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

public class TestMainUF4 {

    private static double score = 0.0;

    @AfterAll
    public static void printScore() {
        System.out.println("----- Puntuació: [" + score + "] -----");
    }

    @Test
    public void testMainOutput() throws Exception {
        try {
            System.setProperty("environment", "test");

            String text = SystemLambda.tapSystemOut(() -> {
                // Executa el main per a provar la seva sortida
                String[] args = {}; // Passa els arguments necessaris si n'hi ha
                MainUF4.main(args);
            });
            text = text.replace("\r\n", "\n");

            // Comprova que la sortida conté el text esperat
            String expectedOutput = """
                Totes les botigues:
                Botiga{nom='Zara', ubicacio='Planta 1'}
                Botiga{nom='McBurger', ubicacio='Planta 2'}
                Botiga{nom='H&M', ubicacio='Planta 1'}
                Botiga{nom='MediaMarkt', ubicacio='Planta 2'}
                Botiga{nom='Fnac', ubicacio='Planta 3'}
                
                Botigues de Roba:
                Botiga{nom='Zara', ubicacio='Planta 1'}
                Botiga{nom='H&M', ubicacio='Planta 1'}
                
                Botigues de Menjar:
                Botiga{nom='McBurger', ubicacio='Planta 2'}
                
                Botigues d'Electrònica:
                Botiga{nom='MediaMarkt', ubicacio='Planta 2'}
                Botiga{nom='Fnac', ubicacio='Planta 3'}
                
                Botigues a la Planta 2:
                Botiga{nom='McBurger', ubicacio='Planta 2'}
                Botiga{nom='MediaMarkt', ubicacio='Planta 2'}
                
                Original: BotigaRoba{nom='Zara', tipusRoba='Moda', ubicacio='Planta 1'}
                Modificat: BotigaRoba{nom='Zara', tipusRoba='Alta Moda', ubicacio='Planta 1'}
                
                Original: BotigaMenjar{nom='McBurger', tipusMenjar='Fast Food', ubicacio='Planta 2'}
                Modificat: BotigaMenjar{nom='McBurger', tipusMenjar='Gourmet Fast Food', ubicacio='Planta 2'}
                """.replace("\r\n", "\n").replace("            ","");
            
            String diff = TestStringUtils.findFirstDifference(text, expectedOutput);

            assertTrue(diff.compareTo("identical") == 0, 
                "\n>>>>>>>>>> >>>>>>>>>>\n" +
                diff +
                "<<<<<<<<<< <<<<<<<<<<\n");

                score += 0.5;
        } catch (AssertionError e) {
            System.err.println("Test failed: testMainOutput");
            throw e;
        }
    }

    @Test
    public void testCreacioBotigues() {
            try {
            BotigaRoba botigaRoba = new BotigaRoba("Zara", "Planta 1", "Moda");
            BotigaMenjar botigaMenjar = new BotigaMenjar("McDonald's", "Planta 2", "Fast Food");
            BotigaElectronica botigaElectronica = new BotigaElectronica("MediaMarkt", "Planta 3", "Electrònica");

            assertEquals("Zara", botigaRoba.getNom());
            assertEquals("Planta 1", botigaRoba.getUbicacio());
            assertEquals("Moda", botigaRoba.getTipusRoba());

            assertEquals("McDonald's", botigaMenjar.getNom());
            assertEquals("Planta 2", botigaMenjar.getUbicacio());
            assertEquals("Fast Food", botigaMenjar.getTipusMenjar());

            assertEquals("MediaMarkt", botigaElectronica.getNom());
            assertEquals("Planta 3", botigaElectronica.getUbicacio());
            assertEquals("Electrònica", botigaElectronica.getMarcaPrincipal());
            score += 0.5;
        } catch (AssertionError e) {
            System.err.println("Test failed: testCreacioBotigues");
            throw e;
        }
    }

    @Test
    public void testAfegirBotigues() {
            try {
            CentreComercial centreComercial = new CentreComercial();
            BotigaRoba botigaRoba = new BotigaRoba("Zara", "Planta 1", "Moda");
            BotigaMenjar botigaMenjar = new BotigaMenjar("McDonald's", "Planta 2", "Fast Food");
            BotigaElectronica botigaElectronica = new BotigaElectronica("MediaMarkt", "Planta 3", "Electrònica");

            centreComercial.afegirBotiga(botigaRoba);
            centreComercial.afegirBotiga(botigaMenjar);
            centreComercial.afegirBotiga(botigaElectronica);

            List<Botiga> botigues = centreComercial.getBotigues();
            assertEquals(3, botigues.size());
            assertTrue(botigues.contains(botigaRoba));
            assertTrue(botigues.contains(botigaMenjar));
            assertTrue(botigues.contains(botigaElectronica));
            score += 1.0;
        } catch (AssertionError e) {
            System.err.println("Test failed: testAfegirBotigues");
            throw e;
        }
    }

    @Test
    public void testClassificacioBotigues() {
            try {
            CentreComercial centreComercial = new CentreComercial();
            centreComercial.afegirBotiga(new BotigaRoba("Zara", "Planta 1", "Moda"));
            centreComercial.afegirBotiga(new BotigaMenjar("McDonald's", "Planta 2", "Fast Food"));
            centreComercial.afegirBotiga(new BotigaRoba("H&M", "Planta 1", "Moda"));
            centreComercial.afegirBotiga(new BotigaElectronica("MediaMarkt", "Planta 3", "Electrònica"));

            List<BotigaRoba> botiguesRoba = centreComercial.getBotiguesRoba();
            assertEquals(2, botiguesRoba.size());

            List<BotigaMenjar> botiguesMenjar = centreComercial.getBotiguesMenjar();
            assertEquals(1, botiguesMenjar.size());

            List<BotigaElectronica> botiguesElectronica = centreComercial.getBotiguesElectronica();
            assertEquals(1, botiguesElectronica.size());
            score += 0.5;
        } catch (AssertionError e) {
            System.err.println("Test failed: testClassificacioBotigues");
            throw e;
        }
    }

    @Test
    public void testBotiguesPerUbicacio() {
            try {
            CentreComercial centreComercial = new CentreComercial();
            centreComercial.afegirBotiga(new BotigaRoba("Zara", "Planta 1", "Moda"));
            centreComercial.afegirBotiga(new BotigaMenjar("McDonald's", "Planta 2", "Fast Food"));
            centreComercial.afegirBotiga(new BotigaRoba("H&M", "Planta 1", "Moda"));
            centreComercial.afegirBotiga(new BotigaElectronica("MediaMarkt", "Planta 3", "Electrònica"));

            List<Botiga> botiguesPlanta1 = centreComercial.getBotiguesPerUbicacio("Planta 1");
            assertEquals(2, botiguesPlanta1.size());

            List<Botiga> botiguesPlanta3 = centreComercial.getBotiguesPerUbicacio("Planta 3");
            assertEquals(1, botiguesPlanta3.size());
            score += 0.5;
        } catch (AssertionError e) {
            System.err.println("Test failed: testBotiguesPerUbicacio");
            throw e;
        }
    }

    @Test
    public void testSetters() {
            try {
            BotigaRoba botigaRoba = new BotigaRoba("Zara", "Planta 1", "Moda");
            botigaRoba.setTipusRoba("Alta Moda");
            assertEquals("Alta Moda", botigaRoba.getTipusRoba());

            BotigaMenjar botigaMenjar = new BotigaMenjar("McDonald's", "Planta 2", "Fast Food");
            botigaMenjar.setTipusMenjar("Gourmet Fast Food");
            assertEquals("Gourmet Fast Food", botigaMenjar.getTipusMenjar());

            BotigaElectronica botigaElectronica = new BotigaElectronica("MediaMarkt", "Planta 3", "Electrònica");
            botigaElectronica.setMarcaPrincipal("Tech Products");
            assertEquals("Tech Products", botigaElectronica.getMarcaPrincipal());
            score += 1.0;
        } catch (AssertionError e) {
            System.err.println("Test failed: testSetters");
            throw e;
        }
    }

    @Test
    public void testMainCalls() throws Exception {
            try {
            // Validació de la classe CentreComercial
            Class<CentreComercial> centreComercialClass = CentreComercial.class;
            assertMethod(centreComercialClass, "afegirBotiga", false, false, "Error amb la definició de la funció afegirBotiga.", Botiga.class);
            assertMethod(centreComercialClass, "getBotigues", false, false, "Error amb la definició de la funció getBotigues.");
            assertMethod(centreComercialClass, "getBotiguesRoba", false, false, "Error amb la definició de la funció getBotiguesRoba.");
            assertMethod(centreComercialClass, "getBotiguesMenjar", false, false, "Error amb la definició de la funció getBotiguesMenjar.");
            assertMethod(centreComercialClass, "getBotiguesElectronica", false, false, "Error amb la definició de la funció getBotiguesElectronica.");
            assertMethod(centreComercialClass, "getBotiguesPerUbicacio", false, false, "Error amb la definició de la funció getBotiguesPerUbicacio.", String.class);

            // Validació de les subclasses de Botiga
            assertClassExtends(BotigaRoba.class, Botiga.class);
            assertClassExtends(BotigaMenjar.class, Botiga.class);
            assertClassExtends(BotigaElectronica.class, Botiga.class);

            // Validació dels mètodes de les subclasses
            assertMethod(BotigaRoba.class, "getTipusRoba", false, false, "Error amb la definició de la funció getTipusRoba.");
            assertMethod(BotigaRoba.class, "setTipusRoba", false, false, "Error amb la definició de la funció setTipusRoba.", String.class);
            assertMethod(BotigaRoba.class, "descripcioDetallada", false, false, "Error amb la definició de la funció descripcioDetallada.");

            assertMethod(BotigaMenjar.class, "getTipusMenjar", false, false, "Error amb la definició de la funció getTipusMenjar.");
            assertMethod(BotigaMenjar.class, "setTipusMenjar", false, false, "Error amb la definició de la funció setTipusMenjar.", String.class);
            assertMethod(BotigaMenjar.class, "descripcioDetallada", false, false, "Error amb la definició de la funció descripcioDetallada.");

            assertMethod(BotigaElectronica.class, "getMarcaPrincipal", false, false, "Error amb la definició de la funció getMarcaPrincipal.");
            assertMethod(BotigaElectronica.class, "setMarcaPrincipal", false, false, "Error amb la definició de la funció setMarcaPrincipal.", String.class);
            assertMethod(BotigaElectronica.class, "descripcioDetallada", false, false, "Error amb la definició de la funció descripcioDetallada.");
            score += 1.0;
        } catch (AssertionError e) {
            System.err.println("Test failed: testMainCalls");
            throw e;
        }
    }

    private void assertClassExtends(Class<?> subClass, Class<?> superClass) {
        assertTrue(superClass.isAssignableFrom(subClass), subClass.getName() + " no extén de " + superClass.getName());
    }

    private void assertMethod(Class<?> clazz, String methodName, boolean shouldBeStatic, boolean shouldBePrivate, String message, Class<?>... parameterTypes) throws NoSuchMethodException {
        // Utilitza getDeclaredMethod per accedir a mètodes privats
        Method method = clazz.getDeclaredMethod(methodName, parameterTypes);
    
        // Comprova si el mètode és estàtic
        boolean isStatic = Modifier.isStatic(method.getModifiers());
        assertEquals(shouldBeStatic, isStatic, message + " El mètode hauria de ser " + (shouldBeStatic ? "static" : "no static") + ".");
    
        // Comprova si el mètode és privat
        boolean isPrivate = Modifier.isPrivate(method.getModifiers());
        assertEquals(shouldBePrivate, isPrivate, message + " El mètode hauria de ser " + (shouldBePrivate ? "privat" : "no privat") + ".");
    }
}
