/*
    Crear un arreglo con 50 elementos, llenarlo con valores aleatorios entre 1 y 100
e imprimir una lista con los valores pares que contenga.  guardar los pares en un arreglo nuevo tamaño exacto del numero de pares que se generaron en ese rango.

*/
package eva1_16__ejercicio_arreglos_5;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA1_16__EJERCICIO_ARREGLOS_5 {

    public static void main(String[] args) {
    
        int[]  numeros = new int[50];
        int contadorPares=0;
        for(int i=0; i<numeros.length; i++){
            
            numeros[i] = (int)((Math.random()*100)+1);
            if(numeros[i]%2==0) contadorPares++;
        }
        
        System.out.println("Arreglo original");
        imprimirArreglo(numeros);
        
        
        int[] numerosPares = new int[contadorPares];
       
        for(int i=0,j=0; i<numeros.length; i++){
            if(numeros[i]%2==0){
                numerosPares[j]=numeros[i];
                j++;
        }   
    }
        System.out.println("Arreglo con los pares");
        imprimirArreglo(numerosPares);
    }
    public static void imprimirArreglo(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print("["+array[i]+"]");
        }
        System.out.println("");
       }
}
 
    

    

