package ar.unrn.patrones.creacionales.factory_method.intermedio;

/**
 * Define el contrato minimo que las implementaciones del paquete deben cumplir para colaborar sin depender de detalles concretos.
 * El paquete aplica Factory Method a la creacion de loggers para variar el destino del registro sin cambiar el cliente.
 */
interface Logger {
    /**
     * Registra un mensaje.
     *
     * @param mensaje el texto a registrar.
     */
    void registrar(String mensaje);
}

/**
 * Representa uno de los productos del ejemplo y deja que el metodo fabrica decida cuando y con que variante crearlo.
 * El paquete aplica Factory Method a la creacion de loggers para variar el destino del registro sin cambiar el cliente.
 */
class ConsoleLogger implements Logger {
    @Override
    public void registrar(String mensaje) {
        System.out.println("[CONSOLE] " + mensaje);
    }
}

/**
 * Representa uno de los productos del ejemplo y deja que el metodo fabrica decida cuando y con que variante crearlo.
 * El paquete aplica Factory Method a la creacion de loggers para variar el destino del registro sin cambiar el cliente.
 */
class FileLogger implements Logger {
    @Override
    public void registrar(String mensaje) {
        System.out.println("[FILE] Escribiendo en log.txt: " + mensaje);
    }
}

/**
 * Centraliza la creacion de objetos relacionados para que el cliente trabaje contra contratos estables y no contra constructores concretos.
 * El paquete aplica Factory Method a la creacion de loggers para variar el destino del registro sin cambiar el cliente.
 */
public abstract class FabricaLogger {
    /**
     * Método fábrica.
     *
     * @return una instancia de Logger.
     */
    protected abstract Logger crearLogger();

    /**
     * Registra un evento de información.
     *
     * @param msg mensaje de información.
     */
    public void info(String msg) {
        Logger logger = crearLogger();
        logger.registrar("INFO: " + msg);
    }
}
