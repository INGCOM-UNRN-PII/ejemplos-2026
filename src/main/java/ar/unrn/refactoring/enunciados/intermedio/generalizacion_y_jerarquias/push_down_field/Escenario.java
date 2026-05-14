    package ar.unrn.refactoring.enunciados.intermedio.generalizacion_y_jerarquias.push_down_field;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Reserva {
    protected String licencia;
}

class ReservaConAuto extends Reserva {
}

class ReservaSimple extends Reserva {
}
