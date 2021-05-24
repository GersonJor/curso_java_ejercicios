
package arreglos_ejercicios;


import java.util.Scanner;
public class ejer_2 {

   
    public static void main(String[] args) {
       
       
        Scanner entrada=new Scanner(System.in);
       
        float[] numeros = new float[5];
        
        for(int i=0;i<5;i++){
            System.out.println((i+1)+". ingrese el elemento: ");
            numeros[i]=entrada.nextFloat();
            
        }
        
        System.out.println("Los elementos del arreglo son: ");
       
        for(int i=0;i<5;i++){
            System.out.println(numeros[i]);
        }
        
   
    }
    
}
