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
public class Exemple043Ahorcado {
     public static void main(String[] args) {
        final int SCROLL=100;
        final int INTENTOS_MAX=5;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ponga la palabra secreta.");
        String palabraSecreta=teclado.next().toUpperCase();
        
        //Borrar pantalla
        for(int i=0;i<SCROLL;i++){
             System.out.println();
        }
        
        int intentos=INTENTOS_MAX;
        int aciertos=0;
        char actual[]=new char[palabraSecreta.length()];
        for(int i=0;i<actual.length;i++){
            actual[i]='_';
        }
        
        boolean fin=false;
        do{
            System.out.println("Introduce carácter.  Te quedan  "+intentos+" intentos." );
            char car=teclado.next().toUpperCase().charAt(0);
            boolean acertaste=false;
            for(int i=0;i<palabraSecreta.length();i++){
                if((palabraSecreta.charAt(i)==car) && (actual[i]=='_')){
                    actual[i]=car;
                    aciertos++;
                    acertaste=true;
                }
                System.out.print(actual[i]+" ");
            }
            System.out.println();
            if(!acertaste){
                intentos--;
            }
            
            if(intentos<=0){
                fin=true;
                System.out.println("No te quedan intentos, has perdido");
            }
            if(aciertos==palabraSecreta.length()){
                System.out.println("Felicidades.");
                fin=true;
            }
        }while(!fin);     
    }
}
