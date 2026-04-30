package ar.unrn.solid.ocp;

import java.util.List;

/**
 * OCP CUMPLIDO: Esta clase está cerrada a la modificación pero abierta a la extensión.
 * Si agregamos 'Triangulo', esta clase NO cambia.
 */
public class GeneradorArea {
    public double calcularAreaTotal(List<Forma> formas) {
        double total = 0;
        for (Forma forma : formas) {
            total += forma.calcularArea();
        }
        return total;
    }
}
