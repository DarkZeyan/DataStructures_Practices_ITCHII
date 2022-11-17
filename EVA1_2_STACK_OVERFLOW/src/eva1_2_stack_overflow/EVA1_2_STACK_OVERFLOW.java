package eva1_2_stack_overflow;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - 21550317
 * @subject Data Structures - ISC - 9-10 
 * 
 */
public class EVA1_2_STACK_OVERFLOW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A();
    }
    public static void A(){
        B();
    }
    public static void B(){
        A();
    }
}
