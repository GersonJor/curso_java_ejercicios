
package Busquedas;

import javax.swing.JOptionPane;


public class Busqueda_Secuencial {

    
    public static void main(String[] args) {
        int arreglo[] = {2,5,4,1,6};
        int dato;
        boolean band= false;
        
        dato=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que desea buscar: "));
        
        int i=0;
        while(i<5 && band==false){
            if(arreglo[i]== dato){
                
                band=true;
            }
            i++;
        }
        if(band==false){
            JOptionPane.showMessageDialog(null, "Error el numero que digito no esta en el arreglo ");
        }
        else{
            JOptionPane.showMessageDialog(null, "El fue encontrado en la posicion: "+(i-1));
        }
    }
    
}
