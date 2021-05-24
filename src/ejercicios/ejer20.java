
package ejercicios;

import java.util.Scanner;


public class ejer20 {

  
    public static void main(String[] args) {
       int  numeros;
       boolean negativos=false;
       
       Scanner entrada = new Scanner(System.in);
       for(int i=1;i<=10;i++){
           System.out.println("Ingrese un numero N°"+i);
           numeros=entrada.nextInt();
           if(numeros<0){
               negativos=true; 
               
           }
           
       }
       if(negativos=true){
           System.out.println("Si hay numeros negativos");
       }
       else{
           System.out.println("No hay numeros negativos");
       }
    }
    
}
