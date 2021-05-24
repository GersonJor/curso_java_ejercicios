
package arreglos_ejercicios;
import java.util.Scanner;

public class ejer3 {

   
    public static void main(String[] args) {
        float media_pos=0,media_neg=0;
        int cont_pos=0,cont_neg=0,cont_ceros=0;
        int[] numeros=new int[5];
        Scanner entrada=new Scanner(System.in);
        
        for(int i=0;i<5;i++){
            System.out.println((i+1)+". Ingrese el elemento: ");
            numeros[i]=entrada.nextInt();  
            if(numeros[i]>0){
                media_pos+=numeros[i];
                cont_pos++;
            }else if(numeros[i]==0){
                cont_ceros++;
            }else{
                media_neg+=numeros[i];
                cont_neg++;
            }
            
        }
        
        if(media_pos==0){
            System.out.println("NO HAY VALORES POSITIVOS EN SU ARREGLO");
            
        }else{
            System.out.println("HAY UN TOTAL DE: "+cont_pos+" valores positivos\nY SU MEDIA ES: "+(media_pos/cont_pos));
        }
        
        if(media_neg==0){
            System.out.println("NO HAY VALORES NEGATIVOS EN SU ARREGLO");
        }else{
            System.out.println("HAY UN TOTAL DE: "+cont_neg+ " VALORES NEGATIVOS\nY SU MEDIA ES: "+(media_neg/cont_neg));
        }
        System.out.println("HAY UN TOTAL DE: "+cont_ceros+" VALORES CEROS EN SU ARREGLO");
    }   
    
}
