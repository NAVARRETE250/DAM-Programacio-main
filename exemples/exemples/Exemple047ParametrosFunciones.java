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
public class Exemple047ParametrosFunciones {
    public static int m=3;              //Emular variable global
    public static void main(String[] args) {
        int a=1;
        System.out.println(" Antes de la función "+a);
        modificaA(a);
        System.out.println(" Después de la función "+a);
        
        String s="hola";
        System.out.println(" Antes de la función "+s);
        modificaS(s);
        System.out.println(" Después de la función "+s);
        
        System.out.println(" Antes de la función "+s);
        s=modifica2S(s);
        System.out.println(" Después de la función "+s);
        
        int array[]={1,2};
        System.out.println(" Antes de la función "+array[0]+" "+array[1]);
        modificaArray(array);
        System.out.println(" después de la función "+array[0]+" "+array[1]);
    }
    
    public static void modificaArray(int arr[]){
        arr[0]=24;   
        System.out.println(" Dentro de la función "+arr[0]+" "+arr[1]);
    }
    
    public static String modifica2S(String s){
        s="adeu";
        System.out.println(" Dentro la función "+s);
        System.out.println(" *****Dentro la función "+m);
        return s;
        
        
    }
    
    public static void modificaS(String s){
        s="adeu";
        System.out.println(" Dentro la función "+s);
    }
    
    
    public static void modificaA(int a){
        a=23;
        System.out.println(" Dentro la función "+a);        
    }
 
}
