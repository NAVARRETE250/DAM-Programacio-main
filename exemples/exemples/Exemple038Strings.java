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
public class Exemple038Strings {
    public static void main (String[] args) {
        System.out.println("han enviado "+args.length+" argumentos");
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
        
        String ss1="hola";
        String ss2="hola";
        if(ss1.equals(ss2)){
            System.out.println("Iguales");
        }else{
            System.out.println("Diferentes");
        }
        
        String s1=new String();
        System.out.println(s1);
        Scanner lector=new Scanner(System.in);
        s1=lector.next();
        System.out.println(s1);
        lector.nextLine();
        s1=lector.nextLine();
        System.out.println(s1);
        
    }
}
