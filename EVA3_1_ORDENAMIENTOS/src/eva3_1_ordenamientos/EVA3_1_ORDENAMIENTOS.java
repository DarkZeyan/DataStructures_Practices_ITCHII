/*
 * 
 * 
 */
package eva3_1_ordenamientos;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA3_1_ORDENAMIENTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Fill the array
        int[] array =  new int[10];
        fill(array);
        //print the array
        print(array);
        //copy array
        
        int[] arraySel = new int[array.length];
        duplicate(array,arraySel);
        print(arraySel);
    }

    public static void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 100));
        }
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]<10){
                   System.out.print("[ "+array[i] + "]");
            }else{
                   System.out.print("["+array[i] + "]");
            }
        }
        System.out.println("");
    }
    
    public static void duplicate(int array[], int[] copy){
        for(int i=0; i < array.length; i++){
            copy[i] = array[i];
        }
    }
}
