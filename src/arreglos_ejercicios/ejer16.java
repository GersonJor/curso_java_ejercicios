
package arreglos_ejercicios;

import java.util.Scanner;


public class ejer16 {

 
    public static void main(String[] args) {
        int i,j,alumnoM;
        float sumatP=0,sumatS=0,sumatT=0,notam=0,notafA=0;
        float[] primerS = new float[5];
        float[] segundoS = new float[5];
        float[] tercerS = new float[5];
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESANDO NOTAS DEL PRIMER TRIMESTRE: ");
       
        for(i=0;i<5;i++){
                System.out.print("Ingrese la nota del alumno "+(i+1)+" : ");
                primerS[i]=entrada.nextInt();
                sumatP=sumatP+primerS[i];
        } 
            
        for(j=0;j<5;j++){ 
            while(primerS[j]>20 || primerS[j] < 0){
                System.out.println("ERROR!! PORFAVOR INGRESE NOTAS DEL 1 AL 20");
                sumatP=0;
                for(i=0;i<5;i++){
                    System.out.print("Ingrese la nota del alumno "+(i+1)+" : ");
                    primerS[i]=entrada.nextInt();
                    sumatP+=primerS[i];
                 } 
               j=0; 
            }
         }   
          
            
        
        System.out.println("INGRESANDO NOTAS DEL SEGUNDO TRIMESTRE: ");
        for(i=0;i<5;i++){
            System.out.print("Ingrese la nota del alumno "+(i+1)+" : ");
            segundoS[i]=entrada.nextInt();
            sumatS+=segundoS[i];   
        }
        
        for(j=0;j<5;j++){ 
            while(segundoS[j]>20 || segundoS[j] < 0){
                System.out.println("ERROR!! PORFAVOR INGRESE NOTAS DEL 1 AL 20");
                sumatS=0;
                for(i=0;i<5;i++){
                    System.out.print("Ingrese la nota del alumno "+(i+1)+" : ");
                    segundoS[i]=entrada.nextInt();
                    sumatS+=segundoS[i];
                 } 
               j=0; 
            }
         } 
        
        System.out.println("INGRESANDO NOTAS DEL TERCER TRIMESTRE: ");
        for(i=0;i<5;i++){
            System.out.print("Ingrese la nota del alumno "+(i+1)+" : ");
            tercerS[i]=entrada.nextInt();
            sumatT+=tercerS[i]; 
        }
        
        for(j=0;j<5;j++){ 
            while(primerS[j]>20 || primerS[j] < 0){
                System.out.println("ERROR!! PORFAVOR INGRESE NOTAS DEL 1 AL 20");
                sumatT=0;
                for(i=0;i<5;i++){
                    System.out.print("Ingrese la nota del alumno "+(i+1)+" : ");
                    tercerS[i]=entrada.nextInt();
                    sumatT+=tercerS[i];
                 } 
               j=0; 
            }
         } 
        
        System.out.println("MOSTRANDO LA NOTA MEDIA DE CADA TRIMESTRE");
        notam=sumatP/5;
        System.out.println("La nota media del primer trimestre es: "+notam);
        notam=sumatS/5; 
        System.out.println("La nota media del segundo trimestre es: "+notam);
        notam=sumatT/5;        
        System.out.println("La nota media del tercer trimestre es: "+notam);
           
        System.out.println("CONSULTANDO LA MEDIA DEL ALUMNO DURANTE LOS 3 SEMESTRES: ");
        System.out.println("QUE ALUMNO DESEA SABER SU MEDIA EN ESTOS 3 SEMESTRES: ");
        alumnoM=entrada.nextInt();
        while(alumnoM>5 || alumnoM<1){
            System.out.println("ERROR!! POR FAVOR EN EL REGISTRO SOLO HAY 5 ALUMNOS\nINGRESE DEL 1 AL 5: ");
            alumnoM=entrada.nextInt();
        }
        for(i=0;i<5;i++){
            if(alumnoM==(i+1)){
                notafA=(primerS[i]+segundoS[i]+tercerS[i])/3;
                break;
            }
        }
        System.out.println("LA NOTA MEDIA DEL ALUMNO QUE ELIGIO ES: "+notafA);
    }
    
}
