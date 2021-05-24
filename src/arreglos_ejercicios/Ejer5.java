
package arreglos_ejercicios;
import java.util.Scanner;

public class Ejer5 {

    public static void main(String[] args) {
        
        int[] A=new int[10];
        int[] B=new int[10];
        int[] C=new int[20];
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0;i<10;i++){
            System.out.println((i+1)+". Ingrese el elemento del arreglo A: ");
            A[i]=entrada.nextInt();
            System.out.println((i+1)+". Ingrese el elemento del arreglo B: ");
            B[i]=entrada.nextInt();
           
        }
        
        for(int i=0;i<10;i++){
            System.out.print(+A[i]+", "+B[i]+", ");
            
            
            
        }
    }
    
}
