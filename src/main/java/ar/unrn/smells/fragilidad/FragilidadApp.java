package ar.unrn.smells.fragilidad;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete muestra fragilidad, es decir, cambios laterales que rompen partes aparentemente independientes del sistema.
 */
public class FragilidadApp {
    /**
     * Punto de entrada de la aplicación.
     * 
     * @param args argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        System.out.println("--- Smell: Fragilidad ---");
        try {
            new ModuloA().ejecutar();
            new ModuloB().procesar();
        } catch (Exception e) {
            System.out.println("Fragilidad detectada: " + e.getMessage());
        }
    }
}
