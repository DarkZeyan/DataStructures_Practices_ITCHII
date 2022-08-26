/*
 * 
 * 
 */
package eva1_10_arreglo_cubo;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA1_10_ARREGLO_CUBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][][] cuboDatos =  new int [3][4][5];
        
        for (int i = 0; i < cuboDatos.length; i++) {
            for (int j = 0; j < cuboDatos[i].length; j++) {
                for (int k = 0; k < cuboDatos[i][j].length; k++) {
                    cuboDatos[i][j][k] =  25;
                }
            }
        }
        
        
           for (int i = 0; i < cuboDatos.length; i++) {
            for (int j = 0; j < cuboDatos[i].length; j++) {
                for (int k = 0; k < cuboDatos[i][j].length; k++) {
                    System.out.print("["+cuboDatos[i][j][k]+"]");
                }
                System.out.println("");
            }
               System.out.println("");
        }
           
    }
}
