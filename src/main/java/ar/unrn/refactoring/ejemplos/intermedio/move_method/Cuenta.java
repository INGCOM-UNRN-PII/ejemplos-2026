package ar.unrn.refactoring.ejemplos.intermedio.move_method;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde un metodo debe mudarse a la clase que realmente tiene la informacion para hacerlo bien.
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
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde un metodo debe mudarse a la clase que realmente tiene la informacion para hacerlo bien.
 */
class TipoCuenta {
    /**
     * Obtiene la tasa de interés base para este tipo de cuenta.
     *
     * @return la tasa base.
     */
    public double obtenerTasaBase() {
        return 0.05;
    }

    /**
     * Obtiene el factor de riesgo asociado a este tipo de cuenta.
     *
     * @return el factor de riesgo.
     */
    public double obtenerFactorRiesgo() {
        return 1.2;
    }
}
