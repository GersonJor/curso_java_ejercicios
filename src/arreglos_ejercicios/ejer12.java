
package arreglos_ejercicios;
import java.util.Scanner;

public class ejer12 {

    
    public static void main(String[] args) {
        int i,pos;
        int[] numeros =new int[11];
        Scanner entrada=new Scanner(System.in);
        
        for(i=0;i<10;i++){
            System.out.print("Ingrese el elemento de la posicion "+i+": ");
            numeros[i]=entrada.nextInt();
        }
        System.out.println("Que posicion del elemento desea eliminar? ");
        pos=entrada.nextInt();
        
        while(pos>=9 || pos<=0){
            System.out.println("ERROR!! SOLO PUEDE INGRESAR UNA POSICION DE 0 AL 9\nIngresar denuevo la posicion del elemento desea eliminar ");
            pos=entrada.nextInt();
            
        }
        
        for(i=pos;i<9;i++){
            numeros[i]=numeros[i+1];
        }
        
 
        
        for(i=0;i<9;i++){
            System.out.print(numeros[i]+"  ");
        }
    
    }
    
}
