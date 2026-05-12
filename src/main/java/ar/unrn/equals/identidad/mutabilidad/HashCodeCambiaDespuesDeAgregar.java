package ar.unrn.equals.identidad.mutabilidad;

import java.util.HashSet;
import java.util.Set;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete usa estos tipos para mostrar como la mutabilidad puede romper la identidad logica despues de insertar objetos en una coleccion.
 */
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
