/*
 * 
 * 
 */
package eva1_13_paso_valor_ref;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA1_13_PASO_VALOR_REF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int prueba = 50;
        System.out.println("Valor = "+prueba);
        incValor(prueba);
        System.out.println("Valor incrementado = "+prueba);
        
        //Con objetos
        
        /*
        Con los objetos si funciona la modificacion mediante metodos debido a que utilizan la direccion de memoria del objeto original para ser modificados
        */
        PruebaValor p1 = new PruebaValor();
        p1.x = 100;
        System.out.println("Valor de x Objeto Prueba Valor "+p1.x);
        incValor(p1);
        System.out.println("Valor de x Objeto Prueba Valor "+p1.x);
        
    }
    
    
    public static void incValor(int x){
        x++;
    }
    public static void incValor(PruebaValor obj){
        obj.x++;
    }
    
    
}

class PruebaValor{
    int x;
}