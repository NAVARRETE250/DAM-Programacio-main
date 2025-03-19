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
public class Exemple020ForMultiplicar {
    public static void main (String[] args) {
        for(int tabla=0;tabla<=10;tabla++){
            System.out.println("Tabla de multiplicar del "+tabla);
            //for(int i=100;i>=0;i-=5){ // de 100 a 0
            for(int i=0;i<=10;i++){
                System.out.println(tabla+" x "+i+" = "+(i*tabla));
            }
            System.out.println();
        }
        System.out.println("Fin");
    }
}
