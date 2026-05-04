package ar.unrn.patrones.creacionales.factory_method.intermedio;

/**
 * Interfaz para el producto Logger.
 */
interface Logger {
    /**
     * Registra un mensaje.
     * @param mensaje el texto a registrar.
     */
    void registrar(String mensaje);
}

/** Logger para consola. */
class ConsoleLogger implements Logger {
    @Override public void registrar(String mensaje) { System.out.println("[CONSOLE] " + mensaje); }
}

/** Logger para archivos. */
class FileLogger implements Logger {
    @Override public void registrar(String mensaje) { System.out.println("[FILE] Escribiendo en log.txt: " + mensaje); }
}

/**
 * Fabrica de Loggers con implementación predeterminada.
 */
public abstract class FabricaLogger {
    /**
     * Método fábrica.
     * @return una instancia de Logger.
     */
    protected abstract Logger crearLogger();

    /**
     * Registra un evento de información.
     * @param msg mensaje de información.
     */
    public void info(String msg) {
        Logger logger = crearLogger();
        logger.registrar("INFO: " + msg);
    }
}
