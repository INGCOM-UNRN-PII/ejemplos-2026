package ar.unrn.dos.equals.problemas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Ejemplo de objetos que desaparecen de un Set por mutabilidad en hashCode.
 */
public class ProblemaHashCodeInconsistente {

    static class PuntoMutable {
        private int x, y;
        public PuntoMutable(int x, int y) { this.x = x; this.y = y; }
        public void setX(int x) { this.x = x; }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof PuntoMutable p)) return false;
            return x == p.x && y == p.y;
        }

        @Override
        public int hashCode() { return Objects.hash(x, y); }
    }

    public static void main(String[] args) {
        Set<PuntoMutable> puntos = new HashSet<>();
        PuntoMutable p = new PuntoMutable(1, 1);
        puntos.add(p);

        System.out.println("--- HashCode Inconsistente ---");
        System.out.println("¿Está el punto en el set?: " + puntos.contains(p)); // true

        // Modificamos el objeto MIENTRAS está en el set
        p.setX(10); 

        System.out.println("Después de modificar X...");
        System.out.println("¿Está el punto en el set?: " + puntos.contains(p)); 
        // ¡FALSE! El hashCode cambió, el Set lo busca en otro bucket y no lo encuentra.
        // El objeto sigue estando en el Set (size() es 1) pero es inalcanzable.
        System.out.println("Tamaño del set: " + puntos.size());
    }
}
