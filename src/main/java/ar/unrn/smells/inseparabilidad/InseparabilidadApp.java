package ar.unrn.smells.inseparabilidad;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete muestra inseparabilidad, donde varias decisiones viajan juntas y por eso cuesta reutilizar o probar solo una parte.
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
