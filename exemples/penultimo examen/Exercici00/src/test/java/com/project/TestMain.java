package com.project;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMain {

    @Test
    public void esPrimer() {
        assertTrue(Main.esPrimer(2), "2 hauria de ser primer.");
        assertTrue(Main.esPrimer(3), "3 hauria de ser primer.");
        assertFalse(Main.esPrimer(4), "4 no hauria de ser primer.");
        assertTrue(Main.esPrimer(5), "5 hauria de ser primer.");
        assertFalse(Main.esPrimer(6), "6 no hauria de ser primer.");
        assertTrue(Main.esPrimer(7), "7 hauria de ser primer.");
        assertFalse(Main.esPrimer(9), "9 no hauria de ser primer (és divisible per 3).");
        assertFalse(Main.esPrimer(1), "1 no hauria de ser considerat primer.");
        assertTrue(Main.esPrimer(29), "29 hauria de ser primer.");
        assertFalse(Main.esPrimer(0), "0 no hauria de ser considerat primer.");
        assertFalse(Main.esPrimer(-7), "-7 no hauria de ser considerat primer.");
        assertTrue(Main.esPrimer(97), "97 hauria de ser primer.");
    }


    @Test
    public void inicialitzarLlista() {
        ArrayList<Integer> llista = Main.inicialitzarLlista(20, 10);
        assertEquals(20, llista.size(), "La llista hauria de tenir 20 elements.");
        
        int comptadorPrimers = 0;
        for (int numero : llista) {
            if (Main.esPrimer(numero)) {
                comptadorPrimers++;
            }
        }
        assertTrue(comptadorPrimers >= 10, "Hauria d'haver almenys 10 nombres primers a la llista.");
        
        // Test amb paràmetres diferents
        ArrayList<Integer> llistaMenysPrimers = Main.inicialitzarLlista(15, 5);
        assertEquals(15, llistaMenysPrimers.size(), "La llista hauria de tenir 15 elements.");

        comptadorPrimers = 0;
        for (int numero : llistaMenysPrimers) {
            if (Main.esPrimer(numero)) {
                comptadorPrimers++;
            }
        }
        assertTrue(comptadorPrimers >= 5, "Hauria d'haver almenys 5 nombres primers a la llista de 15 elements.");
    }


    @Test
    public void cercaPrimers() {
        ArrayList<Integer> llistaBuida = new ArrayList<>();
        ArrayList<Integer> primersBuida = Main.cercaPrimers(llistaBuida);
        assertTrue(primersBuida.isEmpty(), "La llista de primers hauria d'estar buida per una llista buida d'entrada.");

        ArrayList<Integer> llista1 = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 2, 3));
        ArrayList<Integer> primers1 = Main.cercaPrimers(llista1);
        ArrayList<Integer> primersEsperats1 = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 2, 3));
        assertEquals(primersEsperats1, primers1, "La llista de primers no coincideix amb l'esperada incluint repetits.");

        ArrayList<Integer> llista2 = new ArrayList<>(Arrays.asList(14, 15, 16, 17, 18, 19, 20));
        ArrayList<Integer> primers2 = Main.cercaPrimers(llista2);
        ArrayList<Integer> primersEsperats2 = new ArrayList<>(Arrays.asList(17, 19));
        assertEquals(primersEsperats2, primers2, "La llista de primers no coincideix amb l'esperada per nombres més grans.");
        
        ArrayList<Integer> llistaNoPrimers = new ArrayList<>(Arrays.asList(4, 6, 8, 9, 10));
        ArrayList<Integer> primersNoPrimers = Main.cercaPrimers(llistaNoPrimers);
        assertTrue(primersNoPrimers.isEmpty(), "La llista hauria d'estar buida ja que no conté nombres primers.");
    }
}
