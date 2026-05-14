    package ar.unrn.refactoring.enunciados.avanzado.composicion_de_funciones.inline_variable;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class LiquidadorInternacion {
    public double totalFinal(CasoClinico dato) {
        double subtotal = dato.cantidad() * dato.precioUnitario();
        return subtotal - dato.descuento();
    }
}

record CasoClinico(int cantidad, double precioUnitario, double descuento) {
}
