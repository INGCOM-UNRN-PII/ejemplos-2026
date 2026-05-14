package ar.unrn.refactoring.patrones_diseno.avanzado.comportamiento.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde el grafo expone nodos y enlaces para que otros lo recorran manualmente.
 */
public class GrafoPermisos {
    private final List<NodoPermiso> nodos = new ArrayList<>();

    public List<NodoPermiso> nodos() {
        return nodos;
    }
}

class ExploradorPermisos {
    public void recorrer(GrafoPermisos grafo) {
        for (NodoPermiso nodo : grafo.nodos()) {
            System.out.println(nodo.nombre());
            for (NodoPermiso hijo : nodo.hijos()) {
                System.out.println("- " + hijo.nombre());
            }
        }
    }
}

record NodoPermiso(String nombre, List<NodoPermiso> hijos) { }
