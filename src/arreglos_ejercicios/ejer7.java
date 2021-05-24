
package arreglos_ejercicios;
import java.util.Scanner;

public class ejer7 {

    public static void main(String[] args) {
        boolean creciente = false,decreciente = false;
        int[] a=new int[10];
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0;i<10;i++){
            
            System.out.print((i+1)+". Ingrese el valor del elemento: ");
            a[i]=entrada.nextInt();
        }
        
        for(int i=0;i<9;i++){
           
           if(a[i]<a[i+1]){
               creciente=true;
           }
           if(a[i]>a[i+1]){
               decreciente=true;
           }
           
        }
        
        if(creciente==true && decreciente==false){
            System.out.println("El oreden es creciente");
        }else if(creciente==false && decreciente==true){
            System.out.println("El orden es decreciente");
            
        }else if(creciente==true && decreciente==true){
            System.out.println("EL orden esta desordenado");
        }else if(creciente==false && decreciente==false){
            System.out.println("EL orden son iguales");
        }                
        
    }
    
}
