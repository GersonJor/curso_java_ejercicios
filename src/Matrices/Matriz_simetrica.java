
package Matrices;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Matriz_simetrica {


    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int Matriz[][],nfilas,ncolum;
        boolean simetrica=true;
        
        nfilas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas de su matriz: "));
        ncolum=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas de su matriz; "));
        
        Matriz=new int[nfilas][ncolum];
        
        System.out.println("DIGITE LA MATRIZ: ");
        for(int i=0;i<nfilas;i++){
            for(int j=0;j<ncolum;j++){
                System.out.println("Matriz ["+i+"]["+j+"]: ");
                Matriz[i][j]=entrada.nextInt();
            }
        }
        
        if(nfilas==ncolum){
            int i=0;
            while(simetrica==true && i<nfilas){
                int j=0;
                while(j<i && simetrica==true){
                    if(Matriz[i][j]!=Matriz[j][i] ){
                        simetrica=false;
                    }
                    j++;
                    
                }
                i++;
            }
            
            if(simetrica==true){
                System.out.println("SU MATRIZ ES SIMETRICA...");
            }
            else{
                System.out.println("SU MATRIZ NO ES SIMETRICA...");
            }
            
        }
        else{
            System.out.println("LO SENTIMOS SU MATRIZ NO ES SIMETRICA....");
        }
       
    }
    
}
