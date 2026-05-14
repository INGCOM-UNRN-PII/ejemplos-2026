    package ar.unrn.refactoring.enunciados.avanzado.generalizacion_y_jerarquias.pull_up_constructor_body;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class RegistroClinico {
    protected String nombre;
    protected boolean activo;
}

class Paciente extends RegistroClinico {
    public Paciente(String nombre) {
        this.nombre = nombre;
        this.activo = true;
    }
}

class Profesional extends RegistroClinico {
    public Profesional(String nombre) {
        this.nombre = nombre;
        this.activo = true;
    }
}
