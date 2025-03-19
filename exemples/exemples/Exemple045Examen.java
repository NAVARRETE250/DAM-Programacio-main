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
public class Exemple045Examen {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        boolean salir=false;
        int tamaño=0;
        final int NUM=7;
        do{
            System.out.println("Ponga tamaño de la matriz cuadrada");
            if(teclado.hasNextInt()){
                tamaño=teclado.nextInt();
                if(tamaño>=1){
                   salir=true;
                }
            }    
            teclado.nextLine();
        }while(!salir);

        int matriz[][]=new int[tamaño][tamaño]; 
        int num=NUM;
        for(int fila=0;fila<tamaño;fila++){
            for(int columna=0;columna<tamaño;columna++){
                matriz[fila][columna]=num;
                num++;
            }
        }

        for(int fila=0;fila<tamaño;fila++){
            for(int columna=0;columna<tamaño;columna++){
                System.out.print(matriz[fila][columna]+" ");
            }
            System.out.println();
        }  
        
        int matriz2[][]=new int[tamaño][tamaño]; 
        
        for(int fila=0;fila<tamaño;fila++){
            for(int columna=0;columna<tamaño;columna++){
                matriz2[fila][columna]=matriz[columna][fila];
            }
        }
        
        for(int fila=0;fila<tamaño;fila++){
            for(int columna=0;columna<tamaño;columna++){
                System.out.print(matriz2[fila][columna]+" ");
            }
            System.out.println();
        }  
        
        
    }
}
