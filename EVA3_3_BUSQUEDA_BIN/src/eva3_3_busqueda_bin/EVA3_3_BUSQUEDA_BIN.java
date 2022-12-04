/*
 * 
 * 
 */
package eva3_3_busqueda_bin;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */

import java.util.Scanner;
 public class EVA3_3_BUSQUEDA_BIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner zeyan = new Scanner(System.in);

        int[] data = new int[15];
        int[] dataSelec = new int[data.length];

        System.out.println("Original array");
        fill(data);
        printArray(data);

        System.out.println("Selection sort");
        duplicate(data,dataSelec);
        selecSort(dataSelec);
        printArray(dataSelec);
        System.out.println("Introduce el valor a buscar");
        int value = zeyan.nextInt();
        System.out.println();
        System.out.println("El valor esta en la posicion: "+binarySearch(dataSelec,value));
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
    
   //bUSQUEDA BINARIA
    public static int binarySearch(int array[], int value){
        return binarySearchRecursion(array,0,array.length-1,value );
    }
    private static int binarySearchRecursion(int array[], int start, int end,int value){
        int mid  = start+((end-start)/2); 
        int resu =-1;
        if(start<end){
            if(value==array[mid]) 
                resu=mid;
            else if(value<array[mid]){
                resu=binarySearchRecursion(array, start, mid-1, value);
            }
                
            else{
                resu=binarySearchRecursion(array, mid+1, end, value);
            }
        }
        return resu;
    }
}
