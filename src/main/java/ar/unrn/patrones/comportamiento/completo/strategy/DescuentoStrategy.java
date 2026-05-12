package ar.unrn.patrones.comportamiento.completo.strategy;

/**
 * Define el contrato de las politicas de descuento para que el carrito pueda calcular precios sin conocer la formula elegida.
 * El paquete usa Strategy para encapsular distintas politicas de descuento y permitir elegirlas sin reescribir el carrito.
 */
public interface DescuentoStrategy {
    /**
     * Aplica el algoritmo de descuento sobre el monto total y retorna el precio a pagar.
     */
    double aplicarDescuento(double montoTotal);
}
