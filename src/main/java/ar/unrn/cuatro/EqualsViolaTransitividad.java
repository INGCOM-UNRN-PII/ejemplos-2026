package ar.unrn.cuatro;

/**
 * Ejemplo que viola la propiedad TRANSITIVA del contrato de equals.
 * 
 * Contrato: Si x.equals(y) y y.equals(z), entonces x.equals(z) debe ser true
 * 
 * Problema: Comparación basada en rangos o tolerancias puede romper transitividad.
 */
public class EqualsViolaTransitividad {
    
    /**
     * Clase que representa un punto con comparación por proximidad
     */
    static class PuntoConTolerancia {
        private final double x;
        private final double y;
        private static final double TOLERANCIA = 0.1;

        public PuntoConTolerancia(double x, double y) {
            this.x = x;
            this.y = y;
        }

        /**
         * IMPLEMENTACIÓN INCORRECTA: Usa tolerancia en equals
         */
        @SuppressWarnings({"EqualsGetClass", "EqualsHashCode"})
        @Override
        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PuntoConTolerancia otro = (PuntoConTolerancia) obj;
            
            // PROBLEMA: Compara con tolerancia, lo que rompe transitividad
            return Math.abs(x - otro.x) <= TOLERANCIA && 
                   Math.abs(y - otro.y) <= TOLERANCIA;
        }

        @Override
        public int hashCode() {
            // Incluso hashCode es problemático con tolerancia
            return (int) (x * 100) + (int) (y * 100);
        }

        @Override
        public String toString() {
            return String.format("(%.2f, %.2f)", x, y);
        }
    }

    public static void main(String[] args) {
        // Creamos tres puntos donde cada uno está "cerca" del siguiente
        PuntoConTolerancia p1 = new PuntoConTolerancia(0.0, 0.0);
        PuntoConTolerancia p2 = new PuntoConTolerancia(0.08, 0.08);
        PuntoConTolerancia p3 = new PuntoConTolerancia(0.15, 0.15);

        boolean p1EqualsP2 = p1.equals(p2);
        boolean p2EqualsP3 = p2.equals(p3);
        boolean p1EqualsP3 = p1.equals(p3);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);
        System.out.println("\nTolerancia: 0.1");
        System.out.println("\np1.equals(p2): " + p1EqualsP2);
        System.out.println("p2.equals(p3): " + p2EqualsP3);
        System.out.println("p1.equals(p3): " + p1EqualsP3);

        if (p1EqualsP2 && p2EqualsP3 && !p1EqualsP3) {
            System.out.println("\n❌ PROBLEMA: Violación de TRANSITIVIDAD");
            System.out.println("p1 es igual a p2, y p2 es igual a p3");
            System.out.println("pero p1 NO es igual a p3");
            System.out.println("\nCausa: Usar tolerancia/proximidad en equals rompe transitividad");
            System.out.println("Solución: No usar tolerancias en equals, crear método separado");
        }
    }
}
