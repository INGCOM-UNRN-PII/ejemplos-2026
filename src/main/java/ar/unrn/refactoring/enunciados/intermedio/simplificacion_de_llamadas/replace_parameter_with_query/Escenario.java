    package ar.unrn.refactoring.enunciados.intermedio.simplificacion_de_llamadas.replace_parameter_with_query;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CalculadoraReserva {
    public double totalConDescuento(Reserva dato, Huesped titular) {
        return dato.base() * titular.factor();
    }
}

class Reserva {
    private Huesped titular;
    private double base;

    public Huesped titular() {
        return titular;
    }

    public double base() {
        return base;
    }
}

class Huesped {
    public double factor() {
        return 0.9;
    }
}
