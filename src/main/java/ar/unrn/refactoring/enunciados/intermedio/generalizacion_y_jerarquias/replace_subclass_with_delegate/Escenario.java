    package ar.unrn.refactoring.enunciados.intermedio.generalizacion_y_jerarquias.replace_subclass_with_delegate;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Reserva {
    public double total() {
        return 1000;
    }
}

class ReservaPremium extends Reserva {
    @Override
    public double total() {
        return super.total() * 0.8;
    }
}
