package ar.unrn.excepciones.banco;

/**
 * Excepción específica para cuentas inactivas o bloqueadas.
 */
public class CuentaBloqueadaException extends BancoException {
    public CuentaBloqueadaException(String idCuenta) {
        super("La cuenta " + idCuenta + " se encuentra bloqueada por seguridad.");
    }
}
