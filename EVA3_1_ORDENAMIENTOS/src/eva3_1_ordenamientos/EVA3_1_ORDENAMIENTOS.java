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
        printArray(array);
        //copy array
        
        int[] arraySel = new int[array.length];
        duplicate(array,arraySel);
        printArray(arraySel);
        selecSort(arraySel);
        printArray(arraySel);
    }

    public static void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 100));
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]<10){
                   System.out.print("[ "+array[i] + "]");
            }else{
                   System.out.print("["+array[i] + "]");
            }
        }
        System.out.println("");
    }
    
    public static void duplicate(int array[], int copy[]){
        for (int i = 0; i < array.length; i++) {
            copy[i]=array[i];
        }
    }
    
    public static void selecSort(int array[]){
        for(int i=0; i < array.length; i++){
            int min = i;
            for(int j=i+1; j<array.length; j++){
                    if(array[j]<array[min])
                        min=j;
            }
            if(min!=i){
                int temp = array[i];
                array[i]=array[min];
                array[min] = temp;
            }
        }
    }

    public static void insertionSort(int[] array){
        for(int i=1; i<array.length; i++){
            int temp = array[i];  // Es lo que se va a ordenar
            int insertion_point = i; // Se busca en que punto debe de quedarse el temp, esa posicion se almacena en insertion_point
            for(int prev=i-1; prev>=0; prev--){
                //Se hace la comparacion
                if(array[prev]>temp){
                    //Swap (intercambio parcial)
                    array[insertion_point]=array[prev];
                    insertion_point--;
                }else{
                    
                }

            }
        }
    }

}
