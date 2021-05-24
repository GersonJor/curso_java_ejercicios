
package arreglos_ejercicios;
import java.util.Scanner;

public class ejer8 {

 
    public static void main(String[] args) {
        int b;
        int[] a=new int[1];
        int[] numeros=new int[10];
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0;i<8;i++){
            System.out.print((i+1)+".-Ingrese el valor del elemento: ");
            numeros[i]=entrada.nextInt();
        }
        
        System.out.println("INGRESE UN NUMERO: ");
        a[0]=entrada.nextInt();
        System.out.println("DIGITE UNA POSICION DE SU NUMERO INGRESADO RECIENTEMENTE: ");
        b=entrada.nextInt();
        
        for(int i=0;i<b;i++){
            System.out.print(numeros[i]+" ");
        }
        System.out.print(a[0]+" ");
        
        for (int i=b;i<8;i++){
            System.out.print(numeros[i]+" ");
        }
    }
    
}
