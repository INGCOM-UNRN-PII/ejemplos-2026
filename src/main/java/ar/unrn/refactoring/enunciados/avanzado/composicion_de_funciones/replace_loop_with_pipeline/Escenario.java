    package ar.unrn.refactoring.enunciados.avanzado.composicion_de_funciones.replace_loop_with_pipeline;

    import java.util.ArrayList;
import java.util.List;

/**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class InformeGuardia {
    public double totalActivos(List<Atencion> datos) {
        double total = 0;
        for (Atencion dato : datos) {
            if (dato.activo()) {
                total += dato.total();
            }
        }
        return total;
    }
}

class PipelineAtenciones {
    private final List<Atencion> origen;

    PipelineAtenciones(List<Atencion> origen) {
        this.origen = origen;
    }

    public PipelineAtenciones soloActivos() {
        return this;
    }

    public PipelineAtenciones extraerTotales() {
        return this;
    }

    public double sumar() {
        double total = 0;
        for (Atencion dato : origen) {
            if (dato.activo()) {
                total += dato.total();
            }
        }
        return total;
    }
}

record Atencion(boolean activo, double total) {
}
