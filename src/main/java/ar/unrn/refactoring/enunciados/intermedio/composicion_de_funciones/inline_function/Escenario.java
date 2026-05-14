    package ar.unrn.refactoring.enunciados.intermedio.composicion_de_funciones.inline_function;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class GestorBonificacion {
    public boolean aplicaBeneficio(Reserva dato) {
        return cumpleCondicion(dato);
    }

    private boolean cumpleCondicion(Reserva dato) {
        return dato.total() > 1000 && dato.activo();
    }
}

record Reserva(double total, boolean activo) {
}
