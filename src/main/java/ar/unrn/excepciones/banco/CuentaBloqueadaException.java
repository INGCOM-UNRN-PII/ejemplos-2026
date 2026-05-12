package ar.unrn.excepciones.banco;

/**
 * Modela una pieza del dominio bancario y deja claro si su responsabilidad es ejecutar una regla normal o comunicar un error excepcional.
 * El paquete modela un dominio bancario reducido para separar validaciones normales de errores que deben comunicarse con excepciones especificas.
 */
public class CuentaBloqueadaException extends BancoException {
    public CuentaBloqueadaException(String idCuenta) {
        super("La cuenta " + idCuenta + " se encuentra bloqueada por seguridad.");
    }
}
