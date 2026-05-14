    package ar.unrn.refactoring.enunciados.basico.composicion_de_funciones.inline_variable;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class ResumenPedido {
    public double totalFinal(Pedido dato) {
        double subtotal = dato.cantidad() * dato.precioUnitario();
        return subtotal - dato.descuento();
    }
}

record Pedido(int cantidad, double precioUnitario, double descuento) {
}
