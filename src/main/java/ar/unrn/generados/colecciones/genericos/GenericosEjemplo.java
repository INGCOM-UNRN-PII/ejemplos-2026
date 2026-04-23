package ar.unrn.generados.colecciones.genericos;
import javax.annotation.Nullable;
import java.util.List;
public class GenericosEjemplo {
    public static void main(String[] args) {
        System.out.println("--- Demostración de Genéricos ---");
        Caja<Integer> cajaEntera = new Caja<>();
        cajaEntera.poner(42);
        System.out.println("Contenido: " + cajaEntera.sacar());
        Par<Integer, String> alumno = new Par<>(12345, "Juan Pérez");
        System.out.println("Legajo: " + alumno.getClave());
    }
}
