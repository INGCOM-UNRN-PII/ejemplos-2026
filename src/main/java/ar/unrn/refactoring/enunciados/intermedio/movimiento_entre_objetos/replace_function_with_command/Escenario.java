    package ar.unrn.refactoring.enunciados.intermedio.movimiento_entre_objetos.replace_function_with_command;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CalculadoraHospedaje {
    public double total(Reserva dato) {
        double subtotal = dato.base() - dato.descuento();
        double impuestos = subtotal * dato.impuesto();
        return subtotal + impuestos;
    }
}

record Reserva(double base, double descuento, double impuesto) {
}
