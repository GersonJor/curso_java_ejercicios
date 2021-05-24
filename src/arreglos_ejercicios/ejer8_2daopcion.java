
package arreglos_ejercicios;

import java.util.Scanner;


public class ejer8_2daopcion {

   
    public static void main(String[] args) {
        
        int a,b;
        
        int[] numeros=new int[10];
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0;i<8;i++){
            System.out.print((i)+".-Ingrese el valor del elemento: ");
            numeros[i]=entrada.nextInt();
        }
        
        System.out.println("INGRESE UN NUMERO: ");
        a=entrada.nextInt();
        System.out.println("DIGITE UNA POSICION DE SU NUMERO INGRESADO RECIENTEMENTE: ");
        b=entrada.nextInt();
        
        for(int i=7;i>=b;i--){
            numeros[i+1]=numeros[i];
        }
        numeros[b]=a;
        
        for(int i=0;i<9;i++){
            System.out.println("posicion "+i+".- "+numeros[i]);
        }
    }
    
}
