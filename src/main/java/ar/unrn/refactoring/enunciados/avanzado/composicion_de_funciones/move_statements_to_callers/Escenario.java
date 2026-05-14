    package ar.unrn.refactoring.enunciados.avanzado.composicion_de_funciones.move_statements_to_callers;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class ArmadorHistoriaClinica {
    public String resumen(Paciente dato) {
        imprimirEncabezado();
        return dato.codigo() + " - " + dato.descripcion();
    }

    private void imprimirEncabezado() {
        System.out.println("=== encabezado ===");
    }
}

record Paciente(String codigo, String descripcion) {
}
