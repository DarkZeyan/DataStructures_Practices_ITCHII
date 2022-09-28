package eva2_1_lista_simple;
/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class Node {
    private int value;
    private Node next;
    
    //Por default, un nuevo nodo va al final de la lista
    //El final de la lista se indica con null
    // Es por ello que siguiente = null.
    public Node(){
        this.next = null;
    }

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value= value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next =  next;
    }
    
}
