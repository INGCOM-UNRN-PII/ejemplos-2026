package ar.unrn.dos.equals.identidad.nullcomparison;

/**
 * Ejemplo que viola la regla de comparación con NULL del contrato de equals.
 * 
 * Contrato: Para cualquier referencia no-null x, x.equals(null) debe retornar false
 * 
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
        @SuppressWarnings({"EqualsGetClass", "EqualsHashCode", "CastToConcreteType"})
        @Override
        public boolean equals(Object obj) {
            // PROBLEMA: Si obj es null, getClass() lanza NullPointerException
            PersonaSinCheckNull otra = (PersonaSinCheckNull) obj;
            return nombre.equals(otra.nombre);
        }

        @Override
        public int hashCode() {
            return nombre.hashCode();
        }
    }

    /**
     * Clase con lógica errónea que podría retornar true para null
     */
    static class PersonaConLogicaErronea {
        private final String nombre;

        public PersonaConLogicaErronea(String nombre) {
            this.nombre = nombre;
        }

        /**
         * IMPLEMENTACIÓN INCORRECTA: Lógica mal estructurada
         */
        @SuppressWarnings({"EqualsGetClass", "EqualsHashCode", "PatternMatchingInstanceof"})
        @Override
        public boolean equals(Object obj) {
            // PROBLEMA: Verifica tipo antes de null
            if (obj instanceof PersonaConLogicaErronea) {
                PersonaConLogicaErronea otra = (PersonaConLogicaErronea) obj;
                // Si nombre es null en ambos, retorna true
                return nombre == null ? otra.nombre == null : nombre.equals(otra.nombre);
            }
            // Para null, instanceof retorna false, así que retorna false
            // Pero la lógica es confusa y propensa a errores
            return false;
        }

        @Override
        public int hashCode() {
            return nombre != null ? nombre.hashCode() : 0;
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
        @SuppressWarnings("EqualsGetClass")
        @Override
        public boolean equals(Object obj) {
            // Verificación explícita de null
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            PersonaCorrecta otra = (PersonaCorrecta) obj;
            return nombre.equals(otra.nombre);
        }

        @Override
        public int hashCode() {
            return nombre.hashCode();
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
            System.out.println("Excepción: " + e.getClass().getSimpleName());
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
        System.out.println("3. No confiar solo en instanceof (retorna false para null, pero es implícito)");
        System.out.println("4. Verificación explícita hace el código más claro y mantenible");
    }
}
