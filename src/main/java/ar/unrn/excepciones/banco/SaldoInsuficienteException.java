package ar.unrn.excepciones.banco;

/**
 * Modela una pieza del dominio bancario y deja claro si su responsabilidad es ejecutar una regla normal o comunicar un error excepcional.
 * El paquete modela un dominio bancario reducido para separar validaciones normales de errores que deben comunicarse con excepciones especificas.
 */
public class SaldoInsuficienteException extends BancoException {
    private final double saldoActual;
    private final double montoRequerido;

    public SaldoInsuficienteException(double actual, double requerido) {
        super("Saldo insuficiente. Disponible: " + actual + ", Requerido: " + requerido);
        this.saldoActual = actual;
        this.montoRequerido = requerido;
    }

    public double getSaldoActual() {
        return saldoActual;
    }
}
