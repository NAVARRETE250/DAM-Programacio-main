package com.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @Test
    public void comptarParaules() {
        Main instancia = new Main();
        assertEquals(19, instancia.comptarParaules("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        assertEquals(0, instancia.comptarParaules(""));
        assertEquals(1, instancia.comptarParaules("Hola"));
    }

    @Test
    public void comptarRepeticions() {
        Main instancia = new Main();
        assertEquals(2, instancia.comptaRepeticions("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "dolor"));
        assertEquals(1, instancia.comptaRepeticions("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "elit"));
        assertEquals(0, instancia.comptaRepeticions("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "xyz"));
        assertEquals(1, instancia.comptaRepeticions("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "elit"));
        assertEquals(2, instancia.comptaRepeticions("Això és una prova, una senzilla prova.", "una"));
    }

    @Test
    public void invertirCadena() {
        Main instancia = new Main();
        assertEquals("aloh", instancia.invertirCadena("hola"));
        assertEquals("", instancia.invertirCadena(""));
        assertEquals("amet ,tile gnicsipida rutetcesnoc ,tema tis rolod muspi meroL", instancia.invertirCadena("Lorem ipsum dolor sit amet, consectetur adipiscing elit, tema"));
    }

    @Test
    public void paraulaMesLlarga() {
        Main instancia = new Main();
        assertEquals("consectetur", instancia.paraulaMesLlarga("Lorem ipsum dolor sit amet, consectetur adipiscing elit,"));
        assertEquals("Lorem", instancia.paraulaMesLlarga("Lorem"));
        assertEquals("", instancia.paraulaMesLlarga(""));
        assertEquals("reprehenderit", instancia.paraulaMesLlarga("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));
    }
}