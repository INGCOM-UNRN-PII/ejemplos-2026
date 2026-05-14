    package ar.unrn.refactoring.enunciados.basico.movimiento_entre_objetos.move_field;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Pedido {
    private String categoria;
    private Pais tipo;

    public String categoria() {
        return categoria;
    }

    public Pais tipo() {
        return tipo;
    }
}

class Pais {
    public boolean premium() {
        return true;
    }
}
