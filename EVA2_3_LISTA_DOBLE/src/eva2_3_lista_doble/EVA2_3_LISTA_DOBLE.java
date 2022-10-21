/*
 * 
 * 
 */
package eva2_3_lista_doble;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA2_3_LISTA_DOBLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        DoubleList myList = new DoubleList();
        
        myList.add(20);
        myList.add(30);
        myList.add(40);
        
        
        try {
            myList.insertAt(10, 2);
            myList.insertAt(30, 3);
            myList.deleteAt(5);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        myList.print();
        System.out.println("Lista inverso\n");
        myList.reversePrint();
    }
    
}
