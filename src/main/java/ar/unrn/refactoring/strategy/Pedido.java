package ar.unrn.refactoring.strategy;

public class Pedido {
    public enum TipoEnvio { ESTANDAR, EXPRESS, INTERNACIONAL }

    private TipoEnvio tipo;
    private double peso;

    public Pedido(TipoEnvio tipo, double peso) {
        this.tipo = tipo;
        this.peso = peso;
    }

    /**
     * MÉTODO A REFACTORIZAR: Lógica de negocio atada a un enum dentro de la clase.
     */
    public double calcularCostoEnvio() {
        switch (tipo) {
            case ESTANDAR:
                return peso * 5;
            case EXPRESS:
                return (peso * 5) + 20;
            case INTERNACIONAL:
                return (peso * 10) + 50;
            default:
                throw new IllegalArgumentException("Tipo desconocido");
        }
    }
}
