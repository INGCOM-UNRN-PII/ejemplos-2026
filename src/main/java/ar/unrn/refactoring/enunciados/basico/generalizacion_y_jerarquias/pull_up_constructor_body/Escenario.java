    package ar.unrn.refactoring.enunciados.basico.generalizacion_y_jerarquias.pull_up_constructor_body;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class PersonaBase {
    protected String nombre;
    protected boolean activo;
}

class Cliente extends PersonaBase {
    public Cliente(String nombre) {
        this.nombre = nombre;
        this.activo = true;
    }
}

class Proveedor extends PersonaBase {
    public Proveedor(String nombre) {
        this.nombre = nombre;
        this.activo = true;
    }
}
