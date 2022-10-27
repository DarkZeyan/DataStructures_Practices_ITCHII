/*
 * 
 * 
 */
package eva2_6_arbol_binario;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA2_6_Arbol_Binario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        BinaryTree tree = new BinaryTree();
        
        tree.add(10);
        tree.add(11);
        tree.add(16);
        tree.add(13);
        tree.add(17);
        tree.add(2);
        tree.inOrder();
        tree.postOrder();
        tree.preOrder();
                
    }
    
}
