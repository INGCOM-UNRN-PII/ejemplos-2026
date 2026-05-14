    package ar.unrn.refactoring.enunciados.avanzado.generalizacion_y_jerarquias.pull_up_field;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class FichaBase {
}

class PacienteAmbulatorio extends FichaBase {
    protected String codigo;
}

class PacienteInternado extends FichaBase {
    protected String codigo;
}
