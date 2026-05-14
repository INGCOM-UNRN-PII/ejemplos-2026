    package ar.unrn.refactoring.enunciados.intermedio.simplificacion_de_llamadas.replace_error_code_with_exception;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CuentaReserva {
    private double saldo;

    public int debitar(double monto) {
        if (saldo < monto) {
            return -1;
        }
        saldo -= monto;
        return 0;
    }
}
