package ar.unrn.patrones.creacionales.singleton.basico;

/**
 * Centraliza el acceso a una unica instancia compartida para que el resto del codigo no cree copias inconsistentes del mismo recurso.
 * El paquete introduce Singleton con una version sencilla pensada para explicar la idea de una unica instancia compartida.
 */
public class ConfiguracionBasica {
    private static ConfiguracionBasica instancia;
    private String valor;

    /**
     * Constructor privado para evitar instanciación externa.
     */
    private ConfiguracionBasica() {
        this.valor = "Configuración Inicial";
    }

    /**
     * Obtiene la instancia única de la clase.
     *
     * @return la instancia única.
     */
    public static ConfiguracionBasica obtenerInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionBasica();
        }
        return instancia;
    }

    /**
     * Obtiene el valor de configuración.
     *
     * @return el valor actual.
     */
    public String obtenerValor() {
        return valor;
    }

    /**
     * Establece un nuevo valor de configuración.
     *
     * @param valor el nuevo valor.
     */
    public void establecerValor(String valor) {
        this.valor = valor;
    }
}
