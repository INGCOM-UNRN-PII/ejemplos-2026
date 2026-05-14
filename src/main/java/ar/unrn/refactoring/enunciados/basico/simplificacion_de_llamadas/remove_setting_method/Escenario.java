    package ar.unrn.refactoring.enunciados.basico.simplificacion_de_llamadas.remove_setting_method;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Pedido {
    private String codigo;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String codigo() {
        return codigo;
    }
}
