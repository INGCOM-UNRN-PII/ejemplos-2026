package ar.unrn.refactoring.patrones_diseno.intermedio.estructurales.decorator;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde un notificador agrega email, sms y auditoria con flags.
 */
public class NotificadorPedidos {
    public void notificar(String mensaje, boolean email, boolean sms, boolean auditoria) {
        System.out.println("Base: " + mensaje);
        if (email) {
            System.out.println("Email: " + mensaje);
        }
        if (sms) {
            System.out.println("SMS: " + mensaje);
        }
        if (auditoria) {
            System.out.println("Auditoria: " + mensaje);
        }
    }
}
