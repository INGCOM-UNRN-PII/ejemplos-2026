    package ar.unrn.refactoring.enunciados.basico.simplificacion_de_llamadas.return_modified_value;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class AplicadorDescuento {
    public void aplicar(Pedido dato) {
        dato.aplicar(0.1);
    }
}

class Pedido {
    private double total = 1000;

    public void aplicar(double factor) {
        total = total - (total * factor);
    }

    public double total() {
        return total;
    }
}
