    package ar.unrn.refactoring.enunciados.avanzado.generalizacion_y_jerarquias.push_down_method;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Paciente {
    public double beneficioEspecial() {
        return 0;
    }
}

class PacienteConCobertura extends Paciente {
}

class PacienteParticular extends Paciente {
}
