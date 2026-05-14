    package ar.unrn.refactoring.enunciados.basico.generalizacion_y_jerarquias.replace_subclass_with_delegate;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Pedido {
    public double total() {
        return 1000;
    }
}

class PedidoUrgente extends Pedido {
    @Override
    public double total() {
        return super.total() * 0.8;
    }
}
