package ar.unrn.cuatro;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Ejemplo que viola el contrato entre equals y hashCode.
 * 
 * Contrato: Si x.equals(y) retorna true, entonces x.hashCode() == y.hashCode()
 * 
 * Problema: Implementar equals sin sobreescribir hashCode, o implementar
 * hashCode de forma inconsistente con equals.
 */
public class HashCodeInconsistenteConEquals {
    
    /**
     * Clase que sobreescribe equals pero NO sobreescribe hashCode
     */
    @SuppressWarnings("EqualsHashCode")
    static class PersonaSinHashCode {
        private final String nombre;
        private final int edad;

        public PersonaSinHashCode(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        @SuppressWarnings("EqualsGetClass")
        @Override
        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PersonaSinHashCode otra = (PersonaSinHashCode) obj;
            return nombre.equals(otra.nombre) && edad == otra.edad;
        }

        // PROBLEMA: No sobreescribe hashCode
        // Usa la implementación de Object que retorna valores diferentes
        // para objetos distintos, incluso si son equals

        @Override
        public String toString() {
            return nombre + " (" + edad + " años)";
        }
    }

    /**
     * Clase con hashCode inconsistente con equals
     */
    @SuppressWarnings("EqualsHashCode")
    static class PersonaHashCodeInconsistente {
        private final String nombre;
        private final int edad;

        public PersonaHashCodeInconsistente(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        @SuppressWarnings("EqualsGetClass")
        @Override
        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PersonaHashCodeInconsistente otra = (PersonaHashCodeInconsistente) obj;
            return nombre.equals(otra.nombre) && edad == otra.edad;
        }

        @Override
        public int hashCode() {
            // PROBLEMA: Solo usa nombre, pero equals usa nombre Y edad
            return nombre.hashCode();
        }

        @Override
        public String toString() {
            return nombre + " (" + edad + " años)";
        }
    }

    /**
     * Clase CORRECTA con equals y hashCode consistentes
     */
    static class PersonaCorrecta {
        private final String nombre;
        private final int edad;

        public PersonaCorrecta(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        @SuppressWarnings("EqualsGetClass")
        @Override
        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PersonaCorrecta otra = (PersonaCorrecta) obj;
            return nombre.equals(otra.nombre) && edad == otra.edad;
        }

        @Override
        public int hashCode() {
            // CORRECTO: Usa los mismos campos que equals
            return 31 * nombre.hashCode() + edad;
        }

        @Override
        public String toString() {
            return nombre + " (" + edad + " años)";
        }
    }

    public static void main(String[] args) {
        demostrarProblemaHashSet();
        demostrarProblemaHashMap();
        demostrarSolucionCorrecta();
    }

    private static void demostrarProblemaHashSet() {
        System.out.println("=== Problema 1: Sin sobreescribir hashCode ===\n");
        
        PersonaSinHashCode p1 = new PersonaSinHashCode("Ana", 25);
        PersonaSinHashCode p2 = new PersonaSinHashCode("Ana", 25);

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p2.hashCode(): " + p2.hashCode());
        System.out.println("hashCodes iguales: " + (p1.hashCode() == p2.hashCode()));

        Set<PersonaSinHashCode> conjunto = new HashSet<>();
        conjunto.add(p1);
        conjunto.add(p2); // Debería ser rechazado por equals, pero...

        System.out.println("\nAgregando p1 y p2 a HashSet:");
        System.out.println("Tamaño del conjunto: " + conjunto.size());
        System.out.println("Contiene p1: " + conjunto.contains(p1));
        System.out.println("Contiene p2: " + conjunto.contains(p2));

        if (conjunto.size() == 2 && p1.equals(p2)) {
            System.out.println("\n❌ PROBLEMA: HashSet contiene duplicados lógicos");
            System.out.println("p1.equals(p2) es true, pero están en diferentes buckets");
            System.out.println("Causa: No sobreescribir hashCode rompe colecciones basadas en hash");
        }
    }

    private static void demostrarProblemaHashMap() {
        System.out.println("\n=== Problema 2: hashCode inconsistente con equals ===\n");
        
        PersonaHashCodeInconsistente p1 = new PersonaHashCodeInconsistente("Juan", 30);
        PersonaHashCodeInconsistente p2 = new PersonaHashCodeInconsistente("Juan", 40);

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p2.hashCode(): " + p2.hashCode());
        System.out.println("hashCodes iguales: " + (p1.hashCode() == p2.hashCode()));

        Map<PersonaHashCodeInconsistente, String> mapa = new HashMap<>();
        mapa.put(p1, "Empleado Senior");
        mapa.put(p2, "Empleado Junior");

        System.out.println("\nAgregando p1 y p2 como claves en HashMap:");
        System.out.println("Tamaño del mapa: " + mapa.size());

        if (mapa.size() == 1 && !p1.equals(p2)) {
            System.out.println("\n❌ PROBLEMA: HashMap colisiona objetos diferentes");
            System.out.println("p1 y p2 NO son iguales pero tienen el mismo hashCode");
            System.out.println("Causa: hashCode solo usa 'nombre', pero equals usa 'nombre' Y 'edad'");
            System.out.println("Consecuencia: Posibles colisiones innecesarias y mal rendimiento");
        }
    }

    private static void demostrarSolucionCorrecta() {
        System.out.println("\n=== Implementación CORRECTA ===\n");
        
        PersonaCorrecta p1 = new PersonaCorrecta("María", 28);
        PersonaCorrecta p2 = new PersonaCorrecta("María", 28);
        PersonaCorrecta p3 = new PersonaCorrecta("María", 35);

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);

        Set<PersonaCorrecta> conjunto = new HashSet<>();
        conjunto.add(p1);
        conjunto.add(p2); // No se agrega, es igual a p1
        conjunto.add(p3); // Se agrega, es diferente

        System.out.println("\np1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.hashCode() == p2.hashCode(): " + (p1.hashCode() == p2.hashCode()));
        System.out.println("\np1.equals(p3): " + p1.equals(p3));
        System.out.println("p1.hashCode() == p3.hashCode(): " + (p1.hashCode() == p3.hashCode()));

        System.out.println("\nTamaño del conjunto: " + conjunto.size());
        System.out.println("\n✓ CORRECTO: El conjunto tiene 2 elementos (p1/p2 son el mismo, p3 es diferente)");
        System.out.println("✓ equals y hashCode usan los mismos campos");
        System.out.println("✓ Las colecciones basadas en hash funcionan correctamente");
    }
}
