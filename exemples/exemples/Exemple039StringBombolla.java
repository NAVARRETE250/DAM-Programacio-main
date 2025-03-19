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
public class Exemple039StringBombolla {
    public static void main (String[] args) {
        String datos[]={"hola","ñoño","éxito","adeu","mama","papa","Pepito","me","quiere","pegar","don",
            "mesa","lunes","martes"};
        for(int i=0;i<datos.length;i++){
            System.out.println("Pos: "+i+" Vale: "+datos[i]);
        }
        
        boolean ordenado;
        int pase=0;
        do{
            ordenado=true;
            for(int i=0;i<datos.length-pase-1;i++){
                if(datos[i].compareToIgnoreCase(datos[i+1])>0){
                    String aux=datos[i];
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
