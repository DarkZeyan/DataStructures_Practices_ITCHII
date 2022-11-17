/*
 * 
 * 
 */
package eva1_8_arreglos_objetos;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA1_8_ARREGLOS_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ejemplo[] arregloEjemplo =  new Ejemplo[20];
        for(int i=0; i<arregloEjemplo.length; i++){
            arregloEjemplo[i] = new Ejemplo();
            
        }
        for (Ejemplo ejemplo : arregloEjemplo) {
            System.out.println("El valor de X  en el Objeto "+ejemplo+" = "+ejemplo.x);
        }

    }
    
}
class Ejemplo{
    public int x=100;
}