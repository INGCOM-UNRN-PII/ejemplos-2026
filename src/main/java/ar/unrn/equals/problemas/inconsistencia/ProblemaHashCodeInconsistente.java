package ar.unrn.equals.problemas.inconsistencia;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete muestra como un objeto mutable deja de ser ubicable cuando el hash cambia despues de haber sido insertado en una coleccion.
 */
public class ProblemaHashCodeInconsistente {

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
