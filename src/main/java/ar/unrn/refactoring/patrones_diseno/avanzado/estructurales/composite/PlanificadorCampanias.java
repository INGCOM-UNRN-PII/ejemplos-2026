package ar.unrn.refactoring.patrones_diseno.avanzado.estructurales.composite;

import java.util.List;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde el planificador distingue tareas simples y grupos con instanceof.
 */
public class PlanificadorCampanias {
    public int totalContactos(List<Object> nodos) {
        int total = 0;
        for (Object nodo : nodos) {
            if (nodo instanceof TareaSegmento tarea) {
                total += tarea.contactos();
            } else if (nodo instanceof GrupoSegmentos grupo) {
                for (TareaSegmento tarea : grupo.segmentos()) {
                    total += tarea.contactos();
                }
            }
        }
        return total;
    }
}

record TareaSegmento(String nombre, int contactos) { }
record GrupoSegmentos(String nombre, List<TareaSegmento> segmentos) { }
