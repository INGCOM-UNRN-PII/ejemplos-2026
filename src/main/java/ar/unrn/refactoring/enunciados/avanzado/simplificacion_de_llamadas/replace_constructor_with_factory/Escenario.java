    package ar.unrn.refactoring.enunciados.avanzado.simplificacion_de_llamadas.replace_constructor_with_factory;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Internacion {
    private final String tipo;
    private final String codigo;

    public Internacion(String tipo, String codigo) {
        this.tipo = tipo;
        this.codigo = codigo;
    }

    public String tipo() {
        return tipo;
    }

    public String codigo() {
        return codigo;
    }
}
