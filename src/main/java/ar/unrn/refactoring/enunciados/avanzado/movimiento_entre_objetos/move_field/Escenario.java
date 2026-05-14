    package ar.unrn.refactoring.enunciados.avanzado.movimiento_entre_objetos.move_field;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Internacion {
    private String categoria;
    private Cobertura tipo;

    public String categoria() {
        return categoria;
    }

    public Cobertura tipo() {
        return tipo;
    }
}

class Cobertura {
    public boolean premium() {
        return true;
    }
}
