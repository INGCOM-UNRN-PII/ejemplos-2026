package ar.unrn.refactoring.patrones_diseno.avanzado.estructurales.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde cada asiento recrea el mismo estilo visual una y otra vez.
 */
public class MapaAsientos {
    private final List<Asiento> asientos = new ArrayList<>();

    public void agregar(int fila, int columna, String categoria) {
        asientos.add(new Asiento(fila, columna, new EstiloAsiento(categoria, "azul", "Arial")));
    }
}

record Asiento(int fila, int columna, EstiloAsiento estilo) { }
record EstiloAsiento(String categoria, String color, String fuente) { }
