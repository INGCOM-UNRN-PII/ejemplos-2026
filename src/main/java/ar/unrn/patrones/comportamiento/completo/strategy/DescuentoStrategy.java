package ar.unrn.patrones.comportamiento.completo.strategy;

public interface DescuentoStrategy {
    /**
     * Aplica el algoritmo de descuento sobre el monto total y retorna el precio a pagar.
     */
    double aplicarDescuento(double montoTotal);
}
