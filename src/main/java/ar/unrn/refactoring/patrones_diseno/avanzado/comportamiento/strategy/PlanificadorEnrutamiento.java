package ar.unrn.refactoring.patrones_diseno.avanzado.comportamiento.strategy;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde el planificador cambia heuristicas de enrutamiento con un switch centralizado.
 */
public class PlanificadorEnrutamiento {
    public String resolver(String modo, int latencia, int costo, int saturacion) {
        if ("rapido".equals(modo)) {
            return latencia < 20 ? "canal-a" : "canal-b";
        }
        if ("economico".equals(modo)) {
            return costo < 100 ? "canal-c" : "canal-d";
        }
        return saturacion < 70 ? "canal-a" : "canal-d";
    }
}
