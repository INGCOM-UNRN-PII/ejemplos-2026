    package ar.unrn.refactoring.enunciados.intermedio.generalizacion_y_jerarquias.push_down_method;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Reserva {
    public double beneficioEspecial() {
        return 0;
    }
}

class ReservaConMillas extends Reserva {
}

class ReservaBasica extends Reserva {
}
