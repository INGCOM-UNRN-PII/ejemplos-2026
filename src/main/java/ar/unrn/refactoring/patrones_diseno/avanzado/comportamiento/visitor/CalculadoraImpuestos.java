package ar.unrn.refactoring.patrones_diseno.avanzado.comportamiento.visitor;

import java.util.List;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde se calculan impuestos con instanceof sobre una jerarquia de productos.
 */
public class CalculadoraImpuestos {
    public double total(List<Object> items) {
        double total = 0;
        for (Object item : items) {
            if (item instanceof ProductoFisico fisico) {
                total += fisico.precio() * 1.21;
            } else if (item instanceof ServicioDigital digital) {
                total += digital.precio() * 1.10;
            }
        }
        return total;
    }
}

record ProductoFisico(double precio) { }
record ServicioDigital(double precio) { }
