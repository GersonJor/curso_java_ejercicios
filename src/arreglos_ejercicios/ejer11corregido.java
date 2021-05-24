
package arreglos_ejercicios;

import java.util.Scanner;


public class ejer11corregido {

    
    public static void main(String[] args) {
        boolean creciente=true;
        int i,num,j=0,sitio_num=0;
        int[] numeros=new int[10];
        Scanner entrada=new Scanner(System.in);
        
        do{
            for(i=0;i<5;i++){
                System.out.print(i+(".- ingrese el valor del elemento: "));
                numeros[i]=entrada.nextInt();    
            }
            
            for(i=0;i<4;i++){
                if(numeros[i]<numeros[i+1]){
                    creciente=true;
                }
                if(numeros[i]>numeros[i+1]){
                    creciente=false;
                    break;
                }
                
            }
            
            if(creciente==false){
                System.out.println("ERROR TIENE QUE COLOCAR LOS ELEMENTOS EN FORMA CRECIENTE!!! ");
                
            }
              
        }while(creciente==false);
        System.out.print("Digite un numero: ");
        num=entrada.nextInt();
        while(numeros[j]<num && j<5){
            sitio_num++;
            j++;
        }
        
        for(i=4;i>=sitio_num;i--){
            numeros[i+1]=numeros[i];
        }
        
        numeros[sitio_num]=num;
        
        for(i=0;i<6;i++){
            System.out.println(numeros[i]+" ");
        }
        System.out.println("");
    }
    
}
