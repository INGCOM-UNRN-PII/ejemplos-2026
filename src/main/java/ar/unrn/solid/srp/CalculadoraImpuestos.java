package ar.unrn.solid.srp;

/**
 * Clase responsable exclusivamente del cálculo de impuestos para una factura.
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
