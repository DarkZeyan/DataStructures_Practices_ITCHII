package eva1_14_paso_ref;
/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA1_14_PASO_REF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] arregloDatos = new int [100];
        
        int[] arregloDatos2 = new int [10];
        llenarArreglo(arregloDatos);
        llenarArreglo(arregloDatos2);
        imprimirArreglo(arregloDatos);
    }
    public static void llenarArreglo(int[] array){
        for(int i=0; i<array.length; i++){
            array[i] = 100;
        }
    }
    public static void imprimirArreglo(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print("["+array[i]+"]");
        }
    }
}
