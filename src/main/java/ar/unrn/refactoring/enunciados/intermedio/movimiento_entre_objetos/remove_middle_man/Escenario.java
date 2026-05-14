    package ar.unrn.refactoring.enunciados.intermedio.movimiento_entre_objetos.remove_middle_man;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Reserva {
    private Tarifa dato;

    public Tarifa dato() {
        return dato;
    }

    public double monto() {
        return dato.monto();
    }
}

class Tarifa {
    public double monto() {
        return 1200;
    }
}
