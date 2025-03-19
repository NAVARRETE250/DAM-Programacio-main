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
public class Exemple040MatriuDiagonal {
    public static void main (String[] args) {
        Scanner lector=new Scanner(System.in);
        boolean sortir=false;
        int columnas=0, filas=0;
        System.out.println("Ponga Columnas");
        do{
            if(lector.hasNextInt()){
                int aux=lector.nextInt();
                if(aux>0){
                    columnas=aux;
                    sortir=true;
                }        
            }
            lector.nextLine();    
        }while(sortir==false);
        
        System.out.println("Ponga Filas");
        sortir=false;
        do{
            if(lector.hasNextInt()){
                int aux=lector.nextInt();
                if(aux>0){
                    filas=aux;
                    sortir=true;
                }        
            }
            lector.nextLine();
        }while(sortir==false);
        System.out.println("Matriz de "+columnas+" columnas y "+filas+" filas");
        
        int matriz[][]=new int [filas][columnas];
        
        for(int f=0;f<filas;f++){
            for(int c=0;c<columnas;c++){
                matriz[f][c]=0;
                System.out.print(matriz[f][c]);
            }
            System.out.println();
        }
       
        System.out.println();
       
        for(int f=0;f<filas;f++){
            for(int c=0;c<columnas;c++){
                if(f==c){
                    matriz[f][c]=1;
                }
                System.out.print(matriz[f][c]);
            }
            System.out.println();
        }
        
        
        
        
        
        
        
    }
    
}
