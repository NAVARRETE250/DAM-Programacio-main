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
public class Exemple037ArrayBidimensional {
    public static void main (String[] args) {
        int tabla[][]=new int[6][11];
        
        for(int tablaDel=0;tablaDel<tabla.length;tablaDel++){
            for(int por=0;por<tabla[0].length;por++){
                tabla[tablaDel][por]=tablaDel*por;
            }
        }
        
         for(int tablaDel=0;tablaDel<tabla.length;tablaDel++){
            for(int por=0;por<tabla[0].length;por++){
                System.out.println(tablaDel+" * "+por+" = "+tabla[tablaDel][por]);
            }
        }    
    }
}
