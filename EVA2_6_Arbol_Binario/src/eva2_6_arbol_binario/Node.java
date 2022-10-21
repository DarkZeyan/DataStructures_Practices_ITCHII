package eva2_6_arbol_binario;
/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class Node {
    private int value;
    private Node left;
    private Node right;
    
    
    //Por default, un nuevo nodo va al final de la lista
    //El final de la lista se indica con null
    // Es por ello que siguiente = null.
    public Node(){
        this.left = null;
        this.right = null;
    }

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value= value;
    }

    public Node getNext() {
        return left;
    }

    public void setNext(Node next) {
        this.left =  next;
    }

    public Node getPrevious() {
        return right;
    }

    public void setPrevious(Node previous) {
        this.right = previous;
    }

}
