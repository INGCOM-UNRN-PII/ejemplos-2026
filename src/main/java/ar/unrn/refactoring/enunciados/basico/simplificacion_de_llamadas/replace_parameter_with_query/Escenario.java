    package ar.unrn.refactoring.enunciados.basico.simplificacion_de_llamadas.replace_parameter_with_query;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CalculadoraPedido {
    public double totalConDescuento(Pedido dato, Cliente titular) {
        return dato.base() * titular.factor();
    }
}

class Pedido {
    private Cliente titular;
    private double base;

    public Cliente titular() {
        return titular;
    }

    public double base() {
        return base;
    }
}

class Cliente {
    public double factor() {
        return 0.9;
    }
}
