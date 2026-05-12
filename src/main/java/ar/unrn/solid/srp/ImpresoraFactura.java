package ar.unrn.solid.srp;

/**
 * Representa una responsabilidad puntual del flujo de factura para que cada motivo de cambio quede aislado en su propia clase.
 * El paquete separa responsabilidades para que cada tipo cambie por un solo motivo y el ejemplo haga visible donde se concentra cada decision.
 */
public class ImpresoraFactura {
    /**
     * Envía la información de la factura a la consola.
     * 
     * @param factura la factura a imprimir.
     */
    public void imprimir(Factura factura) {
        System.out.println("Factura monto: $" + factura.obtenerMonto());
    }
}
