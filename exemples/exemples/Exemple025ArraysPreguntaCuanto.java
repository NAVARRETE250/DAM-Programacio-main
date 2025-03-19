/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Exemple025ArraysPreguntaCuanto {
    public static void main (String[] args) {
        Scanner lector=new Scanner(System.in);
        int tamaño=0;
        boolean sortir=false;
        do{
            
            System.out.println("Ponga el número de valores a introducir");
            if(lector.hasNextInt()){        
                tamaño=lector.nextInt();
                sortir=true;
            }
            lector.nextLine();
        }while(!sortir);
        
        double valores[]=new double[tamaño]; 
        for(int i=0;i<valores.length;i++){
             System.out.println("Ponga el valor "+(i+1));
             if(lector.hasNextDouble()){
                valores[i]=lector.nextDouble();
             }else{
                 i--;
                 System.out.println("Valor no válido");
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
