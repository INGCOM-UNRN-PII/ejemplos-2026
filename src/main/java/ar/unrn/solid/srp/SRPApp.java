package ar.unrn.solid.srp;

public class SRPApp {
    public static void main(String[] args) {
        System.out.println("--- SRP: Single Responsibility Principle ---");
        Factura factura = new Factura(1000.0);
        
        CalculadoraImpuestos calculadora = new CalculadoraImpuestos();
        double impuestos = calculadora.calcular(factura);
        
        ImpresoraFactura impresora = new ImpresoraFactura();
        impresora.imprimir(factura);
        
        System.out.println("Impuestos calculados: " + impuestos);
        
        RepositorioFactura repositorio = new RepositorioFactura();
        repositorio.guardar(factura);
    }
}
