package eva2_1_lista_simple;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA2_1_LISTA_SIMPLE {

    public static void main(String[] args) {
        List myList = new List();

        //   int[] arreglo = new int[1000000];
        //Eficiencia de agregar el millon de nodos = O(N^2)
//        for(int i=0; i<1000000; i++){
//            myList.add(i);
//        }
        myList.add(10);
        myList.add(50);
        
        //El punto es el operador de desresferenciacion
        
        try {
            myList.insertAt(20, 0);
            myList.insertAt(10, 0);
            myList.insertAt(0, 0);
            myList.insertAt(1, 1);
            myList.deleteAt(4);
            myList.deleteAt(0);
            myList.deleteAt(4);
            System.out.println("Valor en la posicion 3: "+myList.getValueAt(1));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        myList.print();
        System.out.println("Tamaño de la lista: " + myList.size());

    }
}
