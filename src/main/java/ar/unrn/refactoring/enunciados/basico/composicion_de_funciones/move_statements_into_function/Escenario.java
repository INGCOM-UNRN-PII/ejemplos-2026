    package ar.unrn.refactoring.enunciados.basico.composicion_de_funciones.move_statements_into_function;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CajaPedido {
    private final CalculadoraPedido calculadora = new CalculadoraPedido();

    public double totalComun(Pedido dato) {
        validar(dato);
        return calculadora.total(dato);
    }

    public double totalConPromocion(Pedido dato) {
        validar(dato);
        return calculadora.total(dato) * 0.9;
    }

    private void validar(Pedido dato) {
        if (dato.cantidad() <= 0) {
            throw new IllegalArgumentException("Cantidad invalida");
        }
    }
}

class CalculadoraPedido {
    public double total(Pedido dato) {
        return dato.cantidad() * dato.precioUnitario();
    }
}

record Pedido(int cantidad, double precioUnitario) {
}
