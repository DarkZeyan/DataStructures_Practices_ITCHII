/*
 * 
 * 
 */
package eva2_2_tipos_datos_genericos;

import java.util.LinkedList;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA2_2_TIPOS_DATOS_GENERICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> myList = new LinkedList<String>();
//        myList.
        GenericDataTypes<Integer> myObject = new GenericDataTypes<Integer>();
        myObject.setValue(100);
        System.out.println(myObject.getValue());
    }
   
}
    
class GenericDataTypes<Type>{
    private Type value;

        public Type getValue() {
            return value;
        }

        public void setValue(Type value) {
            this.value = value;
        }
    
}
