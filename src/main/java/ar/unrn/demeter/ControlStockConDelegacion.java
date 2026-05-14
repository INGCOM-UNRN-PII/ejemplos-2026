package ar.unrn.demeter;

/**
 * Ejemplo que mejora la Ley de Demeter pidiendo al producto la informacion necesaria.
 */
public class ControlStockConDelegacion {

    /**
     * Decide desde donde retirar un producto sin conocer la estructura interna del deposito.
     *
     * @param producto el producto pedido.
     * @param cantidad la cantidad solicitada.
     *
     * @return el mensaje de retiro correspondiente.
     */
    public String prepararRetiro(Producto producto, int cantidad) {
        if (!producto.hayStockDisponible(cantidad)) {
            return "Sin stock para " + producto.nombre();
        }
        return "Retirar " + producto.nombre()
                + " desde " + producto.ubicacionPreferida();
    }
}
