/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemples;

import java.util.Scanner;

/**
 *
 * @author Toni
 */
public class Exemple048bTemperaturasSinGlobales {
    public static final int MAX_TEMPERATURAS=20;
   // public static float temperaturas[]=new float[MAX_TEMPERATURAS];
   // public static int temperaturasIntroducidas=0;

    
    public static void main(String[] args) {
   
        float temperaturas[]=new float[MAX_TEMPERATURAS];
        int temperaturasIntroducidas=0;
        
        do{
            imprimirMenú();
            temperaturasIntroducidas=opciones(temperaturas, 
                    temperaturasIntroducidas);
        }while(temperaturasIntroducidas!=-1);   
        System.out.println("gracias por su visita.");
        
    }
    
    public static int opciones(float temperaturas[],int 
            temperaturasIntroducidas){
        int opción=introducirOpción(0, 3);
        switch(opción) {
            case 1:
                temperaturasIntroducidas=entrarTemperaturas(temperaturas, 
                        temperaturasIntroducidas);
                break;
            case 2:
                mostrarTemperaturaMedia(temperaturas, 
                        temperaturasIntroducidas);
                break;
            case 3:
                mostrarTemperaturaMaxima(temperaturas, 
                        temperaturasIntroducidas);
                break;
            case 0:
                return -1;
            }
        return temperaturasIntroducidas;
    }    
    
    public static int entrarTemperaturas(float temperaturas[],int 
            temperaturasIntroducidas){
        boolean fi=false;
        temperaturasIntroducidas=0;
        Scanner teclado=new Scanner(System.in);
        do{
            System.out.println("Ponga las temperaturas, x para finalizar");
            if(teclado.hasNextFloat()){
                if(temperaturasIntroducidas<temperaturas.length){
                    temperaturas[temperaturasIntroducidas]=teclado.nextFloat();
                    temperaturasIntroducidas++;
                }else{
                    System.out.println("Memoria agotada");
                }    
            }else{      
                if(teclado.next().equals("x")){
                    System.out.println("Datos introducidos correctamente.");
                    fi=true;  
                }else{
                    System.out.println("Valor no correcto.");
                }
            }    
        }while(!fi);
        return temperaturasIntroducidas;
    }
    
    
    public static int introducirOpción(int min, int max){
        boolean fi=false;
        Scanner teclado=new Scanner(System.in);
        int opció=0;
        do{
            if(teclado.hasNextInt()){
                opció=teclado.nextInt();
                if(opció>=min && opció<=max){
                    fi=true;
                }else{
                    System.out.println("El valor tiene que ser un entero entre "
                        +min+" y "+max);
                }
            }else{
                System.out.println("El valor tiene que ser un entero entre "
                    +min+" y "+max);
            } 
            teclado.nextLine();
        }while(!fi);
        return opció;
    }
    
    public static void mostrarTemperaturaMedia(float temperaturas[],int 
            temperaturasIntroducidas){
        float media;
        float suma=0;
        for(int i=0;i<temperaturasIntroducidas;i++){
            suma+=temperaturas[i];
        }
        media=suma/temperaturasIntroducidas;
        System.out.println("La media es: "+media);
        espera(2000);
    }
    
    public static void mostrarTemperaturaMaxima(float temperaturas[],int 
            temperaturasIntroducidas){
        float maxima=temperaturas[0];
       
        for(int i=0;i<temperaturasIntroducidas;i++){
            if(temperaturas[i]>maxima){
                maxima=temperaturas[i];
            }
        }
        System.out.println("La máxima es: "+maxima);
        espera(2000);
        
    }
    
    public static void espera(int ms){
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(2*1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void imprimirMenú(){
        System.out.println("Benvingut al registre de tempetarures.");
        System.out.println("--------------------------------------");
        System.out.println("1) Registrar temperaturas.");
        System.out.println("2) Consultar media.");
        System.out.println("3) Consultar temperatura máxima.");
        System.out.println("0) Salir.");
        System.out.println("escoja opción 0 a 3");
    }    
}
