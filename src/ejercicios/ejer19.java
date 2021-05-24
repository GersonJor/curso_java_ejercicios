
package ejercicios;
import java.util.Scanner;
public class ejer19 {

  
    public static void main(String[] args) {
        int aprobados=0,condicionados=0,suspensos=0;
        float notas;
        Scanner entrada=new Scanner (System.in);
        
        for(int i=1;i<=6;i++){
            System.out.println("Ingrese las notas del alumno " +i);
            notas=entrada.nextInt();
            while(notas>10 || notas<0){
                System.out.println("ERROR!!\n esa nota no es valido en el sistema\n ingrese nuevamente");
                notas=entrada.nextInt();
            }
            if(notas>4){
                aprobados++;
            }else if(notas==4){
                condicionados++;
            }else{
                suspensos++;
            }
            
            
        }
        System.out.println("HAY UN TOTAL DE: "+aprobados+" aprobados.");
        System.out.println("HAY UN TOTAL DE: "+condicionados+" CONDICIONADOS.");
        System.out.println("HAY UN TOTAL DE: "+suspensos+" SUSPENDIDOS.");
    }
    
}
