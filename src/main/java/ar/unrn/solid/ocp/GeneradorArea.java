package ar.unrn.solid.ocp;

import java.util.List;

/**
 * Clase responsable de calcular el área total de una colección de formas.
 * Cumple con OCP al estar abierta a la extensión (nuevas formas)
 * pero cerrada a la modificación.
 */
public class GeneradorArea {
    /**
     * Calcula la suma de las áreas de todas las formas en la lista.
     *
     * @param formas la lista de objetos que implementan Forma.
     *
     * @return el área total acumulada.
     */
    public double calcularAreaTotal(List<Forma> formas) {
        double total = 0;
        for (Forma forma : formas) {
            total += forma.calcularArea();
        }
        return total;
    }
}
