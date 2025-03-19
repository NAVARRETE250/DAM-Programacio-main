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
public class Exemple022Array {
     public static void main (String[] args) {
         Scanner lector=new Scanner(System.in);
         final int TAM=5;
         int valores[]=new int[TAM];
         for(int i=0;i<valores.length;i++){
             System.out.println("Ponga número");
             valores[i]=lector.nextInt();
         }
         
         for(int i=0;i<valores.length;i++){
             System.out.println("El elemento "+(i+1)+" vale "+valores[i]);
         }
     }
}
