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

 //Un programa que indica la nota en text a partir de la numèrica.
public class Exemple011ElseIf {
    public static void main (String[] args) {
        Scanner lector = new Scanner(System.in);
        //PAS 1 i 2
        System.out.print("Quina nota has tret? ");
        float nota = lector.nextFloat();
        lector.nextLine();
        //PAS 3
        //Estructura de selecció múltiple.
        //S’entra al bloc on la condició lògica avaluï a true.
        //Si cap no ho fa, s’entra al bloc else.
        System.out.print("La teva nota final és ");
        if ((nota >= 9)&&(nota <= 10)) {
            //PAS I
            System.out.println("Excel·lent.");
        } else { 
            if ((nota >= 6.5)&&(nota < 9)) {
                //PAS II
                System.out.println("Notable.");
            } else { 
                if ((nota >= 5)&&(nota < 6.5)) {
                    //PAS III
                    System.out.println("Aprovat.");
                } else {
                    //PAS IV
                    System.out.println("Suspès.");
                }
            }    
        }
        System.out.println("Espero que hagi anat bé...");
    }
}






