    package ar.unrn.refactoring.enunciados.intermedio.generalizacion_y_jerarquias.pull_up_method;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class ReservaBase {
}

class ResumenReserva extends ReservaBase {
    public String descripcion() {
        return "COD-" + 10;
    }
}

class ConfirmacionReserva extends ReservaBase {
    public String descripcion() {
        return "COD-" + 10;
    }
}
