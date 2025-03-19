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
public class Exemple021PongaTabla {
    public static void main (String[] args) {
        Scanner lector=new Scanner(System.in);
        int tabla;
        boolean salir=false;
        do{
            System.out.println("Ponga la tabla que quiere mostrar");
            tabla=lector.nextInt();
            if(tabla>=0){ 
                System.out.println("Tabla de multiplicar del "+tabla);
                for(int i=0;i<=10;i++){
                    System.out.println(tabla+" x "+i+" = "+(i*tabla));
                }
                System.out.println();
            } 
        }while(tabla>=0);
        System.out.println("Fin");
    }
}
