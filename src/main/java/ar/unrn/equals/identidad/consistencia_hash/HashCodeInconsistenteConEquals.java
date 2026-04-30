package ar.unrn.equals.identidad.consistencia_hash;

import java.util.HashSet;
import java.util.Set;

public class HashCodeInconsistenteConEquals {
    public static void main(String[] args) {
        System.out.println("--- Problema: HashCode inconsistente con Equals ---");
        Set<PersonaHashCodeInconsistente> set = new HashSet<>();
        PersonaHashCodeInconsistente p1 = new PersonaHashCodeInconsistente("Juan");
        set.add(p1);
        System.out.println("Set contiene a Juan: " + set.contains(p1));
    }
}
