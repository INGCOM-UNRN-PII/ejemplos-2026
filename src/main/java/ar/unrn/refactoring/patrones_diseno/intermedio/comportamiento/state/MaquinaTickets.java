package ar.unrn.refactoring.patrones_diseno.intermedio.comportamiento.state;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde una maquina cambia acciones segun un string de estado.
 */
public class MaquinaTickets {
    private String estado = "sin_pago";

    public String imprimir() {
        if ("sin_pago".equals(estado)) {
            return "Debe pagar";
        }
        if ("listo".equals(estado)) {
            estado = "entregado";
            return "Ticket impreso";
        }
        return "Operacion no disponible";
    }

    public void registrarPago() {
        if ("sin_pago".equals(estado)) {
            estado = "listo";
        }
    }
}
