
package Matrices;
import java.util.Scanner;

public class ejer3_mtranspuesta {

  
    public static void main(String[] args) {
        int matriz[][];
        matriz=new int [3][3];
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("DIGITE LA MATRIZ: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Matriz ["+i+"]["+j+"]");
                matriz[i][j]=entrada.nextInt();
            }
        }
        
        System.out.println("IMPRIMIENDO LA MATRIZ ORIGINAL: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        
       
        int aux;
        for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;
            }
        }
         System.out.println("IMPRIMIENDO LA MATRIZ TRANSPUESTA: ");
         for(int i=0;i<3;i++){
             for(int j=0;j<3;j++){
                 System.out.print(matriz[i][j]+" ");
             }
             System.out.println(" ");
         }
    }
    
}
