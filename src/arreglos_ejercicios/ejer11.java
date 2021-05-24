
package arreglos_ejercicios;
import java.util.Scanner;

public class ejer11 {

  
    public static void main(String[] args) {
        int num;
        boolean creciente=false,desordenado=false;
        int[] numeros =new int[10];
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0;i<5;i++){
            
            System.out.print((i)+("-.ingrese el valor del elemento: "));
            numeros[i]=entrada.nextInt();
            
        }
        for(int i=0;i<5;i++){
            
            if(numeros[i]<numeros[i+1]){
                creciente=true;
            }
            if(numeros[i]>numeros[i+1] && numeros[i]==numeros[i+1] && numeros[i]>numeros[i+1] ){
                desordenado=true;
            }
                
            
        }
   
        while(desordenado==false && creciente==true ){
            System.out.println("ERROR TIENE QUE COLOCAR LOS ELEMENTOS EN FORMA CRECIENTE!!! ");
            for(int i=0;i<5;i++){
            
                System.out.print((i)+("-.ingrese nuevamente el valor del elemento: "));
                numeros[i]=entrada.nextInt();            
            }
            for(int i=0;i<5;i++){
            
                if(numeros[i]<numeros[i+1]){
                    creciente=true;
                 }
                if(numeros[i]>numeros[i+1] || numeros[i]==numeros[i+1]){
                       desordenado=true;
                 }
            }
         
        }
        
        System.out.print("INSERTE UN NUMERO: ");
        num=entrada.nextInt();
        
        for(int i=4;i>=num;i--){
            numeros[i+1]=numeros[i];
            
        }
        numeros[num]=num;
        
        for(int i=0;i<6;i++){
            System.out.print(numeros[i]+" ");
        }

        
     
        for(int i=0;i<5;i++){
            System.out.print(numeros[i]+" ");
        }
        
        
        
    }
    
}
