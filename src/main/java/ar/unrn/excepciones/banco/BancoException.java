package ar.unrn.excepciones.banco;

/**
 * Modela una pieza del dominio bancario y deja claro si su responsabilidad es ejecutar una regla normal o comunicar un error excepcional.
 * El paquete modela un dominio bancario reducido para separar validaciones normales de errores que deben comunicarse con excepciones especificas.
 */
public class BancoException extends Exception {
    public BancoException(String mensaje) {
        super(mensaje);
    }

    public BancoException() {
        super("Reventó el cobán!");
    }
}
