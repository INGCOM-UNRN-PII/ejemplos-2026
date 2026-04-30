package ar.unrn.solid.srp;

/**
 * Aplicación de demostración para el Principio de Responsabilidad Única (SRP).
 * Muestra cómo las responsabilidades se distribuyen en clases separadas.
 */
public class SRPApp {
    /**
     * Punto de entrada de la aplicación.
     * 
     * @param args argumentos de la línea de comandos (no se utilizan).
     */
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
