package ar.unrn.patrones.comportamiento.completo.strategy;

public class DescuentoFijoStrategy implements DescuentoStrategy {
    private final double descuentoMontoFijo;

    public DescuentoFijoStrategy(double descuentoMontoFijo) {
        this.descuentoMontoFijo = descuentoMontoFijo;
    }

    @Override
    public double aplicarDescuento(double montoTotal) {
        // Se asegura de no tener montos negativos
        return Math.max(0, montoTotal - descuentoMontoFijo);
    }
}
