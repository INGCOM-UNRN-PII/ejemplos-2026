package ar.unrn.generados.colecciones.genericos;

/**
 * Reune una ejecucion corta que hace visibles las ventajas practicas de los genericos sobre colecciones y objetos reutilizables.
 * El paquete agrupa ejemplos breves de genericos para mostrar como Java captura tipos y reutiliza algoritmos sin perder seguridad en compilacion.
 */
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
