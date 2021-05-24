
package arreglos_ejercicios;

import java.util.Scanner;


public class ejer14 {

    
    public static void main(String[] args) {
        int j,i,k;
        boolean creciente1=true, creciente2=true;
        int[] serie1 = new int[10];
        int[] serie2 = new int[10];
        int[] serietotal = new int[20];
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("INGRESANDO ELEMENTOS DE LA SERIE 1");
            for(i=0;i<10;i++){
                System.out.print(i+"-. Ingrese el valor del elemento de la serie 1: ");
                serie1[i]=entrada.nextInt();
                
                

               
            }
            for(i=0;i<9;i++){
                if(serie1[i]<serie1[i+1]){
                    creciente1=true;
                    
                }
                if(serie1[i]>serie1[i+1]){
                    creciente1=false;
                    break;
                }
            }
            if(creciente1==false){
                System.out.println("ERROR EN UNA DE LAS SERIES TIENE QUE COLOCAR LOS ELEMENTOS EN FORMA CRECIENTE!!! ");
            }
        }while(creciente1==false);
        
        do{
            
            
            System.out.println("INGRESANDO ELEMENTOS DE LA SERIE 2");
            for(i=0;i<10;i++){
               

                System.out.print(i+"-. Ingrese el valor del elemento de la serie 2: ");
                serie2[i]=entrada.nextInt();
                
            }

            for(i=0;i<9;i++){
                if(serie2[i]<serie2[i+1]){
                    creciente2=true;
                    
                }
                if(serie2[i]>serie2[i+1]){
                    creciente2=false;
                }
                
            }
            if(creciente2==false){
                System.out.println("ERROR EN UNA DE LAS SERIES TIENE QUE COLOCAR LOS ELEMENTOS EN FORMA CRECIENTE!!! ");
            }
            
        }while(creciente2==false);  

        i=0;
        j=0;
        k=0;
        
        while(i<10 && j<10){
            if(serie1[i]<serie2[j]){
                serietotal[k]=serie1[i];
                
                i++;
            }
            else{
                serietotal[k]=serie2[j];
                j++;
            }
            k++;    
        }
        if(i==10){
            while(j<10){
                serietotal[k]=serie2[j];
                j++;
                k++;
            }
        }
        else{
            while(i<10){
                serietotal[k]=serie1[i];
                i++;
                k++;
            }
        }
        
        System.out.println("MOSTRANDO TODOS LOS VALORES: ");
        for(i=0;i<20;i++){
            System.out.print(serietotal[i]+" ");
        }
        
        
        
    }
    
}
