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
 * Hace referencia al enunciado del examen
 * 
 */
public class Exemple046ExamenModularUF2 {
    public static void main(String[] args) {
        final int NUM=7;
        int tamaño=paso1();
        int matriz[][]=paso2y3(tamaño, NUM);
        imprimeMatriz(matriz);
        System.out.println();
        matriz=transponerMatriz(matriz);
        imprimeMatriz(matriz); 
    }     
        
    public static int[][] transponerMatriz(int[][] mat){
        int matriz2[][]=new int[mat.length][mat[0].length]; 
        
        for(int fila=0;fila<mat.length;fila++){
            for(int columna=0;columna<mat[0].length;columna++){
                matriz2[fila][columna]=mat[columna][fila];
            }
        }
        return matriz2;
    }
    
    
    public static void imprimeMatriz(int mat[][]){
        for(int fila=0;fila<mat.length;fila++){
            for(int columna=0;columna<mat[0].length;columna++){
                System.out.print(mat[fila][columna]+"\t");
            }
            System.out.println();
            System.out.println();
        }      
    }
    
    public static int[][] paso2y3(int tam, int num){
        int matriz[][]=new int[tam][tam]; 
        for(int fila=0;fila<tam;fila++){
            for(int columna=0;columna<tam;columna++){
                matriz[fila][columna]=num;
                num++;
            }
        }
        return matriz;
    }
    
    
    public static int paso1(){
        Scanner teclado=new Scanner(System.in);
        boolean salir=false;
        int tamaño=0;
       
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
        return tamaño; 
    }
            
            
         
    /*     
         
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
        
      */  
    
}
