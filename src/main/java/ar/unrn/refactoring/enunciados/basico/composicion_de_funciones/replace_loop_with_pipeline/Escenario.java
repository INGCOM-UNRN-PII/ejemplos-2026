    package ar.unrn.refactoring.enunciados.basico.composicion_de_funciones.replace_loop_with_pipeline;

    import java.util.ArrayList;
import java.util.List;

/**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class InformeVentas {
    public double totalActivos(List<Pedido> datos) {
        double total = 0;
        for (Pedido dato : datos) {
            if (dato.activo()) {
                total += dato.total();
            }
        }
        return total;
    }
}

class PipelinePedidos {
    private final List<Pedido> origen;

    PipelinePedidos(List<Pedido> origen) {
        this.origen = origen;
    }

    public PipelinePedidos soloActivos() {
        return this;
    }

    public PipelinePedidos extraerTotales() {
        return this;
    }

    public double sumar() {
        double total = 0;
        for (Pedido dato : origen) {
            if (dato.activo()) {
                total += dato.total();
            }
        }
        return total;
    }
}

record Pedido(boolean activo, double total) {
}
