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
 
 //Un programa que calcula preu de transport.
 public class Exemple008If {
  
    public static void main (String[] args) {
          //PAS 1
        //2 de portes de transporte.
        final float PORTES= 2;
        //Si menos 30 euros 2 euros de transporte
        final float COMPRA_MIN = 30;
        Scanner lector = new Scanner(System.in);
        //PAS 2 i 3
        System.out.print("Quin és el preu del producte, en euros? ");
        float preu = lector.nextFloat();
        lector.nextLine();
        //PAS 4
        //Estructura de selecció simple.
        //Si l’expressió avalua true, executa el bloc dins l’if.
        //En cas contrari, ignora’l.
        if (preu < COMPRA_MIN) {
            //PAS 5
            preu = preu + PORTES;
        }
        //PAS 5
        System.out.println("El preu final per pagar és de " + preu + " euros.");
    }
 }