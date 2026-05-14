    package ar.unrn.refactoring.enunciados.basico.simplificacion_de_llamadas.remove_flag_argument;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class ProcesadorPedido {
    public String procesar(Pedido dato, boolean urgente) {
        if (urgente) {
            return "URGENTE:" + dato.codigo();
        }
        return dato.codigo();
    }
}

record Pedido(String codigo) {
}
