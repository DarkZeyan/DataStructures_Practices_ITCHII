/*
 * 
 * 
 */
package eva1_7_medir_tiempo;

import java.util.Scanner;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA1_7_MEDIR_TIEMPO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] datos = new int[100000000];
        long ini = System.nanoTime();
        for (int i = 0; i < datos.length; i++) {
            datos[i] = 100;
        }
        long fin = System.nanoTime();
        long tiempo = fin - ini;
        System.out.println(tiempo);
    }
    
}
