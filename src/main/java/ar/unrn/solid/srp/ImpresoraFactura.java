package ar.unrn.solid.srp;

/**
 * Clase responsable exclusivamente de la salida visual (impresión) de una factura.
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
