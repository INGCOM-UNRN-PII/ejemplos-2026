package ar.unrn.dos.equals.problemas;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Comparativa de rendimiento: HashCode Bueno vs HashCode Malo (Colisiones).
 * 
 * Muestra cómo el rendimiento de un HashMap se degrada de O(1) a O(N) 
 * (u O(log N) en versiones modernas de Java) cuando hay colisiones.
 */
public class ComparativaRendimientoHash {

    private static final int CANTIDAD_ELEMENTOS = 20_000;

    static class ObjetoBueno {
        private final int id;
        public ObjetoBueno(int id) { this.id = id; }
        @Override
        public boolean equals(Object o) {
            if (!(o instanceof ObjetoBueno that)) return false;
            return id == that.id;
        }
        @Override
        public int hashCode() { return Objects.hash(id); }
    }

    static class ObjetoMalo {
        private final int id;
        public ObjetoMalo(int id) { this.id = id; }
        @Override
        public boolean equals(Object o) {
            if (!(o instanceof ObjetoMalo that)) return false;
            return id == that.id;
        }
        @Override
        public int hashCode() { return 42; } // Colisión total
    }

    public static void main(String[] args) {
        System.out.println("--- Comparativa de Rendimiento de Hash ---");
        System.out.println("Elementos a procesar: " + CANTIDAD_ELEMENTOS);

        // 1. Prueba con HashCode Bueno
        long inicioBueno = System.currentTimeMillis();
        Map<ObjetoBueno, String> mapaBueno = new HashMap<>();
        for (int i = 0; i < CANTIDAD_ELEMENTOS; i++) {
            mapaBueno.put(new ObjetoBueno(i), "Valor " + i);
        }
        long finBueno = System.currentTimeMillis();
        System.out.printf("\n[BUENO] Tiempo de inserción: %d ms%n", (finBueno - inicioBueno));

        long inicioBusquedaBueno = System.nanoTime();
        for (int i = 0; i < CANTIDAD_ELEMENTOS; i++) {
            mapaBueno.get(new ObjetoBueno(i));
        }
        long finBusquedaBueno = System.nanoTime();
        System.out.printf("[BUENO] Tiempo de búsqueda (total): %d μs%n", (finBusquedaBueno - inicioBusquedaBueno) / 1000);

        // 2. Prueba con HashCode Malo (Colisiones)
        long inicioMalo = System.currentTimeMillis();
        Map<ObjetoMalo, String> mapaMalo = new HashMap<>();
        for (int i = 0; i < CANTIDAD_ELEMENTOS; i++) {
            mapaMalo.put(new ObjetoMalo(i), "Valor " + i);
        }
        long finMalo = System.currentTimeMillis();
        System.out.printf("\n[MALO ] Tiempo de inserción: %d ms%n", (finMalo - inicioMalo));

        long inicioBusquedaMalo = System.nanoTime();
        for (int i = 0; i < CANTIDAD_ELEMENTOS; i++) {
            mapaMalo.get(new ObjetoMalo(i));
        }
        long finBusquedaMalo = System.nanoTime();
        System.out.printf("[MALO ] Tiempo de búsqueda (total): %d μs%n", (finBusquedaMalo - inicioBusquedaMalo) / 1000);

        double factorDiferencia = (double) (finBusquedaMalo - inicioBusquedaMalo) / (finBusquedaBueno - inicioBusquedaBueno);
        System.out.printf("\n=> La búsqueda con colisiones es %.2f veces más lenta.%n", factorDiferencia);
    }
}
