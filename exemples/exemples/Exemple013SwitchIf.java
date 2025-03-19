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
public class Exemple013SwitchIf {
       public static void main (String[] args) {
        Scanner lector = new Scanner(System.in);

        //PAS 1 i 2
        System.out.print("Quin número de mes vols analitzar [1−12]? ");
        int mes = lector.nextInt();
        lector.nextLine();

        //PAS 3
        System.out.print("Els dies d’aquest mes deuen ser...");
        if(mes==2){
            System.out.println("Febrero");
            System.out.println("28 o 29!");
        }
        if(mes==4){
            System.out.println("Abril");
        }
        if((mes==4)||(mes==6)||(mes==9)||(mes==11)){
             System.out.println("30!");
        }
        if(mes==1){
             System.out.println("Enero");
             System.out.println("31!");
        }
        if((mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
             System.out.println("31!");
        }
        if((mes<1)||(mes>12)){
            System.out.println("Aquest mes no existeix!");
        }

    }
    
}
