    package ar.unrn.refactoring.enunciados.basico.movimiento_entre_objetos.remove_middle_man;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Pedido {
    private Pago dato;

    public Pago dato() {
        return dato;
    }

    public double monto() {
        return dato.monto();
    }
}

class Pago {
    public double monto() {
        return 1200;
    }
}
