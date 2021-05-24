
package Matrices;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ejer_5 {

   
    public static void main(String[] args) {
        
        int matriz[][],nfilas,ncolum;
        Scanner entrada = new Scanner(System.in);
        nfilas=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE FILAS DE SU MATRIZ: "));
        ncolum=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE COLUMNAS DE SU MATRIZ: "));
        
        matriz = new int[nfilas][ncolum];
        
        for(int i=0;i<nfilas;i++){
            for (int j = 0; j < ncolum; j++) {
                System.out.println("MATRIZ ["+i+"]["+j+"]: ");
                matriz[i][j]=entrada.nextInt();
            }
        }
        
       
        for(int i=0;i<nfilas;i++){
            for(int j=0;j<ncolum;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        int sumafila;
       
        for(int i=0;i<nfilas;i++){
            sumafila=0;
            for(int j=0;j<ncolum;j++){
                sumafila += matriz[i][j];
            }
            System.out.print("\nla suma de la fila["+i+"] es: "+sumafila);
        }
        
        System.out.println(" \n");
        int sumacolum;
        
        for(int j=0;j<ncolum;j++){
            sumacolum=0;
            for(int i=0;i<nfilas;i++){
                sumacolum += matriz[i][j];
                
            }
            System.out.print("\nla suma de cada columna ["+j+"] es: "+sumacolum);
        }
        
    }
    
}
