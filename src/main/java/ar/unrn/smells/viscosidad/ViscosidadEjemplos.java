package ar.unrn.smells.viscosidad;

/**
 * Ejemplo 1: Viscosidad de diseño.
 * Es tan difícil pasar un parámetro a través de 10 capas que el programador
 * usa un "atajo" (variable estática) para evitar el trabajo correcto.
 */
class AtajoSucio {
    public static String DATO_COMPARTIDO; // Usado para evitar pasar parámetros en un diseño rígido
}

class Capa10 {
    public void procesar() {
        System.out.println("Procesando con atajo: " + AtajoSucio.DATO_COMPARTIDO);
    }
}

/**
 * Ejemplo 2: Viscosidad por falta de abstracción.
 * El diseño obliga a manejar detalles de bajo nivel en todas partes.
 */
class LoggerViscoso {
    public void log(String msg) {
        // En lugar de llamar a logger.info(), el diseño obliga a cada clase
        // a manejar la apertura, escritura y cierre de archivos.
        System.out.println("Abriendo archivo de log manualmente...");
        System.out.println("Escribiendo: " + msg);
        System.out.println("Cerrando archivo...");
    }
}
