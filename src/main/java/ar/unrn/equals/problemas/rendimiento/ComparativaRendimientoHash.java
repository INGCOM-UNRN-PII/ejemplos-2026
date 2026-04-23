package ar.unrn.equals.problemas.rendimiento;
import java.util.HashMap;
import java.util.Map;
public class ComparativaRendimientoHash {
    public static void main(String[] args) {
        System.out.println("--- Comparativa Rendimiento ---");
        Map<ObjetoBueno, String> bueno = new HashMap<>();
        bueno.put(new ObjetoBueno(1), "test");
        System.out.println("Listo.");
    }
}
