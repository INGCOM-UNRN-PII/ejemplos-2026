package ar.unrn.dos.equals.problemas.sinhashcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Ejemplo de por qué equals() requiere hashCode().
 */
public class ProblemaEqualsSinHashCode {

    @SuppressWarnings("EqualsHashCode")
    static class Producto {
        private String codigo;
        public Producto(String codigo) { this.codigo = codigo; }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Producto p)) return false;
            return codigo.equals(p.codigo);
        }

        // NO implementamos hashCode(). Se usa el de Object (basado en dirección de memoria).
    }

    public static void main(String[] args) {
        Map<Producto, Integer> stock = new HashMap<>();
        Producto p1 = new Producto("A100");
        Producto p2 = new Producto("A100");

        stock.put(p1, 10);

        System.out.println("--- Equals sin HashCode ---");
        System.out.println("¿p1.equals(p2)?: " + p1.equals(p2)); // true
        
        System.out.println("Intentando recuperar stock con p2...");
        System.out.println("Stock p2: " + stock.get(p2)); 
        // ¡NULL! Aunque sean iguales por equals, sus hashCodes son distintos.
        
        stock.put(p2, 20);
        System.out.println("Tamaño del mapa: " + stock.size()); 
        // ¡2! Debería ser 1 si hashCode funcionara bien. Tenemos duplicados.
    }
}
