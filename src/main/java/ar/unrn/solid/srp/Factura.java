package ar.unrn.solid.srp;

/**
 * Representa una factura simple que solo contiene datos de negocio.
 * Este es un ejemplo de cumplimiento del Single Responsibility Principle (SRP).
 */
public class Factura {
    private final double monto;

    /**
     * Crea una nueva factura con el monto especificado.
     * 
     * @param monto el importe total de la factura.
     */
    public Factura(double monto) {
        this.monto = monto;
    }

    /**
     * Obtiene el monto de la factura.
     * 
     * @return el importe total.
     */
    public double obtenerMonto() {
        return monto;
    }
}
