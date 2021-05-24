
package arreglos_ejercicios;

import java.util.Scanner;


public class ejer10 {

  
    public static void main(String[] args) {
        int n_posicion,ultimo;
         int[] numeros=new int[10];
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0;i<10;i++){
            System.out.print((i)+".-Ingrese el valor del elemento: ");
            numeros[i]=entrada.nextInt();
        }
        System.out.println("Ingrese el numero de posicionesque desea rotar: ");
        n_posicion=entrada.nextInt();
        
        for(int vuelta=1;vuelta<=n_posicion;vuelta++){
            ultimo= numeros[9];
            for(int i=8;i>=0;i--){
                numeros[i+1]=numeros[i];
            }
            numeros[0]=ultimo;
        }
        
        
        for(int i=0;i<10;i++){
            System.out.println("posicion "+i+".- "+numeros[i]);
        }
    }
    
}
        
