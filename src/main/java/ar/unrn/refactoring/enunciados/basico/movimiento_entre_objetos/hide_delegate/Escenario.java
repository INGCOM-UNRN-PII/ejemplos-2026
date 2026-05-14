    package ar.unrn.refactoring.enunciados.basico.movimiento_entre_objetos.hide_delegate;

    /**
     * Material base para el ejercicio de refactorizacion.
     * El paquete contiene clases deliberadamente imperfectas para discutir cambios de diseno.
     */
    public class Escenario {
    }

    class Pedido {
    private Cliente titular;

    public Cliente titular() {
        return titular;
    }
}

class Cliente {
    private Direccion detalle;

    public Direccion detalle() {
        return detalle;
    }
}

class Direccion {
    public String codigo() {
        return "X-01";
    }
}
