package ar.unrn.solid.srp;

public class Factura {
    private final double monto;

    public Factura(double monto) {
        this.monto = monto;
    }

    public double obtenerMonto() {
        return monto;
    }
}
