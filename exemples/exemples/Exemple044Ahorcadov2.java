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
public class Exemple044Ahorcadov2 {
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
            //Borrar pantalla
            for(int i=0;i<SCROLL;i++){
                System.out.println();
            }   
            
            for(int i=0;i<actual.length;i++){
                System.out.print(actual[i]+" ");
            }
            
            System.out.println("Introduce carácter.  Te quedan  "+intentos+" intentos." );
            switch(intentos) {    
                case 1:
                    System.out.println("|----| ");
                    System.out.println("|    | ");
                    System.out.println("|    O ");
                    System.out.println("|   /|\\ ");
                    System.out.println("|      ");
                    System.out.println("|_______");
                    break;

                case 2:
                    System.out.println("|----| ");
                    System.out.println("|    | ");
                    System.out.println("|    O ");
                    System.out.println("|    | ");
                    System.out.println("|      ");
                    System.out.println("|_______");
                    break;

                case 3:
                    System.out.println("|----| ");
                    System.out.println("|    | ");
                    System.out.println("|    O ");
                    System.out.println("|      ");
                    System.out.println("|      ");
                    System.out.println("|_______");
                    break;

                case 4:
                    System.out.println("|----| ");
                    System.out.println("|    | ");
                    System.out.println("|      ");
                    System.out.println("|      ");
                    System.out.println("|      ");
                    System.out.println("|_______");
                    break;    
                case 5:
                    System.out.println("|-----  ");
                    System.out.println("|      ");
                    System.out.println("|      ");
                    System.out.println("|      ");
                    System.out.println("|      ");
                    System.out.println("|_______");
                    break;        
            }  
            
           
            char car=teclado.next().toUpperCase().charAt(0);
            boolean acertaste=false;
            for(int i=0;i<palabraSecreta.length();i++){
                if((palabraSecreta.charAt(i)==car) && (actual[i]=='_')){
                    actual[i]=car;
                    aciertos++;
                    acertaste=true;
                }
            }
            if(!acertaste){
                intentos--;
            }
            
            if(intentos<=0){
                fin=true;
                System.out.println("No te quedan intentos, has perdido");
                System.out.println("|----| ");
                System.out.println("|    | ");
                System.out.println("|    O ");
                System.out.println("|   /|\\ ");
                System.out.println("|   ! ! ");
                System.out.println("|_______");
                System.out.println("La palabra es "+palabraSecreta.toUpperCase());
            }
            if(aciertos==palabraSecreta.length()){
                System.out.println(palabraSecreta.toUpperCase());
                System.out.println("Felicidades.");       
                fin=true;
            }
            
        }while(!fin);     
    }
}
