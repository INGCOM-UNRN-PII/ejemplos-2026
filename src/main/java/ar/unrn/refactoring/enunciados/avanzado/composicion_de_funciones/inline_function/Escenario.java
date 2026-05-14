    package ar.unrn.refactoring.enunciados.avanzado.composicion_de_funciones.inline_function;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class ValidadorCobertura {
    public boolean aplicaBeneficio(SolicitudClinica dato) {
        return cumpleCondicion(dato);
    }

    private boolean cumpleCondicion(SolicitudClinica dato) {
        return dato.total() > 1000 && dato.activo();
    }
}

record SolicitudClinica(double total, boolean activo) {
}
