package ar.unrn.solid.lsp;

public class LSPApp {
    public static void main(String[] args) {
        System.out.println("--- LSP: Liskov Substitution Principle ---");
        
        FiguraLSP rect = new Rectangulo(5, 4);
        FiguraLSP cuad = new Cuadrado(5);
        
        System.out.println("Área rectángulo: " + rect.obtenerArea());
        System.out.println("Área cuadrado: " + cuad.obtenerArea());
    }
}
