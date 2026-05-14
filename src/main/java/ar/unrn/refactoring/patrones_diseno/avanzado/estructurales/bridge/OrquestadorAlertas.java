package ar.unrn.refactoring.patrones_diseno.avanzado.estructurales.bridge;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde el orquestador mezcla criticidad y canal de entrega en una sola decision central.
 */
public class OrquestadorAlertas {
    public String enviar(String severidad, String canal, String mensaje) {
        if ("critica".equals(severidad) && "sms".equals(canal)) {
            return "CRITICA SMS: " + mensaje;
        }
        if ("critica".equals(severidad) && "push".equals(canal)) {
            return "CRITICA PUSH: " + mensaje;
        }
        if ("operativa".equals(severidad) && "sms".equals(canal)) {
            return "OPERATIVA SMS: " + mensaje;
        }
        return "OPERATIVA PUSH: " + mensaje;
    }
}
