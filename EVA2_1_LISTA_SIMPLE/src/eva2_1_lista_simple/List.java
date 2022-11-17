package eva2_1_lista_simple;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class List {

    private Node start;
    private Node last;
    private int cont = 0;

    //Constructor default de la lista.
    public List() {
        this.start = null;
        this.last = null;
    }

    // Metodo para imprimir los nodos de la lista.
    public void print() {
        Node temp = start;
        //Se evalua si el nodo es distinto de null para imprimir, si es null no se imprime ningun nodo y se recurre a imprimir el mensaje de lista vacia.
        while (temp != null) {
            if (temp.getNext() != null) {
                System.out.print(temp.getValue() + " - ");
            } else {
                System.out.print(temp.getValue() + " ");
            }
            temp = temp.getNext();
        }
        if (size() == 0) {
            System.out.println("La lista esta vacia");
        }
    }

    //Metodo para agregar nodo a final de la lista
    public void add(int value) {
        Node newNode = new Node(value);
        cont++;
        if (start == null) {//No hay nodos en la lista
            start = newNode;
            last = newNode;
        } else { // Existen nodos en la lista.
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

    public int size() {
        return cont;
    }

    public void insertAt(int value, int pos) throws Exception {
        //Insertar en una posicion no valida
        //Posiciones negativas o mayores a la cantidad de elementos;
        if (pos < 0) {
            throw new Exception("No es posible insertar un elemento en una posicion negativa");
        } else if (pos >= size()) {
            throw new Exception(pos + " No es una posicion valida en la lista");
        } else {

            Node newNode = new Node(value);
            cont++; // El contador se aumenta en uno debido a la creacion del nuevo nodo, este asegura un incremento en el numero de elementos de la lista.
            //Insertar al inicio de la lista
            if (pos == 0) {
                newNode.setNext(start);
                start = newNode;
            } // Insertar en cualquier otra posicion
            else {
                Node temp = start;
                for (int i = 1; i < pos - 1; i++) {
                    temp = temp.getNext();
                }
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);
            }
        }
    }

    // Metodo para limpiar toda la lista.
    public void clear() {
        start = null;
        last = null;
        cont = 0;
    }

    //Metodo para eliminar elementos de la lista de acuerdo con una posicion de la lista
    public void deleteAt(int pos) throws Exception {
        //Se evalua si hay elementos o no en la lista, en caso de haberlos, se eliminan de acuerdo si son posicion valida o no, si no hay elementos, lanzar excepcion.
        if (start == null) {
            throw new Exception("No existen elementos en la lista, es imposible eliminar elementos");
        } else {
            // No pueden eliminarse elementos en posiciones negativas, pues estas no existen.
            if (pos < 0) {
                throw new Exception("No existen posiciones negativas en la lista");
            } else if (pos > size()) { //Se quieren eliminar elementos en posiciones que no existen debido a que estan fuera del numero de elementos, no se pueden eliminar.
                throw new Exception("No hay un elemento en la posicion asignada");
            } else { // Se pueden eliminar elementos debido a que el usuario ingreso una posicion valida.
                cont--;
                Node temp = start;
                if (pos == 0) {
                    //Se desconecta el primer elemento y se transfiere al siguiente para eliminar el elemento de la posicion 0.
                    start = temp.getNext();
                } else {
                    //Se eliminan elementos de cualquier otra posicion.
                    for (int i = 1; i < pos - 1; i++) {
                        //Se obtiene cada elemento hasta llegar a la posicion deseada.
                        temp = temp.getNext();
                    }
                    //Se asigna como siguiente al siguiente nodo del nodo actual.
                    temp.setNext(temp.getNext().getNext());
                    if (pos == size() - 1) { //Reconectar al final de la lista.
                        last = temp;
                    }
                }
            }
        }
    }

    public int getValueAt(int pos) throws Exception {
        Node temp = start;

        if (start == null) {
            throw new Exception("No existen elementos en la lista, es imposible obtener el elemento");
        } else {
            if (pos < 0) {
                throw new Exception("No existen posiciones negativas en la lista");
            } else if (pos > size()) { //Se quieren eliminar elementos en posiciones que no existen debido a que estan fuera del numero de elementos, no se pueden eliminar.
                throw new Exception("No hay un elemento en la posicion asignada");
            } else {
                if (pos == 0) {
                    return start.getValue();
                } else {
                    for (int i = 1; i < pos - 1; i++) {
                        //Se obtiene cada elemento hasta llegar a la posicion deseada.
                        temp = temp.getNext();
                    }
                    return temp.getValue();
                }
            }
        }
    }

    public boolean isEmpty() {
        return start == null;
    }

    public void find(int value){
        Node temp =  start;
        int pos=0;
        boolean valueExists=false;
        while(temp!=null){
            
            if(temp.getValue()==value){
                valueExists=true;
                break;
            }
            pos++;
            temp = temp.getNext();
        }
        if(valueExists){
            System.out.println("El valor esta en la posicion: "+pos);
        }else { 
            System.out.println("El valor no se encuentra en la lista");
        }
    }
}
