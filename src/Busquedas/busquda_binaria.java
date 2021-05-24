
package Busquedas;

import javax.swing.JOptionPane;


public class busquda_binaria {

    
    public static void main(String[] args) {
        int arreglo[]={3,4,6,2,6};
        int dato,sup,inf,i,mitad;
        boolean band=false;
        dato=Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO QUE DESEA BUSCAR: "));
        i=0;
        sup=5;
        inf=0;
        mitad=(sup+inf)/2;
        
        while(i<5 && inf<=sup){
            if(arreglo[mitad]==dato){
                band=true;
                break;
            }
            if (arreglo[mitad]>dato){
                sup=mitad;
                mitad=(sup+inf)/2;
            }
            if (arreglo[mitad]<dato){
                inf=mitad;
                mitad=(sup+inf)/2;
            }
            i++;
        }
        
        if(band==true){
            JOptionPane.showMessageDialog(null, "El numero que ingreso se encuentra en la posicion "+(mitad)+" del arreglo.");
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR NO SE ENCONTRO EL ARREGLO QUE INGRESO.");
        }
    
    }
    
}
