package ar.unrn.refactoring.move_method;

/**
 * Representa una cuenta bancaria.
 * Ejemplo para demostrar Move Method ante el olor de "Feature Envy".
 */
public class Cuenta {
    private double saldo;
    private TipoCuenta tipo;

    /**
     * Calcula el interés de la cuenta.
     * MÉTODO A MOVER: Depende casi totalmente de atributos de TipoCuenta.
     * 
     * @return el monto de interés calculado.
     */
    public double calcularInteres() {
        return tipo.obtenerTasaBase() * saldo * tipo.obtenerFactorRiesgo();
    }
}

/**
 * Representa el tipo de una cuenta bancaria (ej: Ahorro, Corriente).
 */
class TipoCuenta {
    /**
     * Obtiene la tasa de interés base para este tipo de cuenta.
     * 
     * @return la tasa base.
     */
    public double obtenerTasaBase() { return 0.05; }
    /**
     * Obtiene el factor de riesgo asociado a este tipo de cuenta.
     * 
     * @return el factor de riesgo.
     */
    public double obtenerFactorRiesgo() { return 1.2; }
}
