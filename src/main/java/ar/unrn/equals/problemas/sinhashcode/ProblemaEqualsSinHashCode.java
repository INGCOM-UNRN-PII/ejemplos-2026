package ar.unrn.equals.problemas.sinhashcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete demuestra por que redefinir equals sin redefinir hashCode genera resultados inconsistentes en sets y mapas.
 */
public class ProblemaEqualsSinHashCode {
    @SuppressWarnings("EqualsHashCode")
    public static void main(String[] args) {
        Map<Producto, Integer> stock = new HashMap<>();
        Producto p1 = new Producto("A100");
        Producto p2 = new Producto("A100");
        stock.put(p1, 10);
        System.out.println("Stock p2: " + stock.get(p2));
    }
}
