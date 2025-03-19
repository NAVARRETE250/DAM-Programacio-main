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
public class Exemple026ValoresIndefinidosArray {
    public static void main (String[] args) {
        final int TAM_MAX=10;
        Scanner lector=new Scanner(System.in);
        int tamaño=0;
        double valores[]=new double[TAM_MAX];
        boolean finalizar=false;
        do{
            System.out.println("Ponga el valor "+(tamaño+1)); 
            System.out.println("s o S para salir"); 
            if(lector.hasNextDouble()){
                valores[tamaño]=lector.nextDouble();
                tamaño++;
            }else{
                char leido=(char)lector.next().charAt(0);
                if(leido=='s'||leido=='S'){
                    finalizar=true;
                }else{
                    System.out.println("Valor no válido");
                }
            }
            lector.nextLine(); 
            if(tamaño==TAM_MAX){
                finalizar=true;
                System.out.println("Excedido el límite del programa: "+TAM_MAX);
            }
        }while(!finalizar);      
        double sumaAcumulada=0;
        for(int i=0;i<tamaño;i++){
            System.out.println("El elemento "+(i+1)+" vale "+valores[i]);
            sumaAcumulada+=valores[i];
        }
        System.out.println("La suma acumulada es: "+sumaAcumulada);
        System.out.println("La media es: "+(sumaAcumulada/tamaño));
     }
}
