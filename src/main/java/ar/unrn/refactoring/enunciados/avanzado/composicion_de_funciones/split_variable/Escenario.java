    package ar.unrn.refactoring.enunciados.avanzado.composicion_de_funciones.split_variable;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CalculadoraCuentaClinica {
    public double calcular(double subtotal, double descuento, double impuesto) {
        double valor = subtotal;
        valor = valor - descuento;
        valor = valor + impuesto;
        return valor;
    }
}
