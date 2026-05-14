    package ar.unrn.refactoring.enunciados.basico.movimiento_entre_objetos.inline_class;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Persona {
    private Telefono detalle;

    public Telefono detalle() {
        return detalle;
    }
}

class Telefono {
    private String valor;

    public String valor() {
        return valor;
    }
}
