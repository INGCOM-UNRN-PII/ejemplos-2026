package ar.unrn.smells.viscosidad;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete muestra viscosidad, donde la solucion correcta parece mas costosa que el atajo y eso empuja a degradar el diseño.
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
