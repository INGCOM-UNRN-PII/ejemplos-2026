    package ar.unrn.refactoring.enunciados.intermedio.organizacion_de_datos.replace_magic_literal;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class CalculadoraTarifa {
    public boolean requiereRevision(int valor) {
        return valor > 30;
    }

    public double aplicar(double base) {
        return base * 1.21;
    }
}
