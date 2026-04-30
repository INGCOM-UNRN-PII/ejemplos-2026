package ar.unrn.genericos;

import java.util.List;

/**
 * Clase de utilidad que demuestra el uso de métodos genéricos y comodines (wildcards).
 * Incluye ejemplos de Upper Bounded y Lower Bounded Wildcards.
 */
public class UtilidadesListas {

    /**
     * Método genérico que imprime los elementos de cualquier lista.
     * Utiliza un Unbounded Wildcard (?).
     * 
     * @param lista la lista de elementos a imprimir.
     */
    public static void imprimirLista(List<?> lista) {
        for (Object elemento : lista) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    /**
     * Calcula la suma de los elementos de una lista de números.
     * Utiliza un Upper Bounded Wildcard ({@code ? extends Number}) para aceptar 
     * List de Integer, Double, etc.
     * 
     * @param lista la lista de números a sumar.
     * @return la suma de todos los elementos como un valor double.
     */
    public static double sumar(List<? extends Number> lista) {
        double suma = 0.0;
        for (Number n : lista) {
            suma += n.doubleValue();
        }
        return suma;
    }

    /**
     * Agrega una secuencia de números enteros (1 a 5) a una lista.
     * Utiliza un Lower Bounded Wildcard ({@code ? super Integer}) para aceptar 
     * listas de Integer o sus superclases (Number, Object).
     * 
     * @param lista la lista donde se agregarán los números.
     */
    public static void agregarNumeros(List<? super Integer> lista) {
        for (int i = 1; i <= 5; i++) {
            lista.add(i);
        }
    }
}
