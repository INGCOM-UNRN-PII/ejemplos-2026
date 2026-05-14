    package ar.unrn.refactoring.enunciados.basico.composicion_de_funciones.replace_derived_variable_with_query;

    import java.util.ArrayList;
import java.util.List;

/**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Pedido {
    private final List<LineaPedido> items = new ArrayList<>();
    private double total;

    public void agregar(LineaPedido item) {
        items.add(item);
        total += item.monto();
    }

    public double total() {
        return total;
    }
}

record LineaPedido(double monto) {
}
