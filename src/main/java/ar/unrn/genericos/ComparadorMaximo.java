package ar.unrn.genericos;

import java.util.List;

/**
 * Clase que proporciona una utilidad para encontrar el elemento máximo
 * en una lista de objetos que implementan Comparable.
 * Este es un ejemplo de Recursive Type Bound.
 */
public class ComparadorMaximo {

    /**
     * Encuentra el máximo en una lista de elementos comparables.
     * T debe extender de Comparable{@code <? super T>}.
     *
     * @param <T>   el tipo de los elementos, que debe ser Comparable.
     * @param lista la lista de elementos.
     *
     * @return el elemento máximo de la lista.
     * @throws IllegalArgumentException si la lista es nula o está vacía.
     */
    public static <T extends Comparable<? super T>> T encontrarMaximo(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }

        T max = lista.get(0);
        for (T elemento : lista) {
            if (elemento.compareTo(max) > 0) {
                max = elemento;
            }
        }
        return max;
    }
}
