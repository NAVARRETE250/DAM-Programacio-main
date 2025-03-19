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
public class Exemple036OrdenacioBombolla {
    public static void main (String[] args) {
        int datos[]={7,8,6,3,9,10,1,2,4,5,0,2};
        for(int i=0;i<datos.length;i++){
            System.out.println("Pos: "+i+" Vale: "+datos[i]);
        }
        
        boolean ordenado;
        int pase=0;
        do{
            ordenado=true;
            for(int i=0;i<datos.length-pase-1;i++){
                if(datos[i]>datos[i+1]){
                    int aux=datos[i];
                    datos[i]=datos[i+1];
                    datos[i+1]=aux;
                    ordenado=false;
                }    
            }
            pase++;  
        }while(ordenado==false);
        
        for(int i=0;i<datos.length;i++){
            System.out.println("Pos: "+i+" Vale: "+datos[i]);
        }
    }    
}
