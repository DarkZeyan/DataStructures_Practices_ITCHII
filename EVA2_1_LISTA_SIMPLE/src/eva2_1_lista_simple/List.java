package eva2_1_lista_simple;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class List {
    private Node start;
    private Node last;
    private int cont=0;
    
    public List(){
        this.start = null;
        this.last = null;
    }
    
    public void print(){
        Node temp = start;
        while(temp != null){
            System.out.print(temp.getValue() + " - ");
            temp =  temp.getNext();
        }
    }
    
    
    //Metodo para agregar nodo a final de la lista
    
    public void add(int value){
        Node newNode = new Node(value);
        cont++;
        if(start ==  null){//No hay nodos en la lista
             start = newNode;
             last = newNode;
        }else{ // Existen nodos en la lista.
            /*
            Hay que movernos por la lista
            Usamos un nodo temporal hasta el ultimo nodo de la lista
            */
//            Node temp = start;
//            while(temp.getNext() != null){
//                temp =  temp.getNext();
//            }
//            temp.setNext(newNode);
              last.setNext(newNode);
              last = newNode;
              
        }
        
    }
    
    public int size(){
        return cont;
    }
    
    public void insertInto(int value, int pos){
        //Insertar en una posicion no valida
        //Posiciones negativas o mayores a la cantidad de elementos;
        
    }
    
    
}
