package ar.unrn.demeter;

/**
 * Ejemplo que respeta mejor la Ley de Demeter.
 * El pedido le pide al cliente la informacion que necesita sin navegar su estructura interna.
 */
public class PedidoConDelegacion {
    private final Cliente cliente;

    /**
     * Crea un pedido asociado a un cliente.
     *
     * @param cliente el cliente del pedido.
     */
    public PedidoConDelegacion(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Arma un resumen de destino usando mensajes directos.
     *
     * @return un resumen textual del destino del pedido.
     */
    public String resumenDestino() {
        return cliente.nombre() + " - "
                + cliente.ciudadDeEntrega()
                + " (" + cliente.codigoPostal() + ")";
    }

    /**
     * Consulta al cliente si su direccion corresponde a la Patagonia.
     *
     * @return {@code true} si el cliente vive en una ciudad patagonica conocida.
     */
    public boolean esDestinoPatagonico() {
        return cliente.viveEnPatagonia();
    }
}
