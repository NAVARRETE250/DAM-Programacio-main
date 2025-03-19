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
public class Exemple016AdivinaNum {
    public static void main (String[] args) {
        //Genera num aleatorio
        int numAleatorio=(int)((Math.random()*9)+1);
        System.out.println("El número aleatorio es "+numAleatorio);
        Scanner lector=new Scanner(System.in);
        int número;
        boolean salir=false;
        do{
            System.out.println("Adivina múmero entre 1 y 10");
            System.out.println("Ponga 0 para salir");
            número=lector.nextInt(); 
            if(número==0){
                salir=true;
            }else{
                if(número==numAleatorio){
                    System.out.println("Acertaste");
                    salir=true;
                }else{
                    System.out.println("Fallaste");
                }
            }    
        }while(!salir);
        System.out.println("Fin");
    }
}
