
package metodos_de_ordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class metodo_burbuja {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nmrElementos,aux;
        
        nmrElementos=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE ELEMENTOS: "));
        arreglo=new int[nmrElementos];
        for(int i=0;i<nmrElementos;i++){
            System.out.println("Ingrese el elemento ["+(i+1)+"] de su arreglo: ");
            arreglo[i]=entrada.nextInt();
        }
        
        for(int i=0;i<nmrElementos-1;i++){
            for(int j=0;j<nmrElementos-1;j++){
               if(arreglo[j]>arreglo[j+1]){
                  aux=arreglo[j];
                  arreglo[j]=arreglo[j+1];
                  arreglo[j+1]=aux;
               }
               
               
            }
        }
        System.out.println("MOSTRANDO EL ARREGLO DE ORDEN CRECIENTE: ");
        for(int i=0;i<nmrElementos;i++){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("MOSTRANDO EL ARREGLO DE ORDEN DECRECIENTE: ");
        for(int i=nmrElementos-1;i>=0;i--){
            System.out.print(arreglo[i]+ " ");
        }
    }
    
}
