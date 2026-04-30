package ar.unrn.solid.srp;

public class RepositorioFactura {
    public void guardar(Factura factura) {
        System.out.println("Guardando factura de $" + factura.obtenerMonto() + " en la base de datos.");
    }
}
