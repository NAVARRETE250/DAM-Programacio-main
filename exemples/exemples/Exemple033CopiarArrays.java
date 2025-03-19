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
public class Exemple033CopiarArrays {
     public static void main (String[] args) {
         int a[]={1,2,3,4,5,6,7,8,9,10};
         int b[]=new int[10];
         
         for(int i=0;i<a.length;i++){
             b[i]=a[i];
         }
         for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
         }  
         a[0]=24;
         
         
         a=b;
         
         for(int i=0;i<b.length;i++){
             System.out.println(b[i]);
         }  
     }
}
