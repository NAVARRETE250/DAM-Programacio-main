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
public class Exemple010If {
       public static void main (String[] args) {
        //2 de portes de transporte.
        final float PORTES= 2;
        final float REBAJA= 0.08F;
      
        
        
        //Si menos 30 euros 2 euros de transporte
        final float COMPRA_MIN = 100;
        //Si mayor MAX hay rebaja
        final float COMPRA_MAX = 100;
        Scanner lector = new Scanner(System.in);
        System.out.print("Quin és el preu del producte, en euros? ");
        float preu = lector.nextFloat();
        lector.nextLine();
      
        //Estructura de selecció simple.
        //Si l’expressió avalua true, executa el bloc dins l’if.
        //En cas contrari, ignora’l.
        if (preu < COMPRA_MIN) {
            //PAS 5
            preu = preu + PORTES;
        }else{
            if (preu >= COMPRA_MAX) {
                //PAS 5
                preu = preu - preu*REBAJA;
            } 
        }
        
        //Es lo mismo
       /* if (preu < COMPRA_MIN) {
            //PAS 5
            preu = preu + PORTES;
        }else if (preu >= COMPRA_MAX) {
                //PAS 5
                preu = preu - preu*REBAJA;
        }*/
        
        
        System.out.println("El preu final per pagar és de " + preu + " euros.");
    }
}
