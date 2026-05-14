    package ar.unrn.refactoring.enunciados.intermedio.generalizacion_y_jerarquias.pull_up_constructor_body;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class EntidadReserva {
    protected String nombre;
    protected boolean activo;
}

class Huesped extends EntidadReserva {
    public Huesped(String nombre) {
        this.nombre = nombre;
        this.activo = true;
    }
}

class Anfitrion extends EntidadReserva {
    public Anfitrion(String nombre) {
        this.nombre = nombre;
        this.activo = true;
    }
}
