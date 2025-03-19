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
public class Exemple032HistogramaAleatorio {
    public static void main (String[] args) {
        int histograma[]=new int[11];
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ponga veces que quiere generar nº aleatorio"); 
        int numCops=0;
        do{
            if(teclado.hasNextInt()){
                numCops=teclado.nextInt();
            }
            teclado.nextLine();
        }while(numCops<=0);    
        for(int i=0;i<numCops;i++){
            int num=(int)(Math.random()*11);
            histograma[num]++;
        }
        for(int i=0;i<histograma.length;i++){
            System.out.println(i+" ----> "+histograma[i]);
        }
        
        
    }
}
