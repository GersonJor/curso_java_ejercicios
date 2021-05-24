
package arreglos_ejercicios;
import java.util.Scanner;

public class ejer13 {

    public static void main(String[] args) {
        int i,nrmpares=0,nrmimpares=0;
        int[] numeros= new int[10];
       
        
        
        Scanner entrada = new Scanner(System.in); 
       
        for(i=0;i<10;i++){
            System.out.print(i+".- ingrese el valor del elementos: ");
            numeros[i]=entrada.nextInt();
        }
        
        for(i=0;i<10;i++){
            if((numeros[i] % 2)==0){
                
                nrmpares++;   
            }else{
                nrmimpares++;
                
            }
        }
        int[] par = new int[nrmpares];
        int[] impar = new int[nrmimpares];
        nrmimpares=0;
        nrmpares=0;
        
        for(i=0;i<10;i++){
            if(numeros[i]%2==0){
                par[nrmpares]=numeros[i];
                nrmpares++;
                
            }else{
                impar[nrmimpares]=numeros[i];
                nrmimpares++;
            }
            
        }

        
        
        System.out.println("LOS NUMEROS PARES SON: ");
        for(i=0;i<nrmpares;i++){
            
            System.out.print(par[i]+" ");
            
        }
        System.out.println("\nLOS NUMEROS IMPARES SON: ");
        for(i=0;i<nrmimpares;i++){
            System.out.print(impar[i]+" ");
        }
                  
        
        
    }
    
}
