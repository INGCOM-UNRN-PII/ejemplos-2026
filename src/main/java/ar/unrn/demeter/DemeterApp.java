package ar.unrn.demeter;

/**
 * Ejecuta ejemplos simples sobre la Ley de Demeter.
 */
public class DemeterApp {

    /**
     * Punto de entrada del ejemplo.
     *
     * @param args argumentos de linea de comandos no utilizados.
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente(
                "Ana",
                new Direccion("Neuquen", new CodigoPostal("8300"))
        );
        Producto producto = new Producto(
                "Teclado",
                new Deposito(new Ubicacion("A-15"), 12)
        );

        PedidoConCadenaMensajes pedidoMalo = new PedidoConCadenaMensajes(cliente);
        PedidoConDelegacion pedidoBueno = new PedidoConDelegacion(cliente);
        ControlStockConCadenaMensajes stockMalo = new ControlStockConCadenaMensajes();
        ControlStockConDelegacion stockBueno = new ControlStockConDelegacion();

        System.out.println("Pedido con cadena: " + pedidoMalo.resumenDestino());
        System.out.println("Pedido con delegacion: " + pedidoBueno.resumenDestino());
        System.out.println("Cadena en stock: " + stockMalo.prepararRetiro(producto, 5));
        System.out.println("Delegacion en stock: " + stockBueno.prepararRetiro(producto, 5));
    }
}
