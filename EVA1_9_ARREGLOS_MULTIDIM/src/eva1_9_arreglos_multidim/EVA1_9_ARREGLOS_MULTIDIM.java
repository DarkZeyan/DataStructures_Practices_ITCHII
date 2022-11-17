/*
 * 
 * 
 */
package eva1_9_arreglos_multidim;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA1_9_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrizDatos = new int [3][5];
        
        System.out.println("Filas " +matrizDatos.length);
        
        for (int i = 0; i < matrizDatos.length; i++) {
            System.out.println("Columnas "+matrizDatos[i].length);
            for(int j=0; j<matrizDatos[i].length; j++){
                matrizDatos[i][j] = 100;
        }
         
        }
        
        for (int i = 0; i < matrizDatos.length; i++) {
            for(int j=0; j<matrizDatos[i].length; j++){
                System.out.print("["+matrizDatos[i][j]+"] ");
        }
            System.out.println("");
        }
    }
    
}
