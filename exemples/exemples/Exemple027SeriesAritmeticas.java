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
public class Exemple027SeriesAritmeticas {
    
    public static void main (String[] args) {
        Scanner lector=new Scanner(System.in);
        int inicial=0, salto=0, elementos=0;
        boolean correcto=false;    
        do{
            System.out.println("Ponga valor inicial de la serie aritmética");
            if(lector.hasNextInt()){
                inicial=lector.nextInt();
                correcto=true;
            }  
            lector.nextLine();
        }while(!correcto);
        
        correcto=false;
        do{
            System.out.println("Ponga valor de salto de la serie aritmética");
             if(lector.hasNextInt()){
                salto=lector.nextInt();
                correcto=true;
            }  
            lector.nextLine();
        }while(!correcto);
        
         
        correcto=false; 
        do{
            System.out.println("Ponga elementos a mostrar");
            if(lector.hasNextInt()){
                elementos=lector.nextInt();
                correcto=true;
            }  
            lector.nextLine();
        }while(!correcto);
         
        for(int i=inicial;i<(inicial+(salto*elementos));i+=salto){
            System.out.println(i);
        }
        
      
        
        
        
        
        
        
        
        
        
    
    }
    
    
    
    
    
}
