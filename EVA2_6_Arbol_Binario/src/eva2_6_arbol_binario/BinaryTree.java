package eva2_6_arbol_binario;

/*
 * 
 * 
 */
/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class BinaryTree {

    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    private void addRecursive(int value, Node currentNode) {
        //Definir posibles situaciones
        /*
        1. Arbol vacio si el nodo es null
        
        2.. Verificar el lado (nodo) es null,
        si es null ahi va el valor, si no
        repetir recursion.
         */

        Node newNode = new Node(value);
        if (value < currentNode.getValue()) {
            // se asigna a la izquierda

            if (currentNode.getLeft() == null) {
                currentNode.setLeft(newNode);
            } else {
                addRecursive(value, currentNode.getLeft());
            }

        } else if (value > currentNode.getValue()) {
            // va a la derecha
            if (currentNode.getRight() == null) {
                currentNode.setRight(newNode);
            } else {
                addRecursive(value, currentNode.getRight());
            }
        } else {
            System.out.println("El elemento ya existe");
        }
    }

    public void add(int value) {

        if (root == null) {
            root = new Node(value);
        }

        addRecursive(value, root);
    }

    public void inOrder() {
        inOrderRecursion(root);
        System.out.println("");
    }

    private void inOrderRecursion(Node node) {
        if (node != null) {
            inOrderRecursion(node.getLeft());
            System.out.print(node.getValue() + " - ");
            inOrderRecursion(node.getRight());
        }
    }

    public void preOrder() {
        preOrderRecursion(root);
        System.out.println("");
    }

    private void preOrderRecursion(Node node) {
        if (node != null) {

            System.out.print(node.getValue() + " - ");
            preOrderRecursion(node.getLeft());
            preOrderRecursion(node.getRight());
        }
    }

    public void postOrder() {
        postOrderRecursion(root);
        System.out.println("");
    }

    private void postOrderRecursion(Node node) {
        if (node != null) {

            postOrderRecursion(node.getLeft());
            postOrderRecursion(node.getRight());
            System.out.print(node.getValue() + " - "); 
        }
    }
}
