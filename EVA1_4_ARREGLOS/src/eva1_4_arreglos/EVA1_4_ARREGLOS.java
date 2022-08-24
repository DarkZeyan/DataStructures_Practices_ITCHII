/*

 */
package eva1_4_arreglos;

/**
 *
 * @author Jorge Eduardo Escobar Bugarini - ISC - 21550317
 */
public class EVA1_4_ARREGLOS {

    /*
     Los arreglos son TDA. Tipo de Dato Abstracto.(Objetos y clases)
     Arreglos en java -> Objetos ->  TDA
    
    camelCase.
    
    funciones e identificadores -> empiezan en minusculas
    funciones -> indican una accion -> verbos
    Clases -> Inician en mayusculas
    */
    public static void main(String[] args) {
        // TODO code application logic here'
        // Tipo de dato [] identificador = new tipoDato[longitud]

        //Arreglo de enteros para capturar edades
        
        //Identificadores de enteros
        int[] edades, salarios, calificaciones;
        //Solo promedios es arreglo.
        double promedios[], porcentaje;
        
        edades = new int[10];
        System.out.println(edades);
        
        for (int i = 0; i < edades.length; i++) {
            edades[i]= (int)(Math.random()*100);
        }
        for(int i=0; i<edades.length; i++){
            System.out.println("Posicion "+i+" = "+edades[i]);
        }
        
        
        
        
    }
    
}
