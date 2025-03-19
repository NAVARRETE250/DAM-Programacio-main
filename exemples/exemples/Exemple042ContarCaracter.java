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
public class Exemple042ContarCaracter {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in, "ISO-8859-1");
        System.out.println("Ponga frase");
        String frase=teclado.nextLine();
        System.out.println("Ponga carácter: ");
        String sAux=teclado.next();
        
       
        System.out.println("frase: "+frase);
        System.out.println("Caracter: "+sAux.charAt(0));
        
        
        char caracter=sAux.toUpperCase().charAt(0);
        frase=frase.toUpperCase();
        
        int numApariciones=0;
        
        
        for(int i=0;i<frase.length();i++){
            char cAux=frase.charAt(i);
            if(cAux==caracter){
                numApariciones++;
            }
        }
        System.out.println("Ha aparecido "+numApariciones);
    }
}
