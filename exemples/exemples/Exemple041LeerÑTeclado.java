/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemples;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Exemple041LeerÑTeclado {
    public static void main (String[] args) {
        Scanner tecladoEN= new Scanner (System.in);
        System.out.println("Ponga frase con ñ ");
        String s1=tecladoEN.nextLine();
        System.out.println("Ha puesto: "+s1);
        
        
        Scanner tecladoES= new Scanner (System.in, "ISO-8859-1");
        System.out.println("Ponga frase con ñ ");
        String s2=tecladoES.nextLine();
        System.out.println("Ha puesto: "+s2);
        
    }
}
