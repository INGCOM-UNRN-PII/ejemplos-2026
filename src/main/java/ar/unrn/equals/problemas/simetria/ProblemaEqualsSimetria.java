package ar.unrn.equals.problemas.simetria;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejemplo de violación de Simetría.
 * Si A es igual a B, entonces B debe ser igual a A.
 */
public class ProblemaEqualsSimetria {

    @SuppressWarnings("EqualsIncompatibleType")
    public static void main(String[] args) {
        Usuario user = new Usuario("admin");
        String str = "admin";

        System.out.println("--- Violación de Simetría ---");
        System.out.println("user.equals(str): " + user.equals(str)); // true
        System.out.println("str.equals(user): " + str.equals(user)); // false (String no conoce a Usuario)

        List<Object> lista = new ArrayList<>();
        lista.add(user);

        System.out.println("¿Lista contiene 'admin' (String)?: " + lista.contains(str));
        // Dependiendo de la implementación de la lista, esto podría ser true o false.
        // Las colecciones de Java confían en que el programador respeta la simetría.
    }
}
