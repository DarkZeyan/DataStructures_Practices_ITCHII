/*
 * 
 * 
 */
package eva1_6_nanotime;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */   
public class EVA1_6_NANOTIME {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long ini = System.nanoTime();
        System.out.println(ini);
        long fin = System.nanoTime();
        long tiempo = fin - ini;
        System.out.println(tiempo);
       
    }
    
}
