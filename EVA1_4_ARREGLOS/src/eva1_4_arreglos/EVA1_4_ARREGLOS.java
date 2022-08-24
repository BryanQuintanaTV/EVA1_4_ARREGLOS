/*
 * " Evaluación 1 Practica 4 "Arreglos"
 *   24/08/2022 "
 */
package eva1_4_arreglos;

/**
 *
 * @author Quintana Juarez Bryan Alexis
 */
public class EVA1_4_ARREGLOS {

    public static void main(String[] args) {
        // TIPO DE DATO [] IDENTIFICADOR = new TIPO DE DATO [TAMAÑO]
        //Arreglo de enteros para capturar edades:
        //Todos los identificadores declarados son arreglos de enteros
        int[] arregloEdades, arregloSalario, arregloCali;
        //Solo "arregloPromedio" es un arreglo
        double arregloPromedio[],porcentaje;
        //Los arreglos son objetos
        
        arregloEdades = new int[50];
        System.out.println(arregloEdades);
        for (int i = 0; i < arregloEdades.length; i++) {
            arregloEdades[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < arregloEdades.length; i++) {
            System.out.println("[" + i + "] = " + arregloEdades[i]);
        }
    }
    
}
