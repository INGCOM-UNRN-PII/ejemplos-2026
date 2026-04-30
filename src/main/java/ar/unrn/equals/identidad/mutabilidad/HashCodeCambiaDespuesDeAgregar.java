package ar.unrn.equals.identidad.mutabilidad;

import java.util.HashSet;
import java.util.Set;

public class HashCodeCambiaDespuesDeAgregar {
    public static void main(String[] args) {
        System.out.println("--- Problema: HashCode cambia tras agregar a Set ---");
        Set<PersonaMutable> set = new HashSet<>();
        PersonaMutable p = new PersonaMutable("Juan");
        set.add(p);
        System.out.println("Set contiene a Juan: " + set.contains(p));
        p.setNombre("Pedro");
        System.out.println("Después de cambiar nombre a Pedro...");
        System.out.println("Set contiene a p: " + set.contains(p));
        System.out.println("Tamaño del set: " + set.size());
    }
}
