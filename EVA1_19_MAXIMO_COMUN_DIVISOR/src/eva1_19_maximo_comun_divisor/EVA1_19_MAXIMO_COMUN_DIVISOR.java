/*
 * 
 * 
 */
package eva1_19_maximo_comun_divisor;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA1_19_MAXIMO_COMUN_DIVISOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("MCD de 180 y 48: "+gcd(180,48));
        
    }
    
     public static int gcd(int dividendo, int divisor){
        if(dividendo%divisor==0) return divisor;
        else return gcd(divisor, dividendo%divisor);
    }
     
     
}
