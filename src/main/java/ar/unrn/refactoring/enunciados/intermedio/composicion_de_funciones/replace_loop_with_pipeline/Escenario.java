    package ar.unrn.refactoring.enunciados.intermedio.composicion_de_funciones.replace_loop_with_pipeline;

    import java.util.ArrayList;
import java.util.List;

/**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class InformeReservas {
    public double totalActivos(List<Reserva> datos) {
        double total = 0;
        for (Reserva dato : datos) {
            if (dato.activo()) {
                total += dato.total();
            }
        }
        return total;
    }
}

class PipelineReservas {
    private final List<Reserva> origen;

    PipelineReservas(List<Reserva> origen) {
        this.origen = origen;
    }

    public PipelineReservas soloActivos() {
        return this;
    }

    public PipelineReservas extraerTotales() {
        return this;
    }

    public double sumar() {
        double total = 0;
        for (Reserva dato : origen) {
            if (dato.activo()) {
                total += dato.total();
            }
        }
        return total;
    }
}

record Reserva(boolean activo, double total) {
}
