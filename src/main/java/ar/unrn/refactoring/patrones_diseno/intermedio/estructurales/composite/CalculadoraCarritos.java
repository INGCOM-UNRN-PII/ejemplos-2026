package ar.unrn.refactoring.patrones_diseno.intermedio.estructurales.composite;

import java.util.List;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde la calculadora distingue productos individuales y combos con instanceof.
 */
public class CalculadoraCarritos {
    public double total(List<Object> items) {
        double total = 0;
        for (Object item : items) {
            if (item instanceof Producto producto) {
                total += producto.precio();
            } else if (item instanceof Combo combo) {
                for (Producto producto : combo.productos()) {
                    total += producto.precio();
                }
            }
        }
        return total;
    }
}

record Producto(String nombre, double precio) { }
record Combo(String nombre, List<Producto> productos) { }
