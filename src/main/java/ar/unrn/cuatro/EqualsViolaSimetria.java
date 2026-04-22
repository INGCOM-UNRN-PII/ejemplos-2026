package ar.unrn.cuatro;

/**
 * Ejemplo que viola la propiedad SIMÉTRICA del contrato de equals.
 * 
 * Contrato: x.equals(y) debe retornar true si y solo si y.equals(x) retorna true
 * 
 * Problema: Herencia mal implementada donde la subclase añade campos a la comparación
 * pero la superclase no los conoce.
 */
public class EqualsViolaSimetria {
    
    /**
     * Clase base que solo compara por nombre
     */
    static class Persona {
        protected final String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
        }

        @SuppressWarnings({"EqualsGetClass", "PatternMatchingInstanceof"})
        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            // PROBLEMA: Acepta cualquier subclase sin verificar tipo exacto
            if (!(obj instanceof Persona)) {
                return false;
            }
            Persona otra = (Persona) obj;
            return nombre.equals(otra.nombre);
        }

        @Override
        public int hashCode() {
            return nombre.hashCode();
        }
    }

    /**
     * Subclase que añade campo adicional a la comparación
     */
    static class Empleado extends Persona {
        private final int legajo;

        public Empleado(String nombre, int legajo) {
            super(nombre);
            this.legajo = legajo;
        }

        @SuppressWarnings({"EqualsGetClass", "EqualsHashCode", "PatternMatchingInstanceof"})
        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            // PROBLEMA: Solo compara si es Empleado exacto
            if (!(obj instanceof Empleado)) {
                return false;
            }
            Empleado otro = (Empleado) obj;
            return nombre.equals(otro.nombre) && legajo == otro.legajo;
        }

        @Override
        public int hashCode() {
            return 31 * nombre.hashCode() + legajo;
        }
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
        Empleado empleado = new Empleado("Juan", 1001);

        boolean personaEqualsEmpleado = persona.equals(empleado);
        boolean empleadoEqualsPersona = empleado.equals(persona);

        System.out.println("persona.equals(empleado): " + personaEqualsEmpleado);
        System.out.println("empleado.equals(persona): " + empleadoEqualsPersona);

        if (personaEqualsEmpleado != empleadoEqualsPersona) {
            System.out.println("\n❌ PROBLEMA: Violación de SIMETRÍA");
            System.out.println("persona.equals(empleado) = " + personaEqualsEmpleado);
            System.out.println("empleado.equals(persona) = " + empleadoEqualsPersona);
            System.out.println("Deberían retornar el mismo valor");
            System.out.println("\nCausa: instanceof permite comparación asimétrica en jerarquías");
        }
    }
}
