    package ar.unrn.refactoring.enunciados.intermedio.simplificacion_de_llamadas.separate_query_from_modifier;

    import java.util.ArrayList;
import java.util.List;

/**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class ColaReservas {
    private final List<String> pendientes = new ArrayList<>();

    public int totalYLimpiar() {
        int total = pendientes.size();
        pendientes.clear();
        return total;
    }
}
