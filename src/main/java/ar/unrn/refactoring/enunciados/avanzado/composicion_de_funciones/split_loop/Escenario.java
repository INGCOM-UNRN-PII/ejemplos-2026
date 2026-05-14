    package ar.unrn.refactoring.enunciados.avanzado.composicion_de_funciones.split_loop;

    import java.util.List;

/**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class InformeGuardias {
    public Resumen procesar(List<Atencion> datos) {
        int cantidadActivos = 0;
        double total = 0;
        for (Atencion dato : datos) {
            if (dato.activo()) {
                cantidadActivos++;
            }
            total += dato.total();
        }
        return new Resumen(cantidadActivos, total);
    }
}

record Atencion(boolean activo, double total) {
}

record Resumen(int cantidadActivos, double total) {
}
