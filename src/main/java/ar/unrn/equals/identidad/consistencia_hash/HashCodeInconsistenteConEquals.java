package ar.unrn.equals.identidad.consistencia_hash;

import java.util.HashSet;
import java.util.Set;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete muestra la relacion obligatoria entre equals y hashCode, especialmente cuando los objetos se almacenan en colecciones basadas en hash.
 */
public class HashCodeInconsistenteConEquals {
    public static void main(String[] args) {
        System.out.println("--- Problema: HashCode inconsistente con Equals ---");
        Set<PersonaHashCodeInconsistente> set = new HashSet<>();
        PersonaHashCodeInconsistente p1 = new PersonaHashCodeInconsistente("Juan");
        set.add(p1);
        System.out.println("Set contiene a Juan: " + set.contains(p1));
    }
}
