package ar.unrn.smells.viscosidad;

/**
 * Representa una pieza del ejemplo donde el diseño incentiva atajos porque la solucion correcta parece mas costosa que la improvisada.
 * El paquete muestra viscosidad, donde la solucion correcta parece mas costosa que el atajo y eso empuja a degradar el diseño.
 */
class AtajoSucio {
    /**
     * Dato compartido globalmente.
     */
    public static String DATO_COMPARTIDO; // Usado para evitar pasar parámetros en un diseño rígido
}

/**
 * Representa una pieza del ejemplo donde el diseño incentiva atajos porque la solucion correcta parece mas costosa que la improvisada.
 * El paquete muestra viscosidad, donde la solucion correcta parece mas costosa que el atajo y eso empuja a degradar el diseño.
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
 * Representa una pieza del ejemplo donde el diseño incentiva atajos porque la solucion correcta parece mas costosa que la improvisada.
 * El paquete muestra viscosidad, donde la solucion correcta parece mas costosa que el atajo y eso empuja a degradar el diseño.
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
