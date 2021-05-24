
package arreglos_ejercicios;
import java.util.Scanner;

public class ejer6 {

    
    public static void main(String[] args) {
        int j,i;
        int[] a=new int[12];
        int[] b=new int[12];
        int[] c=new int[24];
        Scanner entrada =new Scanner(System.in);
        
        
        for(i=0;i<12;i++){

            System.out.print((i+1)+". Ingrese un elemento del arreglo A: ");
            a[i]=entrada.nextInt();
            
            System.out.print((i+1)+". Ingrese un elemento del arreglo B: ");
            b[i]=entrada.nextInt();
            
          
            
            
               
        }
        i=0;
        j=0;
        while(i<12){
            for(int k=0;k<3;k++){
                c[j] = a[i+k];
                j++;
            }
            for(int k=0;k<3;k++){
                c[j] = b[i+k];
                j++;
            }
            
            i+=3;
        }
        for(i=0;i<24;i++){
           
            System.out.print(c[i]+" ");
            
          
        }
        System.out.println();
        
        
    }
    
}
