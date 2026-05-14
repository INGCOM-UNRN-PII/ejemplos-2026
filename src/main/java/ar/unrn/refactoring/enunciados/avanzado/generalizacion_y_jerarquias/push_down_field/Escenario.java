    package ar.unrn.refactoring.enunciados.avanzado.generalizacion_y_jerarquias.push_down_field;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Paciente {
    protected String licencia;
}

class PacienteTrasladable extends Paciente {
}

class PacienteConsulta extends Paciente {
}
