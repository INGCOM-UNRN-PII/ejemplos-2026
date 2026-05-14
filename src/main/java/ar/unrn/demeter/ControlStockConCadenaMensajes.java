package ar.unrn.demeter;

/**
 * Ejemplo que viola la Ley de Demeter consultando detalles del deposito desde afuera.
 */
public class ControlStockConCadenaMensajes {

    /**
     * Decide desde donde retirar un producto navegando la estructura interna del deposito.
     *
     * @param producto el producto pedido.
     * @param cantidad la cantidad solicitada.
     *
     * @return el mensaje de retiro correspondiente.
     */
    public String prepararRetiro(Producto producto, int cantidad) {
        if (producto.deposito().stockActual() < cantidad) {
            return "Sin stock para " + producto.nombre();
        }
        return "Retirar " + producto.nombre()
                + " desde " + producto.deposito().ubicacion().codigo();
    }
}
