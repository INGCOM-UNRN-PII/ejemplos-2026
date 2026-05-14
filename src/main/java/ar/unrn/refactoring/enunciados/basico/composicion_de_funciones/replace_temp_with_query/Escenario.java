    package ar.unrn.refactoring.enunciados.basico.composicion_de_funciones.replace_temp_with_query;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Pedido {
    private int cantidad;
    private double precioUnitario;

    public double totalConBonificacion() {
        double base = cantidad * precioUnitario;
        if (base > 1000) {
            return base * 0.9;
        }
        return base;
    }
}
