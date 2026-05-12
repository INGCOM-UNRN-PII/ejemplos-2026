package ar.unrn.patrones.comportamiento.completo.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Actua como contexto del patron Strategy y delega el calculo del descuento a la politica que reciba en cada escenario.
 * El paquete usa Strategy para encapsular distintas politicas de descuento y permitir elegirlas sin reescribir el carrito.
 */
public class CarritoDeCompras {
    private List<Double> items;
    private DescuentoStrategy descuentoStrategy;

    public CarritoDeCompras() {
        this.items = new ArrayList<>();
        // Por defecto, sin descuento
        this.descuentoStrategy = montoTotal -> montoTotal;
    }

    public void agregarItem(double precio) {
        this.items.add(precio);
    }

    public void setDescuentoStrategy(DescuentoStrategy descuentoStrategy) {
        this.descuentoStrategy = descuentoStrategy;
    }

    public double calcularTotal() {
        double total = 0;
        for (double precio : items) {
            total += precio;
        }

        // El carrito delega el cálculo del descuento a la estrategia configurada
        return descuentoStrategy.aplicarDescuento(total);
    }
}
