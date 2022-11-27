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
        int[] array = new int[10];
        fill(array);
        //print the array
        printArray(array);
        //copy array
        double ini, fin;
        //Selection sort

        int[] arraySel = new int[array.length];
        duplicate(array, arraySel);
        printArray(arraySel);
        ini = System.nanoTime();
        selecSort(arraySel);
        fin = System.nanoTime();
        printArray(arraySel);
        System.out.println("Selection Sort: " + (fin - ini));
        //InsertionSort

        int[] arrayIns = new int[array.length];
        duplicate(array, arrayIns);
        printArray(arrayIns);
        ini = System.nanoTime();
        insertionSort(arrayIns);
        fin = System.nanoTime();
        printArray(arrayIns);

        System.out.println("Insertion Sort: " + (fin - ini));
        //Quicksort
        int[] arrayQuick = new int[array.length];
        duplicate(array, arrayQuick);
        printArray(arrayQuick);
        ini = System.nanoTime();
        quickSort(arrayQuick);
        fin = System.nanoTime();
        printArray(arrayQuick);
        System.out.println("QuickSort: " + (fin - ini));
    }

    public static void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 100));
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) {
                System.out.print("[ " + array[i] + "]");
            } else {
                System.out.print("[" + array[i] + "]");
            }
        }
        System.out.println("");
    }

    public static void duplicate(int array[], int copy[]) {
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
    }

    public static void selecSort(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];  // Es lo que se va a ordenar
            int insertion_point = i; // Se busca en que punto debe de quedarse el temp, esa posicion se almacena en insertion_point
            for (int prev = i - 1; prev >= 0; prev--) {
                //Se hace la comparacion
                if (array[prev] > temp) {
                    //Swap (intercambio parcial)
                    array[insertion_point] = array[prev];
                    insertion_point--;
                } else {
                    break;
                }
            }
            array[insertion_point] = temp;
        }
    }

    //Quicksort
    public static void quickSort(int array[]) {
        quickSortRecursion(array, 0, array.length - 1);
    }

    private static void quickSortRecursion(int array[], int start, int end) {
        //pivote → posicion
        // dos indices
        /*
         * Indice grande => busca los valores mayores al pivote
         * indice pequeño => busca los indices menores al pivote
         * Si se encuentran valores, se intercambia
         * Si se cruzan, se intercambia el pivote con el indice peque;o
         * quicksort a cada lado del pivote
         */
//
//        int pivote =  array[start];
//        int bigIndex =  start;
//        int smallIndex =  end;
//        do{
//           while(array[bigIndex]<pivote){
//               bigIndex++;
//           }
//           while(array[smallIndex]>pivote){
//               smallIndex--;
//           }
//           if(bigIndex<=smallIndex){
//               int temp =  array[bigIndex];
//               array[bigIndex]=array[smallIndex];
//               array[smallIndex]=temp;
//               bigIndex++;
//               smallIndex--;
//           }
//        }while(bigIndex<=smallIndex);
//        if(start<smallIndex){
//           quickSortRecursion(array, start, smallIndex);
//        }
//        if(bigIndex<end){
//           quickSortRecursion(array, bigIndex, end);
//        }


        /*
           Seleccionar el pivote
           Buscar mas pequeños que el pivote
           Buscar mas grandes que el pivote
         */
        int pivote, smallIndex, bigIndex, temp;
        pivote = start;
        smallIndex = end;
        bigIndex = start;
        //move the index
        if(start<end){
        while (bigIndex < smallIndex) {
            while (array[bigIndex] <= array[pivote] && (bigIndex < smallIndex)) {
             
                bigIndex++;
            }
            while (array[smallIndex] > array[pivote]) {
             
                smallIndex--;
                
            }

            if (bigIndex < smallIndex) {
                temp = array[bigIndex];
                array[bigIndex] = array[smallIndex];
                array[smallIndex] = temp;                
            }
        }
        temp = array[pivote];
        array[pivote] = array[smallIndex];
        array[smallIndex] = temp;
        pivote = smallIndex;
        
        quickSortRecursion(array,start,pivote-1);
        quickSortRecursion(array,pivote+1,end);
        }
    }

}
