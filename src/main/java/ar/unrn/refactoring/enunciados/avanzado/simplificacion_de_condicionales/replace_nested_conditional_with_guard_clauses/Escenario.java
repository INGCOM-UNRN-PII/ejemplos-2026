    package ar.unrn.refactoring.enunciados.avanzado.simplificacion_de_condicionales.replace_nested_conditional_with_guard_clauses;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class ProcesadorAlta {
    public double total(boolean activo, boolean habilitado, double monto) {
        if (activo) {
            if (habilitado) {
                return monto;
            }
        }
        return 0;
    }
}
