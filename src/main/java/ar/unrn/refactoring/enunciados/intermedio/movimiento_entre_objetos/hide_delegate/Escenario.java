    package ar.unrn.refactoring.enunciados.intermedio.movimiento_entre_objetos.hide_delegate;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Reserva {
    private Huesped titular;

    public Huesped titular() {
        return titular;
    }
}

class Huesped {
    private Habitacion detalle;

    public Habitacion detalle() {
        return detalle;
    }
}

class Habitacion {
    public String codigo() {
        return "X-01";
    }
}
