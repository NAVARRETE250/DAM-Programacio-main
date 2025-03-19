/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemples;

/**
 *
 * @author Toni
 */
public class Exemple035OredenaciónSelección {
    public static void main (String[] args) {
        int datos[]={7,8,6,3,9,10,1,2,4,5,0,2};
        for(int i=0;i<datos.length;i++){
            System.out.println("Pos: "+i+" Vale: "+datos[i]);
        }
        
        
        for(int pivote=0;pivote<datos.length-1;pivote++){
            int pequeño=datos[pivote];
            int posPequeño=pivote;
            for(int posicion=pivote+1;posicion<datos.length;posicion++){
               if(pequeño>datos[posicion]){
                   pequeño=datos[posicion];
                   posPequeño=posicion;
               }
            }
            if(pequeño!=datos[pivote]){
                datos[posPequeño]=datos[pivote];
                datos[pivote]=pequeño;
            }
        }
        for(int i=0;i<datos.length;i++){
            System.out.println("Pos: "+i+" Vale: "+datos[i]);
        }
    }
}
