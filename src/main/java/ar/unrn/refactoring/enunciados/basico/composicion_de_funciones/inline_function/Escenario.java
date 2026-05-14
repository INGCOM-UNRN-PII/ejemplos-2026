    package ar.unrn.refactoring.enunciados.basico.composicion_de_funciones.inline_function;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CalculadoraDescuento {
    public boolean aplicaBeneficio(Pedido dato) {
        return cumpleCondicion(dato);
    }

    private boolean cumpleCondicion(Pedido dato) {
        return dato.total() > 1000 && dato.activo();
    }
}

record Pedido(double total, boolean activo) {
}
