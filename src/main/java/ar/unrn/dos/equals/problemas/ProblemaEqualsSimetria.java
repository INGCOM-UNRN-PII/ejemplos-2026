package ar.unrn.dos.equals.problemas;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejemplo de violación de Simetría.
 * Si A es igual a B, entonces B debe ser igual a A.
 */
public class ProblemaEqualsSimetria {

    static class Usuario {
        private String login;

        public Usuario(String login) { this.login = login; }

        @Override
        public boolean equals(Object o) {
            if (o instanceof Usuario u) return login.equals(u.login);
            if (o instanceof String s) return login.equals(s); // ¡ERROR! No es simétrico
            return false;
        }

        @Override
        public int hashCode() { return login.hashCode(); }
    }

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
