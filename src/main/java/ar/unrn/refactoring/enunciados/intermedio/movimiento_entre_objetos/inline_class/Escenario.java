    package ar.unrn.refactoring.enunciados.intermedio.movimiento_entre_objetos.inline_class;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Huesped {
    private ProgramaBeneficio detalle;

    public ProgramaBeneficio detalle() {
        return detalle;
    }
}

class ProgramaBeneficio {
    private String valor;

    public String valor() {
        return valor;
    }
}
