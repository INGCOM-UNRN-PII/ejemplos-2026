    package ar.unrn.refactoring.enunciados.intermedio.generalizacion_y_jerarquias.pull_up_field;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class ReservaBase {
}

class ReservaCorta extends ReservaBase {
    protected String codigo;
}

class ReservaLarga extends ReservaBase {
    protected String codigo;
}
