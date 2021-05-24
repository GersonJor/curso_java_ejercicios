
package Matrices;


public class ejer_4 {

  
    public static void main(String[] args) {
        int  Matriz[][]= new int[7][7];
        for(int i=0;i<7;i++){
            for (int j=0;j<7;j++){
                if(i==j){
                    Matriz[i][j]=1;
                }
                else{
                    Matriz[i][j]=0;
                }
            }
        }
        
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                System.out.print(Matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
}
