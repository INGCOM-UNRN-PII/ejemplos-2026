    package ar.unrn.refactoring.enunciados.basico.movimiento_entre_objetos.move_function;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CuentaCliente {
    private double saldo;
    private TipoCuenta tipo;

    public double cargoMensual() {
        return saldo * tipo.factor();
    }
}

class TipoCuenta {
    public double factor() {
        return 0.12;
    }
}
