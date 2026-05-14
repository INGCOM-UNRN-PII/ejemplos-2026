    package ar.unrn.refactoring.enunciados.basico.movimiento_entre_objetos.replace_command_with_function;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CalculadorTotal {
    private final Pedido dato;
    private double resultado;

    CalculadorTotal(Pedido dato) {
        this.dato = dato;
    }

    public void ejecutar() {
        resultado = dato.base() - dato.descuento();
    }

    public double resultado() {
        return resultado;
    }
}

record Pedido(double base, double descuento) {
}
