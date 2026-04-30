package ar.unrn.solid.srp;

public class CalculadoraImpuestos {
    public double calcular(Factura factura) {
        return factura.obtenerMonto() * 0.21;
    }
}
