/*
 * 
 * 
 */
package eva1_12_copia_objetos;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA1_12_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int valor, copiaValor;
        
        valor = 100;
        copiaValor = valor;
        
        System.out.println("Valor = "+valor);
        System.out.println("Copia = "+copiaValor);
        valor++;
        System.out.println("Valor = "+valor);
        System.out.println("Copia = "+copiaValor);
        
        // Con objetos
        System.out.println("\n Con Objetos");
        PruebaValor p1  = new PruebaValor();
        PruebaValor pCopia = new PruebaValor();
        
        p1.z = 100;
        pCopia  = p1;
        System.out.println("Valor = "+p1.z);
        System.out.println("Copia = "+pCopia.z);
        p1.z = 101;
        System.out.println("Valor = "+p1.z);
        System.out.println("Copia = "+pCopia.z);
        
        
        
        
        
        
        
        
    }
}

class PruebaValor{
    int z;
}