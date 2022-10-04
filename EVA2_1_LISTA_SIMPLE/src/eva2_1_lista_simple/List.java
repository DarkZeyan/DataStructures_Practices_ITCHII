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
            if(temp.getNext()!=null){
                System.out.print(temp.getValue() + " - ");
            }else{
                System.out.print(temp.getValue()+" ");
            }
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
    
    public void insertAt(int value, int pos) throws Exception{
        //Insertar en una posicion no valida
        //Posiciones negativas o mayores a la cantidad de elementos;
        if(pos < 0){
            throw new Exception("No es posible insertar un elemento en una posicion negativa");
        }else if(pos>=size()){
            throw new Exception(pos+" No es una posicion valida en la lista");
        }else{
            //Insertar al inicio de la lista
            Node newNode = new Node(value);
            cont++;
            if(pos==0){
                newNode.setNext(start);
                start = newNode;
            }else{
                Node temp = start;
                for(int i=1; i<pos-1; i++){
                    temp=temp.getNext();
                }
                    newNode.setNext(temp.getNext());
                    temp.setNext(newNode);
            }
        }
    }
    
    
}
