package ar.unrn.excepciones.banco;

/**
 * Excepción específica para problemas con el saldo.
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
