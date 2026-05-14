    package ar.unrn.refactoring.enunciados.intermedio.movimiento_entre_objetos.replace_command_with_function;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class GeneradorResumenReserva {
    private final Reserva dato;
    private double resultado;

    GeneradorResumenReserva(Reserva dato) {
        this.dato = dato;
    }

    public void ejecutar() {
        resultado = dato.base() - dato.descuento();
    }

    public double resultado() {
        return resultado;
    }
}

record Reserva(double base, double descuento) {
}
