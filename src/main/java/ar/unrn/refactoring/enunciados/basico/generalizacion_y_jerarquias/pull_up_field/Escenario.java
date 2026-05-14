    package ar.unrn.refactoring.enunciados.basico.generalizacion_y_jerarquias.pull_up_field;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class PersonaBase {
}

class Cliente extends PersonaBase {
    protected String codigo;
}

class Proveedor extends PersonaBase {
    protected String codigo;
}
