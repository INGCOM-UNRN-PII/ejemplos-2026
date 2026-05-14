    package ar.unrn.refactoring.enunciados.avanzado.limpieza_y_nombres.remove_dead_code;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class FacturadorClinico {
    public double total(double base) {
        return base * 1.21;
    }

    private double calculoViejo(double base) {
        return base * 1.18;
    }
}
