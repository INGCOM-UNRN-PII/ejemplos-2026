package ar.unrn.excepciones;

/**
 * Excepción base para todos los errores del sistema bancario.
 * Es una excepción comprobada (Checked Exception).
 */
public class BancoException extends Exception {
    public BancoException(String mensaje) {
        super(mensaje);
    }
}
