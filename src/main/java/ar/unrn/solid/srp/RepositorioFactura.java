package ar.unrn.solid.srp;

/**
 * Clase responsable exclusivamente de la persistencia de las facturas.
 */
public class RepositorioFactura {
    /**
     * Simula el guardado de una factura en una base de datos.
     * 
     * @param factura la factura a persistir.
     */
    public void guardar(Factura factura) {
        System.out.println("Guardando factura de $" + factura.obtenerMonto() + " en la base de datos.");
    }
}
