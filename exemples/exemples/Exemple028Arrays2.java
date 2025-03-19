/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemples;

/**
 *
 * @author Alumno
 */
public class Exemple028Arrays2 {
      public static void main (String[] args) {
          int notas[]={7,10,3,4,10,5,6,10,8,9};
         // char nombres[]={'a','b','c','d','e','f','g','h','i','j'};
          String nombres[]={"Pablo","Joan","Pep","Nil","Pol","Pau","Joel","Pi","Ana","Maria"};
          for(int i=0;i<10;i++){
              if(notas[i]==10){
                  System.out.println("El 10 lo ha sacado "+nombres[i]);
                  i=10; //Para sacar sólo primer elemento con 10
              }
          }        
      }
}
