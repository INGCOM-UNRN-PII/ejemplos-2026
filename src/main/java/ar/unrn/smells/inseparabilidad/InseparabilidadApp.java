package ar.unrn.smells.inseparabilidad;

/**
 * Aplicación de demostración para el olor de diseño: Inseparabilidad.
 */
public class InseparabilidadApp {
    /**
     * Punto de entrada de la aplicación.
     * 
     * @param args argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        System.out.println("--- Smell: Inseparabilidad ---");
        new VentanaFactura().alHacerClick();
        new ValidadorUsuario().esValido("admin");
    }
}
