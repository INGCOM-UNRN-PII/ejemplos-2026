package ar.unrn.cuatro;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Ejemplo que demuestra el problema de modificar objetos después de agregarlos
 * a colecciones basadas en hash.
 * 
 * Contrato implícito: El hashCode de un objeto no debe cambiar mientras el objeto
 * está almacenado en una colección basada en hash.
 * 
 * Problema: Modificar campos usados en hashCode después de agregar el objeto
 * a HashMap o HashSet resulta en comportamiento indefinido.
 */
public class HashCodeCambiaDespuesDeAgregar {
    
    /**
     * Clase mutable que permite modificar campos usados en equals/hashCode
     */
    @SuppressWarnings("EqualsHashCode")
    static class PersonaMutable {
        private String nombre;
        private int edad;

        public PersonaMutable(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        @SuppressWarnings("EqualsGetClass")
        @Override
        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PersonaMutable otra = (PersonaMutable) obj;
            return nombre.equals(otra.nombre) && edad == otra.edad;
        }

        @Override
        public int hashCode() {
            return 31 * nombre.hashCode() + edad;
        }

        @Override
        public String toString() {
            return nombre + " (" + edad + " años)";
        }
    }

    /**
     * Clase INMUTABLE - la solución correcta
     */
    static class PersonaInmutable {
        private final String nombre;
        private final int edad;

        public PersonaInmutable(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // No hay setters - inmutable

        @SuppressWarnings("EqualsGetClass")
        @Override
        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PersonaInmutable otra = (PersonaInmutable) obj;
            return nombre.equals(otra.nombre) && edad == otra.edad;
        }

        @Override
        public int hashCode() {
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
        demostrarSolucionInmutable();
    }

    private static void demostrarProblemaHashSet() {
        System.out.println("=== Problema con HashSet y objetos mutables ===\n");
        
        PersonaMutable persona = new PersonaMutable("Carlos", 30);
        
        Set<PersonaMutable> conjunto = new HashSet<>();
        conjunto.add(persona);
        
        System.out.println("Estado inicial:");
        System.out.println("Persona: " + persona);
        System.out.println("hashCode: " + persona.hashCode());
        System.out.println("Conjunto contiene persona: " + conjunto.contains(persona));
        System.out.println("Tamaño del conjunto: " + conjunto.size());
        
        // Modificamos el objeto DESPUÉS de agregarlo al HashSet
        int hashCodeOriginal = persona.hashCode();
        persona.setNombre("Roberto");
        persona.setEdad(35);
        int hashCodeNuevo = persona.hashCode();
        
        System.out.println("\nDespués de modificar:");
        System.out.println("Persona: " + persona);
        System.out.println("hashCode original: " + hashCodeOriginal);
        System.out.println("hashCode nuevo: " + hashCodeNuevo);
        System.out.println("Conjunto contiene persona: " + conjunto.contains(persona));
        System.out.println("Tamaño del conjunto: " + conjunto.size());
        
        // Intentamos agregar un duplicado lógico
        PersonaMutable duplicado = new PersonaMutable("Roberto", 35);
        conjunto.add(duplicado);
        
        System.out.println("\nDespués de agregar duplicado lógico:");
        System.out.println("Tamaño del conjunto: " + conjunto.size());
        
        if (!conjunto.contains(persona)) {
            System.out.println("\n❌ PROBLEMA: El objeto original se 'perdió' en el HashSet");
            System.out.println("El conjunto ya no puede encontrar el objeto porque cambió de bucket");
            System.out.println("hashCode cambió de " + hashCodeOriginal + " a " + hashCodeNuevo);
        }
        
        if (conjunto.size() == 2) {
            System.out.println("❌ PROBLEMA: El conjunto ahora contiene duplicados lógicos");
            System.out.println("Causa: Modificar objeto después de agregarlo cambia su hashCode");
        }
    }

    private static void demostrarProblemaHashMap() {
        System.out.println("\n=== Problema con HashMap y objetos mutables ===\n");
        
        PersonaMutable persona = new PersonaMutable("Laura", 25);
        
        Map<PersonaMutable, String> mapa = new HashMap<>();
        mapa.put(persona, "Ingeniera");
        
        System.out.println("Estado inicial:");
        System.out.println("Clave: " + persona);
        System.out.println("Valor: " + mapa.get(persona));
        
        // Modificamos la clave DESPUÉS de agregarla al HashMap
        persona.setNombre("Lucía");
        persona.setEdad(26);
        
        System.out.println("\nDespués de modificar la clave:");
        System.out.println("Clave: " + persona);
        System.out.println("Valor obtenido: " + mapa.get(persona));
        System.out.println("Tamaño del mapa: " + mapa.size());
        
        if (mapa.get(persona) == null) {
            System.out.println("\n❌ PROBLEMA: No se puede recuperar el valor con la clave modificada");
            System.out.println("El mapa contiene la entrada pero no la puede encontrar");
            System.out.println("Causa: La clave cambió de bucket después de ser insertada");
            
            System.out.println("\nContenido del mapa (iterando):");
            mapa.forEach((k, v) -> 
                System.out.println("  " + k + " -> " + v + " (hashCode: " + k.hashCode() + ")")
            );
        }
    }

    private static void demostrarSolucionInmutable() {
        System.out.println("\n=== Solución: Usar objetos INMUTABLES ===\n");
        
        PersonaInmutable persona1 = new PersonaInmutable("Ana", 28);
        PersonaInmutable persona2 = new PersonaInmutable("Ana", 28);
        
        Set<PersonaInmutable> conjunto = new HashSet<>();
        conjunto.add(persona1);
        conjunto.add(persona2); // No se agrega, es igual a persona1
        
        Map<PersonaInmutable, String> mapa = new HashMap<>();
        mapa.put(persona1, "Doctora");
        
        System.out.println("Conjunto con objetos inmutables:");
        System.out.println("Tamaño: " + conjunto.size());
        System.out.println("Contiene persona1: " + conjunto.contains(persona1));
        System.out.println("Contiene persona2: " + conjunto.contains(persona2));
        
        System.out.println("\nMapa con claves inmutables:");
        System.out.println("Valor para persona1: " + mapa.get(persona1));
        System.out.println("Valor para persona2: " + mapa.get(persona2));
        
        System.out.println("\n✓ CORRECTO: Objetos inmutables garantizan:");
        System.out.println("  1. hashCode nunca cambia");
        System.out.println("  2. equals es consistente");
        System.out.println("  3. Funcionamiento correcto en colecciones basadas en hash");
        System.out.println("  4. Thread-safety como bonus");
        
        System.out.println("\n📝 Buena práctica: Hacer inmutables las clases que se usen como:");
        System.out.println("  - Claves en HashMap");
        System.out.println("  - Elementos en HashSet");
        System.out.println("  - Cualquier colección basada en hash");
    }
}
