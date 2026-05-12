package ar.unrn.solid.srp;

/**
 * Representa una responsabilidad puntual del flujo de factura para que cada motivo de cambio quede aislado en su propia clase.
 * El paquete separa responsabilidades para que cada tipo cambie por un solo motivo y el ejemplo haga visible donde se concentra cada decision.
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
