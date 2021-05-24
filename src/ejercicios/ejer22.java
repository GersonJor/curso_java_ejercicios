
package ejercicios;

import java.util.Scanner;


public class ejer22 {

    
    public static void main(String[] args) {
        int calificaciones;
        boolean suspenso=false;
        Scanner entrada = new Scanner(System.in);
        
        for(int i=1;i<=5;i++){
            System.out.println("Ingrese la calificacion del alumno N°"+i);
            calificaciones=entrada.nextInt();
            while(calificaciones>10 || calificaciones<0){
                System.out.println("ERROR!!\n esa nota no es valido en el sistema\n ingrese nuevamente");
                calificaciones=entrada.nextInt();
            }
            
            if(calificaciones<4){
                suspenso=true;
                
            }
            
        }
        
        if(suspenso==true){
            System.out.println("SI HAY ALUMNOS SUSPENDIDOS");
        }else{
            System.out.println("NO HAY ALUMNOS SUSPENDIDOS");
        }
        
    }
    
}
