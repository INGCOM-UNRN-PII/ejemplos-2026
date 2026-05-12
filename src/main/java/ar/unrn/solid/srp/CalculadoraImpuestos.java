package ar.unrn.solid.srp;

/**
 * Representa una responsabilidad puntual del flujo de factura para que cada motivo de cambio quede aislado en su propia clase.
 * El paquete separa responsabilidades para que cada tipo cambie por un solo motivo y el ejemplo haga visible donde se concentra cada decision.
 */
public class CalculadoraImpuestos {
    /**
     * Calcula los impuestos (21% IVA) para la factura dada.
     * 
     * @param factura la factura sobre la cual calcular impuestos.
     * @return el monto de impuestos calculado.
     */
    public double calcular(Factura factura) {
        return factura.obtenerMonto() * 0.21;
    }
}
