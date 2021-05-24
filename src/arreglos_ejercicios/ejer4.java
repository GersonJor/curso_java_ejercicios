
package arreglos_ejercicios;
import java.util.Scanner;

public class ejer4 {

  
    public static void main(String[] args) {
        
        int[] numeros =new int[10];
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0;i<10;i++){
            System.out.print((i+1)+". Ingrese el elemento: ");
            numeros[i]=entrada.nextInt();
        }
        
        for(int i=0;i<5;i++){
            System.out.print(numeros[i]+" "+numeros[9-i]+" ");
            
        }
     
                
        System.out.println();
    }
    
}
