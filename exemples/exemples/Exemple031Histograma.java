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
public class Exemple031Histograma {
    public static void main (String[] args) {
        int notas[]={7,10,3,4,10,5,6,10,8,9};
        int histograma[]={0,0,0,0};
        String nomHistograma[]={"Suspendido","Suficiente","Notable","Excelente"};
        for(int i=0;i<notas.length;i++){
            if(notas[i]<5){
                histograma[0]++;
            }else{ 
                if(notas[i]<7){
                         histograma[1]++;
                }else{  
                    if(notas[i]<9){
                        histograma[2]++;
                    }else{ 
                        histograma[3]++;
                    }             
                }    
            }
        }
        
        for(int i=0;i<histograma.length;i++){
            System.out.println(nomHistograma[i]);
            for(int cops=0;cops<histograma[i];cops++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
