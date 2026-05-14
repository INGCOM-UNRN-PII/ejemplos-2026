package ar.unrn.refactoring.patrones_diseno.intermedio.estructurales.bridge;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde tipo de notificacion y canal se mezclan en una sola jerarquia.
 */
public class ServicioNotificaciones {
    public String enviar(String tipo, String canal, String mensaje) {
        if ("urgente".equals(tipo) && "sms".equals(canal)) {
            return "URGENTE SMS: " + mensaje;
        }
        if ("urgente".equals(tipo) && "email".equals(canal)) {
            return "URGENTE EMAIL: " + mensaje;
        }
        if ("normal".equals(tipo) && "sms".equals(canal)) {
            return "NORMAL SMS: " + mensaje;
        }
        return "NORMAL EMAIL: " + mensaje;
    }
}
