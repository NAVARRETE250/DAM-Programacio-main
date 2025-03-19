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
public class Exemple014DoWhile {
      public static void main (String[] args) {
          Scanner lector=new Scanner(System.in);
          int número;
          do{
              System.out.println("Ponga 0 para salir");
              número=lector.nextInt(); 
          }while(número!=0);
          System.out.println("Fin");
      }
}
