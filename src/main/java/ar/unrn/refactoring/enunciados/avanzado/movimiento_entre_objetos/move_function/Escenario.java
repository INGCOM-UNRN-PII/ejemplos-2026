    package ar.unrn.refactoring.enunciados.avanzado.movimiento_entre_objetos.move_function;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CuentaPaciente {
    private double saldo;
    private PlanCobertura tipo;

    public double cargoMensual() {
        return saldo * tipo.factor();
    }
}

class PlanCobertura {
    public double factor() {
        return 0.12;
    }
}
