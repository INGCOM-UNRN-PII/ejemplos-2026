package ar.unrn.demeter;

/**
 * Ejemplo que viola la Ley de Demeter.
 * La clase conoce demasiados detalles internos de Cliente, Direccion y CodigoPostal.
 */
public class PedidoConCadenaMensajes {
    private final Cliente cliente;

    /**
     * Crea un pedido asociado a un cliente.
     *
     * @param cliente el cliente del pedido.
     */
    public PedidoConCadenaMensajes(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Arma un resumen de destino navegando por varios objetos internos.
     *
     * @return un resumen textual del destino del pedido.
     */
    public String resumenDestino() {
        return cliente.nombre() + " - "
                + cliente.direccion().ciudad()
                + " (" + cliente.direccion().codigoPostal().valor() + ")";
    }

    /**
     * Determina si el destino esta en la Patagonia consultando estructura interna.
     *
     * @return {@code true} si la ciudad coincide con una ciudad patagonica conocida.
     */
    public boolean esDestinoPatagonico() {
        String ciudad = cliente.direccion().ciudad();
        return ciudad.equals("Neuquen")
                || ciudad.equals("Bariloche")
                || ciudad.equals("Comodoro Rivadavia");
    }
}
