package ar.unrn.solid.srp;

/**
 * VIOLACIÓN SRP: Esta clase tiene múltiples razones para cambiar:
 * 1. Cambios en el cálculo de impuestos.
 * 2. Cambios en el formato del recibo.
 * 3. Cambios en la persistencia.
 */
class FacturaMal {
    private double monto;

    public FacturaMal(double monto) {
        this.monto = monto;
    }

    public double calcularImpuestos() {
        return monto * 0.21;
    }

    public void imprimirRecibo() {
        System.out.println("Recibo de factura: " + monto);
    }

    public void guardarEnBaseDeDatos() {
        System.out.println("Guardando en DB...");
    }
}
