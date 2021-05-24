
package arreglos_ejercicios;
import java.util.Scanner;

public class ejer15 {

    public static void main(String[] args) {
        int i,elemento,j;
        boolean creciente=false,N=false;
        int[] enteros= new int[10];
        Scanner entrada = new Scanner(System.in);
        
        do{
            for(i=0;i<10;i++){
                System.out.print(i+".-Ingrese el valor del elemento: ");
                enteros[i]=entrada.nextInt();
            }
            for(i=0;i<9;i++){
                if(enteros[i]<enteros[i+1]){
                    creciente=true;
                }
                if(enteros[i]>enteros[i+1]){
                    creciente=false;
                    break;
                }
                
            }
            if(creciente==false){
                System.out.println("ERROR!! POR FAVOR INGRESE LOS ELEMENTOS EN ORDEN CRECIENTE ");
            }
        }while(creciente==false);
        
        System.out.println("QUE ELEMENTO DESEA SABER SU POSICION?? ");
        elemento=entrada.nextInt();
        j=0;
        for(i=0;i<10;i++){
            if(enteros[i]==elemento){
                N=true;
                j=i;
            }
        
            
        }
        if(N==true){
            System.out.println("El numero que eligio esta en la posicion: "+j+" del array");
        }
        if(N==false){
            System.out.println("El numero que eligio no esta en su arreglo");
        }
    }
    
}
