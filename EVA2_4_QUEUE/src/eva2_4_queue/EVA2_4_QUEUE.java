/*
 * 
 * 
 */
package eva2_4_queue;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA2_4_QUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Metodos para definir una lista como cola de espera
        /*
        add  -> Agrega elementos al final de la lista
        poll -> Lee y elimina el primer elemento de la lista
        peek -> lee el primer elemento de la lista.
        */
        
        MyQueue queue = new MyQueue();
        
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        
        System.out.println("El primer valor en llegar es: "+queue.peek());
        System.out.println("");
        queue.print();
        
        System.out.println("\nCon poll");
        try{
            queue.poll();
        }catch(Exception e){
            e.printStackTrace();
        }
        queue.print();
    }
    
}
