    package ar.unrn.refactoring.enunciados.intermedio.composicion_de_funciones.move_statements_into_function;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CoordinadorReservas {
    private final CalculadoraReserva calculadora = new CalculadoraReserva();

    public double totalComun(Reserva dato) {
        validar(dato);
        return calculadora.total(dato);
    }

    public double totalConPromocion(Reserva dato) {
        validar(dato);
        return calculadora.total(dato) * 0.9;
    }

    private void validar(Reserva dato) {
        if (dato.cantidad() <= 0) {
            throw new IllegalArgumentException("Cantidad invalida");
        }
    }
}

class CalculadoraReserva {
    public double total(Reserva dato) {
        return dato.cantidad() * dato.precioUnitario();
    }
}

record Reserva(int cantidad, double precioUnitario) {
}
