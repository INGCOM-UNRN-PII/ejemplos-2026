    package ar.unrn.refactoring.enunciados.basico.generalizacion_y_jerarquias.remove_subclass;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Cliente {
    public String nombre() {
        return "base";
    }
}

class ClienteComun extends Cliente {
}
