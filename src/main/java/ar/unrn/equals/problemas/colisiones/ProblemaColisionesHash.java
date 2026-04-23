package ar.unrn.equals.problemas.colisiones;
import java.util.HashMap;
import java.util.Map;
public class ProblemaColisionesHash {
    public static void main(String[] args) {
        Map<MalaMesa, String> mapa = new HashMap<>();
        mapa.put(new MalaMesa("A"), "Valor A");
        System.out.println("Mapa size: " + mapa.size());
    }
}
