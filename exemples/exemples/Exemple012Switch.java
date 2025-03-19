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
public class Exemple012Switch {
    public static void main (String[] args) {
        Scanner lector = new Scanner(System.in);

        //PAS 1 i 2
        System.out.print("Quin número de mes vols analitzar [1−12]? ");
        int mes = lector.nextInt();
        lector.nextLine();

        //PAS 3
        System.out.print("Els dies d’aquest mes deuen ser...");
        switch(mes) {
            //PAS I
            case 2:
                System.out.println("Febrero");
                System.out.println("28 o 29!");
                break;
                //PAS II
            case 4:
                System.out.println("Abril");
            case 6:
            case 9:
            case 11:
                System.out.println("30!");
                break;
            //PAS III
            case 1:
                System.out.println("Enero");
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31!");
                break;
            default:
                System.out.println("Aquest mes no existeix!");
            }
    }
}
