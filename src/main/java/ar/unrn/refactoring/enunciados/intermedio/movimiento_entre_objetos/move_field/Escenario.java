    package ar.unrn.refactoring.enunciados.intermedio.movimiento_entre_objetos.move_field;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Reserva {
    private String categoria;
    private Temporada tipo;

    public String categoria() {
        return categoria;
    }

    public Temporada tipo() {
        return tipo;
    }
}

class Temporada {
    public boolean premium() {
        return true;
    }
}
