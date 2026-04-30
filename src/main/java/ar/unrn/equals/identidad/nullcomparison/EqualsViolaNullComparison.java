package ar.unrn.equals.identidad.nullcomparison;

import java.util.Objects;

/**
 * Ejemplo que viola la regla de comparación con NULL del contrato de equals.
 * <p>
 * Contrato: Para cualquier referencia no-null x, x.equals(null) debe retornar false
 * <p>
 * Problema: Implementaciones incorrectas que lanzan excepciones o retornan true
 * al comparar con null.
 */
public class EqualsViolaNullComparison {

    /**
     * Clase que NO verifica null y lanza NullPointerException
     */
    static class PersonaSinCheckNull {
        private final String nombre;

        public PersonaSinCheckNull(String nombre) {
            this.nombre = nombre;
        }

        /**
         * IMPLEMENTACIÓN INCORRECTA: No verifica null
         */
        @SuppressWarnings({"EqualsHashCode", "CastToConcreteType"})
        @Override
        public boolean equals(Object obj) {
            // PROBLEMA: Si obj es null, el cast o el acceso posterior fallará.
            // En este caso, el cast podría fallar si se usa incorrectamente,
            // pero si obj es null, 'otra' será null y 'otra.nombre' lanzará NPE.
            PersonaSinCheckNull otra = (PersonaSinCheckNull) obj;
            return nombre.equals(otra.nombre);
        }

        @Override
        public int hashCode() {
            return nombre != null ? nombre.hashCode() : 0;
        }
    }

    /**
     * Clase con lógica errónea que retorna true para null
     */
    static class PersonaConLogicaErronea {
        private final String nombre;

        public PersonaConLogicaErronea(String nombre) {
            this.nombre = nombre;
        }

        /**
         * IMPLEMENTACIÓN INCORRECTA: Retorna true para null
         */
        @SuppressWarnings("EqualsHashCode")
        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return true; // VIOLACIÓN DEL CONTRATO
            }
            if (!(obj instanceof PersonaConLogicaErronea)) {
                return false;
            }
            PersonaConLogicaErronea otra = (PersonaConLogicaErronea) obj;
            return Objects.equals(nombre, otra.nombre);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nombre);
        }
    }

    /**
     * Clase con verificación explícita CORRECTA de null
     */
    static class PersonaCorrecta {
        private final String nombre;

        public PersonaCorrecta(String nombre) {
            this.nombre = nombre;
        }

        /**
         * IMPLEMENTACIÓN CORRECTA: Verifica null explícitamente primero
         */
        @Override
        public boolean equals(Object obj) {
            // Verificación explícita de null
            if (obj == null) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            PersonaCorrecta otra = (PersonaCorrecta) obj;
            return Objects.equals(nombre, otra.nombre);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nombre);
        }
    }

    @SuppressWarnings({"EqualsNull", "NullAway"})
    public static void main(String[] args) {
        System.out.println("=== Problema 1: NullPointerException ===\n");

        PersonaSinCheckNull persona1 = new PersonaSinCheckNull("Juan");

        try {
            boolean resultado = persona1.equals(null);
            System.out.println("persona1.equals(null): " + resultado);
        } catch (NullPointerException e) {
            System.out.println("❌ PROBLEMA: persona1.equals(null) lanzó NullPointerException");
            System.out.println("Causa: No se verifica null antes de hacer cast o llamar métodos");
        }

        System.out.println("\n=== Problema 2: Retorna true para null ===\n");
        PersonaConLogicaErronea personaErronea = new PersonaConLogicaErronea("Ana");
        if (personaErronea.equals(null)) {
            System.out.println("❌ PROBLEMA: personaErronea.equals(null) retornó true");
            System.out.println("Causa: Lógica incorrecta que retorna true al recibir null");
        }

        System.out.println("\n=== Implementación Correcta ===\n");

        PersonaCorrecta persona2 = new PersonaCorrecta("Juan");
        boolean resultado = persona2.equals(null);

        System.out.println("persona2.equals(null): " + resultado);

        if (!resultado) {
            System.out.println("✓ CORRECTO: equals(null) retorna false sin lanzar excepciones");
        }

        System.out.println("\n=== Buenas Prácticas ===\n");
        System.out.println("1. SIEMPRE verificar null explícitamente al inicio de equals");
        System.out.println("2. Retornar false inmediatamente si el parámetro es null");
        System.out.println("3. El operador 'instanceof' retorna false para null de forma segura");
    }
}
