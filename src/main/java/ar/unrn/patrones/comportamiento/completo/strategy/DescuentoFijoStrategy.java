package ar.unrn.patrones.comportamiento.completo.strategy;

/**
 * Implementa una politica de descuento de monto fijo y muestra como una estrategia concreta encapsula su propia formula.
 * El paquete usa Strategy para encapsular distintas politicas de descuento y permitir elegirlas sin reescribir el carrito.
 */
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
