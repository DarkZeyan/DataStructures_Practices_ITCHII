package eva1_18_recursividad;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA1_18_RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        fakeForDownVoid(6);
        System.out.println("Con funcion tipo int");
        fakeForDown(5);
        System.out.println("\nFor hacia arriba");
        fakeForUp(5,10);
        
        System.out.println("MCD de 180 y 48: "+gcd(180,48));
        
        System.out.println("Factorial de 5: "+factorial(5));
    }
    
        
    public static int fakeForDown(int value){
           System.out.println(value);
           if(value>1){
               return fakeForDown(value-1);
           }
           else return 1;
    }
    
    public static void fakeForDownVoid(int value){
        System.out.println(value);
        if(value>1)  fakeForDownVoid(value-1);
    }
    
    
        public static int fakeForUp(int ini, int end){

        if(ini<=end){
            System.out.println(ini);
            ini++;
            return fakeForUp(ini,end);
        }
        else return end;

    }

    public static int factorial(int n){
        if(n==0) return 1;
        else return n*factorial(n-1);
    }

    public static int gcd(int dividendo, int divisor){
        if(dividendo%divisor==0) return divisor;
        else return gcd(divisor, dividendo%divisor);
    }
}
