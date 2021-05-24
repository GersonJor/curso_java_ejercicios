
package Matrices;
import java.util.Scanner;

public class Matriz_suma {

  
    public static void main(String[] args) {
        int Matriz1[][],Matriz2[][],suma[][];
        Scanner entrada = new Scanner(System.in);
        Matriz1 = new int[3][3];
        Matriz2 = new int[3][3];
        suma= new int[3][3];
        System.out.println("DIGITE LOS VALORES DE SU PRIMERA MATRIZ: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Matriz ["+i+"]["+j+"]: ");
                Matriz1[i][j]=entrada.nextInt();
            }
        }
        
        System.out.println("DIGITE LOS VALORES DE SU SEGUNDA MATRIZ: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Matriz ["+i+"]["+j+"]: ");
                Matriz2[i][j]=entrada.nextInt();
            }
        }
        
        System.out.println("LA SUMA DE LAS 2 MATRICES INGRESADAS ES: ");
        for(int i=0;i<3;i++ ){
            for(int j=0;j<3;j++){
                suma[i][j]=Matriz1[i][j]+Matriz2[i][j];
                System.out.print(suma[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
}
