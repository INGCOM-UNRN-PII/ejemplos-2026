    package ar.unrn.refactoring.enunciados.basico.simplificacion_de_llamadas.preserve_whole_object;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class ValidadorPedido {
    public boolean dentroDelRango(double minimo, double maximo, double valor) {
        return valor >= minimo && valor <= maximo;
    }
}

record RangoCompra(double minimo, double maximo) {
}
