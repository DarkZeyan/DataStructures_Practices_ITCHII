/*
 * 
 * 
 */
package eva1_5_for_each;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA1_5_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int edades[];
        edades = new int[10];

        for (int i = 0; i < edades.length; i++) {
            edades[i] = (int) (Math.random() * 100);
        }

        for (int edad : edades) {
            System.out.println("[" + edad + "]");
        }
    }

}
