/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
A)	Introducir número hasta que ponga -1
Los números se guarda en array tamaño TAM=10
Si pongo más de TAM números. Entonces el array incrementa su tamaño en TAM. El nuevo tamaño es TAM + length

B)	Imprime los números del array.
 


*/
package exemples;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Exemple034ArrayCrece {
    public static void main (String[] args) {
        final int TAM=5;
        int tamActual=0;
        int aValores[]=new int[TAM];
        Scanner teclado=new Scanner(System.in);
        int num=0;
        do{
            System.out.println("Ponga valor positivo. -1 para salir");
            if(teclado.hasNextInt()){
                num=teclado.nextInt();
                if(num>=0){
                    aValores[tamActual]=num;
                    tamActual++;
                    if(tamActual>=aValores.length){
                        int aAux[]=new int[aValores.length+TAM];
                        for(int i=0;i<aValores.length;i++){
                            aAux[i]=aValores[i];
                        }
                        aValores=aAux;
                    }
                }
            }
            teclado.nextLine();
        }while(num!=-1);
        
        for(int i=0;i<tamActual;i++){
            System.out.println("El la posición: "+i+" hay el valor: "+aValores[i]);
        }       
    }
}
