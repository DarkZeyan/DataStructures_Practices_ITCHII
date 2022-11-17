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
        for(int i=0; i<arregloDatos.length; i++){
            arregloCopia[i] = arregloDatos[(arregloDatos.length-1)-i];    
        }
        System.out.println("Arreglo 2"+arregloCopia);
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
        System.out.println("");
       }
}
