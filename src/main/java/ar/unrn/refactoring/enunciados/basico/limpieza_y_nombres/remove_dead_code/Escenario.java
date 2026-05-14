    package ar.unrn.refactoring.enunciados.basico.limpieza_y_nombres.remove_dead_code;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class FacturadorPedido {
    public double total(double base) {
        return base * 1.21;
    }

    private double calculoViejo(double base) {
        return base * 1.18;
    }
}
