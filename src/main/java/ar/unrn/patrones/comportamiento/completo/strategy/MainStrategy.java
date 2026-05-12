package ar.unrn.patrones.comportamiento.completo.strategy;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete usa Strategy para encapsular distintas politicas de descuento y permitir elegirlas sin reescribir el carrito.
 */
public class MainStrategy {
    public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras();
        carrito.agregarItem(100.0);
        carrito.agregarItem(50.0);
        
        System.out.println("Total sin descuento (default): " + carrito.calcularTotal());
        
        carrito.setDescuentoStrategy(new DescuentoFijoStrategy(20.0));
        System.out.println("Total con descuento fijo de 20: " + carrito.calcularTotal());
        
        carrito.setDescuentoStrategy(new DescuentoPorcentajeStrategy(10.0));
        System.out.println("Total con 10% de descuento: " + carrito.calcularTotal());
    }
}
