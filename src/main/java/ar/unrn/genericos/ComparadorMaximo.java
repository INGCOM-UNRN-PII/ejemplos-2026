package ar.unrn.genericos;

import java.util.List;

/**
 * Ejemplo de Recursive Type Bound.
 * Útil para asegurar que un tipo T sea comparable con objetos de su mismo tipo.
 */
public class ComparadorMaximo {

    /**
     * Encuentra el máximo en una lista de elementos comparables.
     * T debe extender de Comparable<? super T>.
     * @param lista lista de elementos.
     * @param <T> el tipo de los elementos, que debe ser Comparable.
     * @return el elemento máximo.
     * @throws IllegalArgumentException si la lista está vacía.
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
