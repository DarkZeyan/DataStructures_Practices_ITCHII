/*
 * 
 * 
 */
package eva1_22_fibonacci;
import java.util.Scanner;
/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA1_22_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner zeyan = new Scanner(System.in);
       
        System.out.println("Introduce la ultima posicion de la serie fibonacci a imprimir (0 - n)");
       int lim =  zeyan.nextInt();
       
       for(int i=0; i<=lim; i++){
           System.out.print(fibonacci(i)+" ");
       }
       
        
    }
    
    public static int fibonacci(int n){
        if(n == 0 || n ==1)
            return 1;
        else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    
}
