/*
 * 
 * 
 */
package eva1_15_copia_arreglos;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA1_15_COPIA_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int[] arregloDatos = new int [100];
        
        llenarArreglo(arregloDatos);   
        System.out.println("Arreglo 1"+arregloDatos);
        imprimirArreglo(arregloDatos);
        int[] arregloCopia = new int [arregloDatos.length];
        int j=0;
        for(int i=arregloDatos.length-1; i>=0; i--){
            arregloCopia[i] = arregloDatos[j];
            j++;
        }
        System.out.println("\nArreglo 2"+arregloCopia+"\n");
        imprimirArreglo(arregloCopia);
        
    }
    public static void llenarArreglo(int[] array){
        for(int i=0; i<array.length; i++){
            array[i] = (int)(Math.random() * 100);
        }
    }
    public static void imprimirArreglo(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print("["+array[i]+"]");
        }
       }
}
