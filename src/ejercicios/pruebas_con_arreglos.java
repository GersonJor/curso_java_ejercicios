
package ejercicios;

import java.util.Scanner;


public class pruebas_con_arreglos {

   
    public static void main(String[] args) {
        int nElem;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de elementos: ");
        nElem=entrada.nextInt();
        char[] letras =new char[nElem];
        
        for(int i=0;i<nElem;i++){
            System.out.println((i+1)+". ingrese el elemento: ");
            letras[i]=entrada.next().charAt(0);
        }
        System.out.println("Los elementos del arreglo son: ");
        for(int i=0;i<nElem;i++){
            System.out.print(letras[i]+ " ");
            
        }
    }
    
}
