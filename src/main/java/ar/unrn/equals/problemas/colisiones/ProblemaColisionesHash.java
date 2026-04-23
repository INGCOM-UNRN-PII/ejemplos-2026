package ar.unrn.dos.equals.problemas.colisiones;

import java.util.HashMap;
import java.util.Map;

/**
 * Demostración de colisiones forzadas por un mal hashCode.
 * 
 * Cuando muchos objetos devuelven el mismo hashCode, terminan en la misma
 * "cubeta" (bucket) del HashMap. Java resuelve esto usando una lista enlazada
 * (o un árbol) dentro de esa cubeta, pero el rendimiento cae drásticamente.
 */
public class ProblemaColisionesHash {

    static class MalaMesa {
        private final String id;

        public MalaMesa(String id) { this.id = id; }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof MalaMesa m)) return false;
            return id.equals(m.id);
        }

        @Override
        public int hashCode() {
            // COLISIÓN TOTAL: Todos los objetos devuelven el mismo hash.
            // Esto es legal según el contrato (objetos iguales tienen igual hash),
            // pero es desastroso para el rendimiento.
            return 42;
        }
        
        @Override
        public String toString() { return id; }
    }

    public static void main(String[] args) {
        Map<MalaMesa, String> mapa = new HashMap<>();
        
        System.out.println("--- Problema de Colisiones Forzadas ---");
        
        // Agregamos 3 objetos distintos.
        // Todos irán a la misma cubeta porque hashCode() siempre es 42.
        mapa.put(new MalaMesa("A"), "Valor A");
        mapa.put(new MalaMesa("B"), "Valor B");
        mapa.put(new MalaMesa("C"), "Valor C");

        System.out.println("Tamaño del mapa: " + mapa.size());
        
        // Al buscar "B", Java:
        // 1. Calcula hash ("42").
        // 2. Va a la cubeta 42.
        // 3. Como hay 3 objetos ahí, debe recorrer la lista llamando a EQUALS()
        //    uno por uno hasta encontrar el correcto.
        System.out.println("Buscando B: " + mapa.get(new MalaMesa("B")));

        System.out.println("\nEfecto en el rendimiento:");
        System.out.println("- Con un buen hashCode: Acceso O(1) (Casi instantáneo).");
        System.out.println("- Con este hashCode: Acceso O(n) (Debe comparar con todos los elementos de la cubeta).");
        System.out.println("- En un mapa con 100.000 elementos, esto significaría 100.000 llamadas a equals() por cada búsqueda.");
    }
}
