package ar.unrn.smells.viscosidad;

/**
 * Aplicación de demostración para el olor de diseño: Viscosidad.
 */
public class ViscosidadApp {
    /**
     * Punto de entrada de la aplicación.
     * 
     * @param args argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        System.out.println("--- Smell: Viscosidad ---");
        AtajoSucio.DATO_COMPARTIDO = "Valor hackeado";
        new Capa10().procesar();
        new LoggerViscoso().log("Evento importante");
    }
}
