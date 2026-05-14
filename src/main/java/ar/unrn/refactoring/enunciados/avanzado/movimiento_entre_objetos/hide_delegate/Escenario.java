    package ar.unrn.refactoring.enunciados.avanzado.movimiento_entre_objetos.hide_delegate;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Internacion {
    private Paciente titular;

    public Paciente titular() {
        return titular;
    }
}

class Paciente {
    private Cobertura detalle;

    public Cobertura detalle() {
        return detalle;
    }
}

class Cobertura {
    public String codigo() {
        return "X-01";
    }
}
