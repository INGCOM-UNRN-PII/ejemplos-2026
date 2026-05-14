    package ar.unrn.refactoring.enunciados.avanzado.movimiento_entre_objetos.inline_class;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Paciente {
    private FichaTemporal detalle;

    public FichaTemporal detalle() {
        return detalle;
    }
}

class FichaTemporal {
    private String valor;

    public String valor() {
        return valor;
    }
}
