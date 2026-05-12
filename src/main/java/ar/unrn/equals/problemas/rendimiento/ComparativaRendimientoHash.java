package ar.unrn.equals.problemas.rendimiento;

import java.util.HashMap;
import java.util.Map;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete compara objetos con estrategias de hash distintas para conectar la calidad del hash con el costo de busqueda.
 */
public class ComparativaRendimientoHash {
    public static void main(String[] args) {
        System.out.println("--- Comparativa Rendimiento ---");
        Map<ObjetoBueno, String> bueno = new HashMap<>();
        bueno.put(new ObjetoBueno(1), "test");
        System.out.println("Listo.");
    }
}
