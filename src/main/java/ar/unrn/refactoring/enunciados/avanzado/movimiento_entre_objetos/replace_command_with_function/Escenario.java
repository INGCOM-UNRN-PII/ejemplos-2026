    package ar.unrn.refactoring.enunciados.avanzado.movimiento_entre_objetos.replace_command_with_function;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class LiquidadorCuentaClinica {
    private final Internacion dato;
    private double resultado;

    LiquidadorCuentaClinica(Internacion dato) {
        this.dato = dato;
    }

    public void ejecutar() {
        resultado = dato.base() - dato.descuento();
    }

    public double resultado() {
        return resultado;
    }
}

record Internacion(double base, double descuento) {
}
