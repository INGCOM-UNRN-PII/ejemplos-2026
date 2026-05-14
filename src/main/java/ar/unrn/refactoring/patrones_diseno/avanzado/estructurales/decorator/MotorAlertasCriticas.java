package ar.unrn.refactoring.patrones_diseno.avanzado.estructurales.decorator;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde el motor de alertas combina extras con flags acumuladas.
 */
public class MotorAlertasCriticas {
    public void enviar(String mensaje, boolean cifrado, boolean auditado, boolean reintentos, boolean sms) {
        System.out.println("Base: " + mensaje);
        if (cifrado) {
            System.out.println("Cifrado aplicado");
        }
        if (auditado) {
            System.out.println("Auditoria registrada");
        }
        if (reintentos) {
            System.out.println("Reintentos habilitados");
        }
        if (sms) {
            System.out.println("Enviado por SMS");
        }
    }
}
