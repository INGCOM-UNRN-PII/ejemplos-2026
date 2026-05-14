    package ar.unrn.refactoring.enunciados.intermedio.composicion_de_funciones.inline_variable;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CalculadoraReserva {
    public double totalFinal(Reserva dato) {
        double subtotal = dato.cantidad() * dato.precioUnitario();
        return subtotal - dato.descuento();
    }
}

record Reserva(int cantidad, double precioUnitario, double descuento) {
}
