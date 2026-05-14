    package ar.unrn.refactoring.enunciados.avanzado.simplificacion_de_llamadas.parameterize_function;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CalculadoraCopago {
    public double descuentoMayorista(double base) {
        return base * 0.10;
    }

    public double descuentoMinorista(double base) {
        return base * 0.05;
    }
}
