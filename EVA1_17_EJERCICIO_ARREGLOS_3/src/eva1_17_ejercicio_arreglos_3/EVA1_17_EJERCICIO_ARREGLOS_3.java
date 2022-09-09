/*
 * 
    Generar una matriz 5x5 de enteros y rellenar con numeros aleatorios entre 1 y 100 e imprimir cada renglón
    y posteriormente generar una copia de la misma pero en orden inverso;
 * 
 */
package eva1_17_ejercicio_arreglos_3;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA1_17_EJERCICIO_ARREGLOS_3 {

    public static void main(String[] args) {
    
        
        int[][] matriz = new int [5][5];
        System.out.println("Matriz original: \n");
        for(int i=0; i<matriz.length; i++){
            
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = (int)((Math.random()*100)+1);
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        
        int[][] matrizInversa = new int [matriz.length][matriz.length];
        System.out.println("Matriz inversa: \n");
        for(int i=0; i<matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                matrizInversa[i][j] = matriz[(matriz.length-1)-i][(matriz[i].length-1)-j];
                   System.out.print("["+matrizInversa[i][j]+"]");
             }
            System.out.println("");
        }
    
    
    }
    
}
