
package metodos_de_ordenamiento;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ordenamiento_Por_seleccion {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos,min,aux;
        
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE ELEMENTOS QUE DESEA EN SU ARREGLO: "));
        arreglo= new int[nElementos];
        
        for(int i=0;i<nElementos;i++){
            System.out.print("Ingrese el valor del elemento numero "+(i+1)+": ");
            arreglo[i]=entrada.nextInt();
        }
        
        for(int i=0;i<nElementos;i++){
            min=i;
            for(int j=(i+1);j<nElementos;j++){
                if(arreglo[j]<arreglo[min]){
                    min=j;
                }
                
            }
            aux=arreglo[i];
            arreglo[i]=arreglo[min];
            arreglo[min]=aux;
        }
        
        System.out.println("IMPRIMIENDO EL ARREGLO EN FORMA CRECIIENTE");
        for(int i=0; i<nElementos;i++){
            System.out.print(arreglo[i]+" ");
        }
    }
    
}
