package ar.unrn.smells.fragilidad;

/**
 * Aplicación de demostración para el olor de diseño: Fragilidad.
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
