package ar.unrn.patrones.comportamiento.completo.strategy;

/**
 * Implementa una politica basada en porcentaje y mantiene aislada la formula para que pueda reemplazarse sin tocar el cliente.
 * El paquete usa Strategy para encapsular distintas politicas de descuento y permitir elegirlas sin reescribir el carrito.
 */
public class DescuentoPorcentajeStrategy implements DescuentoStrategy {
    private final double porcentaje;

    public DescuentoPorcentajeStrategy(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            throw new IllegalArgumentException("El porcentaje debe estar entre 0 y 100");
        }
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double montoTotal) {
        double montoDescuento = (montoTotal * porcentaje) / 100.0;
        return montoTotal - montoDescuento;
    }
}
