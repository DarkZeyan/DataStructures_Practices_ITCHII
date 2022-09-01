


package eva1_11_ejemplo_arreglos;
import java.util.Scanner;
/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA1_11_EJEMPLO_ARREGLOS {

    public static void main(String[] args) {

        Scanner zeyan = new Scanner(System.in);
        
        int numGrupos, numAlumnos;
        
        System.out.println("Introduce el numero de grupos");
        numGrupos = zeyan.nextInt();
        
        int[][] grupos = new int [numGrupos][];
        
        for (int i = 0; i < numGrupos; i++) {
            System.out.println("Introduce el numero de alumnos en el grupo "+(i+1));
            numAlumnos = zeyan.nextInt();
            grupos[i] = new int[numAlumnos];
        }
        
        System.out.println("Captura de calificaciones");
        for(int i=0; i<grupos.length; i++){
        
            for (int j = 0; j < grupos[i].length; j++) {
                System.out.println("Introduce la calificacion del Alumno "+(j+1)+" del grupo "+(i+1));
                grupos[i][j] = zeyan.nextInt();
            }
        }
        
        System.out.println("Salida de calificaciones");
       for(int i=0; i < grupos.length; i ++){
           System.out.println("Grupo "+(i+1));
           for(int j = 0; j<grupos[i].length; j++){
               System.out.println("Calificacion del alumno "+(j+1)+": "+grupos[i][j]);
           }
           
       }
        
        
    }
    
}
