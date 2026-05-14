    package ar.unrn.refactoring.enunciados.intermedio.generalizacion_y_jerarquias.remove_subclass;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Reserva {
    public String nombre() {
        return "base";
    }
}

class ReservaComun extends Reserva {
}
