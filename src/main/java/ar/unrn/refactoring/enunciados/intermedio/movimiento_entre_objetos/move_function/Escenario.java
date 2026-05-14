    package ar.unrn.refactoring.enunciados.intermedio.movimiento_entre_objetos.move_function;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CuentaReserva {
    private double saldo;
    private PoliticaReserva tipo;

    public double cargoMensual() {
        return saldo * tipo.factor();
    }
}

class PoliticaReserva {
    public double factor() {
        return 0.12;
    }
}
