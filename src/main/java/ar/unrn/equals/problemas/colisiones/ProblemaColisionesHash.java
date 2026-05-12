package ar.unrn.equals.problemas.colisiones;

import java.util.HashMap;
import java.util.Map;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete ilustra el costo de producir hashes pobres, porque demasiadas colisiones degradan el rendimiento real de tablas hash.
 */
public class ProblemaColisionesHash {
    public static void main(String[] args) {
        Map<MalaMesa, String> mapa = new HashMap<>();
        mapa.put(new MalaMesa("A"), "Valor A");
        System.out.println("Mapa size: " + mapa.size());
    }
}
