package ar.unrn.solid.srp;

public class ImpresoraFactura {
    public void imprimir(Factura factura) {
        System.out.println("Factura monto: $" + factura.obtenerMonto());
    }
}
