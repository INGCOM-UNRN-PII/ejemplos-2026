package ar.unrn.refactoring.move_method;

public class Cuenta {
    private double saldo;
    private TipoCuenta tipo;

    public double calcularInteres() {
        // MÉTODO A MOVER: Depende de atributos de TipoCuenta
        return tipo.obtenerTasaBase() * saldo * tipo.obtenerFactorRiesgo();
    }
}

class TipoCuenta {
    public double obtenerTasaBase() { return 0.05; }
    public double obtenerFactorRiesgo() { return 1.2; }
}
