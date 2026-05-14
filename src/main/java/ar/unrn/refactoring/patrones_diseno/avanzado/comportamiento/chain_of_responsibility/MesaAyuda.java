package ar.unrn.refactoring.patrones_diseno.avanzado.comportamiento.chain_of_responsibility;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde la mesa de ayuda decide con if quien atiende cada caso.
 */
public class MesaAyuda {
    public String atender(Solicitud solicitud) {
        if (solicitud.prioridad() <= 1) {
            return "Bot atiende " + solicitud.tipo();
        }
        if (solicitud.prioridad() <= 3) {
            return "Agente atiende " + solicitud.tipo();
        }
        return "Especialista atiende " + solicitud.tipo();
    }
}

record Solicitud(String tipo, int prioridad) { }
