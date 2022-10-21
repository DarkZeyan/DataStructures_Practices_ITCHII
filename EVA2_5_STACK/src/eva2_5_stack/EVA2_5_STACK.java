/*
 * 
 * 
 */
package eva2_5_stack;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA2_5_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        add
        pop
        peek
        */
        
        
        MyStack stack =  new MyStack();
        
        stack.push(10);
        stack.push(20);
        stack.print();
        System.out.println("");
        stack.push(30);
        stack.print();
        stack.push(40);
        System.out.println("");
        stack.peek();
        stack.print();
        System.out.println("");
        try{
            stack.pop();
        }catch(Exception e){
            e.printStackTrace();
        }
        stack.print();
        
    }
    
}
