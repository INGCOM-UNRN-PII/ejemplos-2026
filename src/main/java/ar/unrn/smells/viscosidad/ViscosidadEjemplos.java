package ar.unrn.smells.viscosidad;

/**
 * Ejemplo 1: Viscosidad de diseño.
 * Fuente de datos compartida globalmente para evitar pasaje de parámetros.
 */
class AtajoSucio {
    /** Dato compartido globalmente. */
    public static String DATO_COMPARTIDO; // Usado para evitar pasar parámetros en un diseño rígido
}

/**
 * Clase que representa una capa profunda del sistema.
 */
class Capa10 {
    /**
     * Procesa una tarea utilizando el atajo global.
     */
    public void procesar() {
        System.out.println("Procesando con atajo: " + AtajoSucio.DATO_COMPARTIDO);
    }
}

/**
 * Ejemplo 2: Viscosidad por falta de abstracción.
 */
class LoggerViscoso {
    /**
     * Simula el log de un mensaje manejando detalles de bajo nivel.
     * 
     * @param msg el mensaje a registrar.
     */
    public void log(String msg) {
        // En lugar de llamar a logger.info(), el diseño obliga a cada clase
        // a manejar la apertura, escritura y cierre de archivos.
        System.out.println("Abriendo archivo de log manualmente...");
        System.out.println("Escribiendo: " + msg);
        System.out.println("Cerrando archivo...");
    }
}
