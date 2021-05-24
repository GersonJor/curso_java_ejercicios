
package Matrices;
import java.util.Scanner;

public class ejer_6 {

   
    public static void main(String[] args) {
        int matriz1[][]= new int[5][9];
        int matriz2[][]= new int[9][5];
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("INGRESANDO LOS VALORES DE LA MATRIZ");
        for (int i=0;i<5;i++){
            for (int j=0;j<9;j++){
                System.out.println("MATRIZ ["+i+"]["+j+"]: ");
                matriz1[i][j]=entrada.nextInt();
                
            }
        }
        System.out.println("\nIMPRIMIENDO LA MATRIZ ORIGINAL: ");
        for(int i=0;i<5;i++){
            for(int j=0;j<9;j++){
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println(" ");
        }
        
      
        for(int i=0;i<5;i++){
            for(int j=0;j<9;j++){
                
                matriz2[j][i]=matriz1[i][j];
                
            }
            
        }
        
        System.out.println("\nLA MATRIZ TRANSPUERSTA ES: ");
        for(int i=0;i<9;i++){
            for(int j=0;j<5;j++){
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        
    }
    
}
