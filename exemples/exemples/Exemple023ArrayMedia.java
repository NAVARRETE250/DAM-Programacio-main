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
public class Exemple023ArrayMedia {
    public static void main (String[] args) {
         Scanner lector=new Scanner(System.in);
         final int TAM=5;
         double valores[]=new double[TAM];
         for(int i=0;i<valores.length;i++){
             System.out.println("Ponga el valor "+(i+1));
             if(lector.hasNextDouble()){
                valores[i]=lector.nextDouble();
             }else{
                 i--;
                 System.out.println("Valor no válido");
                 //lector.nextLine();
             }
            lector.nextLine();
         }
         double sumaAcumulada=0;
         for(int i=0;i<valores.length;i++){
             System.out.println("El elemento "+(i+1)+" vale "+valores[i]);
             sumaAcumulada+=valores[i];
         }
         System.out.println("La suma acumulada es: "+sumaAcumulada);
         System.out.println("La media es: "+(sumaAcumulada/valores.length));
         
     }
}
