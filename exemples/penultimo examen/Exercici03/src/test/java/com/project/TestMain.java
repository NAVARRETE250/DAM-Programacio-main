package com.project;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

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
        String expectedOutput = "Enviant SMS a 987654321\n" + 
            "Enviant SMS a 123456789\n" + 
            "Enviant Email a usuari@example.com\n" + 
            "Enviant Notificació Push a usuariPush\n" + 
            "Enviant Email a usuari@ieti.cat";
        assertTrue(text.contains(expectedOutput), 
            ">>>>>>>>>> >>>>>>>>>>\n" +
            "El missatge de sortida no coincideix amb l'esperat. \n" +
            "Esperat: \n" + expectedOutput + "\n" + 
            "Obtingut: \n" + text + 
            "<<<<<<<<<<< <<<<<<<<<<\n");
    }

    @Test
    public void testMainValidation() throws Exception {

        // Validar getters i setters
        NotificacioEmail email = new NotificacioEmail("example@example.com", 1);
        assertEquals("example@example.com", email.getDestinatari(), "El destinatari de NotificacioEmail no coincideix");
        assertEquals(1, email.getPrioritat(), "La prioritat de NotificacioEmail no coincideix");

        email.setDestinatari("nouemail@example.com");
        email.setPrioritat(2);
        assertEquals("nouemail@example.com", email.getDestinatari(), "El setter del destinatari de NotificacioEmail no funciona correctament");
        assertEquals(2, email.getPrioritat(), "El setter de la prioritat de NotificacioEmail no funciona correctament");

        NotificacioSMS sms = new NotificacioSMS("123456789", 2);
        assertEquals("123456789", sms.getDestinatari(), "El destinatari de NotificacioSMS no coincideix");
        assertEquals(2, sms.getPrioritat(), "La prioritat de NotificacioSMS no coincideix");

        sms.setDestinatari("987654321");
        sms.setPrioritat(1);
        assertEquals("987654321", sms.getDestinatari(), "El setter del destinatari de NotificacioSMS no funciona correctament");
        assertEquals(1, sms.getPrioritat(), "El setter de la prioritat de NotificacioSMS no funciona correctament");

        NotificacioPush push = new NotificacioPush("usuariPush", 3);
        assertEquals("usuariPush", push.getDestinatari(), "El destinatari de NotificacioPush no coincideix");
        assertEquals(3, push.getPrioritat(), "La prioritat de NotificacioPush no coincideix");

        push.setDestinatari("nouUsuariPush");
        push.setPrioritat(4);
        assertEquals("nouUsuariPush", push.getDestinatari(), "El setter del destinatari de NotificacioPush no funciona correctament");
        assertEquals(4, push.getPrioritat(), "El setter de la prioritat de NotificacioPush no funciona correctament");

        // Validar ordenacio 0
        email = new NotificacioEmail("usuari@example.com", 3);
        sms = new NotificacioSMS("123456789", 1);
        push = new NotificacioPush("usuariPush", 2);

        List<Notificacio> notificacions = new ArrayList<>();
        notificacions.add(email);
        notificacions.add(sms);
        notificacions.add(push);

        Notificacio.ordenaPerPrioritat(notificacions);

        assertTrue(notificacions.get(0).equals(sms), "SMS hauria de ser la primera notificació");
        assertTrue(notificacions.get(1).equals(push), "Push hauria de ser la segona notificació");
        assertTrue(notificacions.get(2).equals(email), "Email hauria de ser la tercera notificació");

        // Validar ordenacio 1
        NotificacioEmail email1 = new NotificacioEmail("email1@example.com", 5);
        NotificacioSMS sms1 = new NotificacioSMS("111111111", 3);
        NotificacioPush push1 = new NotificacioPush("pushUser1", 4);
        NotificacioEmail email2 = new NotificacioEmail("email2@example.com", 1);
        NotificacioSMS sms2 = new NotificacioSMS("222222222", 2);
        NotificacioPush push2 = new NotificacioPush("pushUser2", 6);

        notificacions = new ArrayList<>();
        notificacions.add(email1);
        notificacions.add(sms1);
        notificacions.add(push1);
        notificacions.add(email2);
        notificacions.add(sms2);
        notificacions.add(push2);

        Notificacio.ordenaPerPrioritat(notificacions);

        assertEquals(email2, notificacions.get(0), "Email2 hauria de ser el primer");
        assertEquals(sms2, notificacions.get(1), "SMS2 hauria de ser el segon");
        assertEquals(sms1, notificacions.get(2), "SMS1 hauria de ser el tercer");
        assertEquals(push1, notificacions.get(3), "Push1 hauria de ser el quart");
        assertEquals(email1, notificacions.get(4), "Email1 hauria de ser el cinquè");
        assertEquals(push2, notificacions.get(5), "Push2 hauria de ser el sisè");
    }

    @Test
    public void testMainPrivateAttributes() {
        // Obtenim tots els camps de la classe Cotxe
        Field[] fields = Notificacio.class.getDeclaredFields();

        // Iterem per cada camp per verificar que sigui privat
        for (Field field : fields) {
            assertTrue(Modifier.isProtected(field.getModifiers()), "El camp " + field.getName() + " (Notificacio) hauria de ser protected");
        }

        fields = NotificacioEmail.class.getDeclaredFields();

        // Iterem per cada camp per verificar que sigui privat
        for (Field field : fields) {
            assertTrue(Modifier.isPrivate(field.getModifiers()), "El camp " + field.getName() + " (NotificacioEmail) hauria de ser privat");
        }

        fields = NotificacioPush.class.getDeclaredFields();

        // Iterem per cada camp per verificar que sigui privat
        for (Field field : fields) {
            assertTrue(Modifier.isPrivate(field.getModifiers()), "El camp " + field.getName() + " (NotificacioPush) hauria de ser privat");
        }

        fields = NotificacioSMS.class.getDeclaredFields();

        // Iterem per cada camp per verificar que sigui privat
        for (Field field : fields) {
            assertTrue(Modifier.isPrivate(field.getModifiers()), "El camp " + field.getName() + " (NotificacioSMS) hauria de ser privat");
        }
    }
}
