package eva2_1_lista_simple;
/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA2_1_LISTA_SIMPLE {
    public static void main(String[] args) {
        List myList =  new List();
        
     //   int[] arreglo = new int[1000000];
     
     //Eficiencia de agregar el millon de nodos = O(N^2)
//        for(int i=0; i<1000000; i++){
//            myList.add(i);
//        }

        myList.add(10);
        myList.add(50);
        
        myList.print();
        
        System.out.println("Tamaño de la lista: "+myList.size());
     }
}
