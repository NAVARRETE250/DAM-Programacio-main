package com.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

public class TestMain {

    @Test
    public void testMainOutput() throws Exception {
        Locale defaultLocale = Locale.getDefault(); // Guarda la configuració regional per defecte
        Locale.setDefault(Locale.US); // Estableix la configuració regional a US

        try {
            String expectedOutput = """
                    La llargada de la frase: 37
                    La subcadena 'Something' en majúscules: SOMETHING
                    Les subcadenes 'Lose' i 'Get' repetides dos cops cada una: LoseLoseGetGet
                    La cadena intercanviant paraules en majúscules i minúscules: GOTTA lose SOMETHING to GET something
                    La subcadena invertida, sense espais, de la part: 'Lose Something To': oTgnihtemoSesoL             
                    """.replace("                    ", "");

            // Redirigeix la sortida estàndard a un flux de sortida
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            PrintStream originalOut = System.out;
            System.setOut(new PrintStream(outContent));

            // Executa el main per a provar la seva sortida
            Main.main(new String[]{});

            // Comprova que la sortida conté el text esperat
            String actualOutput = outContent.toString().replace("\r\n", "\n"); // Normalitza les noves línies
            String diff = TestStringUtils.findFirstDifference(actualOutput, expectedOutput);
            assertTrue(diff.compareTo("identical") == 0, 
                "\n>>>>>>>>>> >>>>>>>>>>\n" +
                diff +
                "<<<<<<<<<< <<<<<<<<<<\n");

            // Restaura els fluxos originals
            System.setOut(originalOut);
        } finally {
            Locale.setDefault(defaultLocale); // Restaura la configuració regional per defecte
        }
    }
}
