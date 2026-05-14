    package ar.unrn.refactoring.enunciados.avanzado.movimiento_entre_objetos.remove_middle_man;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Internacion {
    private Cobertura dato;

    public Cobertura dato() {
        return dato;
    }

    public double monto() {
        return dato.monto();
    }
}

class Cobertura {
    public double monto() {
        return 1200;
    }
}
