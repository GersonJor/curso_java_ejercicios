
package metodos_de_ordenamiento;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ordenamiento_por_insercion {

   
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int arreglo[],nElementos,pos,aux;
       
       nElementos=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE ELEMENTOS QUE DESEA EN SU ARREGLO: "));
       
       arreglo= new int[nElementos];
       for(int i=0;i<nElementos;i++){
           System.out.print("Ingrese el elemento numero "+(i+1)+": ");
           arreglo[i]= entrada.nextInt();
       }
       
       for(int i=0;i<nElementos;i++){
           pos=i;
           aux=arreglo[i];
           while(pos>0 && arreglo[pos-1]>aux){
               arreglo[pos]=arreglo[pos-1];
               pos--;
           }
           arreglo[pos]=aux;
       }
       
        System.out.println("IMPRIMIENDO EL ARREGLO EN FORMA CRECIENTE");
        for(int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" ");
            
        }
        System.out.println(" ");
        
        System.out.println("IMPRIMIENDO EL ARREGLO EN FORMA DECRECIENTE");
        for(int i=(nElementos-1);i>=0;i--){
            System.out.print(arreglo[i]+" ");
            
        }
        
        
       
    }
    
}
