package ar.unrn.cuatro;

import java.util.Random;

/**
 * Ejemplo que viola la propiedad de CONSISTENCIA del contrato de equals.
 * 
 * Contrato: Múltiples invocaciones de x.equals(y) deben retornar consistentemente
 * el mismo resultado, siempre que la información usada en las comparaciones no se modifique.
 * 
 * Problema: equals depende de estado mutable o de factores externos aleatorios.
 */
public class EqualsViolaConsistencia {
    
    /**
     * Clase con equals inconsistente por dependencia de estado mutable
     */
    static class PersonaMutable {
        private String nombre; // Campo MUTABLE
        private final int id;

        public PersonaMutable(String nombre, int id) {
            this.nombre = nombre;
            this.id = id;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        /**
         * IMPLEMENTACIÓN INCORRECTA: Usa campo mutable en equals
         */
        @SuppressWarnings({"EqualsGetClass", "EqualsHashCode"})
        @Override
        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PersonaMutable otra = (PersonaMutable) obj;
            // PROBLEMA: nombre puede cambiar, rompiendo consistencia
            return nombre.equals(otra.nombre) && id == otra.id;
        }

        @Override
        public int hashCode() {
            return 31 * nombre.hashCode() + id;
        }

        @Override
        public String toString() {
            return nombre + " (ID: " + id + ")";
        }
    }

    /**
     * Clase con equals que depende de factores aleatorios
     */
    static class ObjetoAleatorio {
        private final String valor;
        private final Random random = new Random();

        public ObjetoAleatorio(String valor) {
            this.valor = valor;
        }

        /**
         * IMPLEMENTACIÓN INCORRECTA: Incluye lógica aleatoria
         */
        @SuppressWarnings({"EqualsGetClass", "EqualsHashCode"})
        @Override
        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ObjetoAleatorio otro = (ObjetoAleatorio) obj;
            
            // PROBLEMA: El resultado cambia aleatoriamente
            boolean comparacionBase = valor.equals(otro.valor);
            boolean factorAleatorio = random.nextBoolean();
            
            return comparacionBase && factorAleatorio;
        }

        @Override
        public int hashCode() {
            return valor.hashCode();
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Problema 1: Estado Mutable ===\n");
        
        PersonaMutable p1 = new PersonaMutable("Juan", 1);
        PersonaMutable p2 = new PersonaMutable("Juan", 1);

        boolean resultado1 = p1.equals(p2);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p1.equals(p2): " + resultado1);

        // Modificamos estado mutable
        p1.setNombre("Pedro");
        
        boolean resultado2 = p1.equals(p2);
        System.out.println("\nDespués de p1.setNombre(\"Pedro\"):");
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p1.equals(p2): " + resultado2);

        if (resultado1 != resultado2) {
            System.out.println("\n❌ PROBLEMA: Violación de CONSISTENCIA");
            System.out.println("El resultado de equals cambió sin modificar p2");
            System.out.println("Causa: equals depende de campo mutable");
        }

        System.out.println("\n=== Problema 2: Lógica Aleatoria ===\n");
        
        ObjetoAleatorio obj1 = new ObjetoAleatorio("Test");
        ObjetoAleatorio obj2 = new ObjetoAleatorio("Test");

        System.out.println("Múltiples comparaciones del mismo par de objetos:");
        boolean todosIguales = true;
        boolean primerResultado = obj1.equals(obj2);
        
        for (int i = 0; i < 5; i++) {
            boolean resultado = obj1.equals(obj2);
            System.out.println("Intento " + (i + 1) + ": obj1.equals(obj2) = " + resultado);
            if (resultado != primerResultado) {
                todosIguales = false;
            }
        }

        if (!todosIguales) {
            System.out.println("\n❌ PROBLEMA: Violación de CONSISTENCIA");
            System.out.println("equals retorna valores diferentes en llamadas sucesivas");
            System.out.println("Causa: equals incluye lógica aleatoria o no determinística");
        }
    }
}
