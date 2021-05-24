
package arreglos_ejercicios;
import java.util.Scanner;

public class ejer9 {

   
    public static void main(String[] args) {
        
        
        
        int[] numeros=new int[11];
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0;i<10;i++){
            System.out.print((i)+".-Ingrese el valor del elemento: ");
            numeros[i]=entrada.nextInt();
        }
        
        
        for(int i=9;i>=0;i--){
            numeros[i+1]=numeros[i];
        }
        numeros[0]=numeros[10];
        
        for(int i=0;i<10;i++){
            System.out.println("posicion "+i+".- "+numeros[i]);
        }
    }
    
}
