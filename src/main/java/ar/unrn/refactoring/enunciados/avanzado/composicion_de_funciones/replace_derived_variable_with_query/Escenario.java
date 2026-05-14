    package ar.unrn.refactoring.enunciados.avanzado.composicion_de_funciones.replace_derived_variable_with_query;

    import java.util.ArrayList;
import java.util.List;

/**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CuentaPaciente {
    private final List<Prestacion> items = new ArrayList<>();
    private double total;

    public void agregar(Prestacion item) {
        items.add(item);
        total += item.monto();
    }

    public double total() {
        return total;
    }
}

record Prestacion(double monto) {
}
