
package Matrices;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class matriz_1 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Matriz[][],ncol,nfil;
        
        ncol=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE COLUMNAS DE SU MATRIZ: "));
        nfil=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE FILAS DE SU MATRIZ: "));
        
        Matriz = new int[nfil][ncol];
        System.out.println("DIGITE LA MATRIZ: ");
        for(int i=0;i<nfil;i++){
            for(int j=0;j<ncol;j++){
                System.out.print("Matriz ["+i+"] ["+j+"]: ");
                Matriz[i][j]=entrada.nextInt();
            }
        }
        System.out.println("IMPRIMIENDO LA MATRIZ....");
        for(int i=0;i<nfil;i++){
            for(int j=0;j<ncol;j++){
                System.out.print(Matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
    
}
