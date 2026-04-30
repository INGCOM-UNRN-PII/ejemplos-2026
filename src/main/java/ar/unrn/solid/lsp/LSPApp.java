package ar.unrn.solid.lsp;

/**
 * Aplicación de demostración para el Principio de Sustitución de Liskov (LSP).
 * Muestra el uso de abstracciones que permiten sustituir tipos derivados.
 */
public class LSPApp {
    /**
     * Punto de entrada de la aplicación.
     * 
     * @param args argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        System.out.println("--- LSP: Liskov Substitution Principle ---");
        
        FiguraLSP rect = new Rectangulo(5, 4);
        FiguraLSP cuad = new Cuadrado(5);
        
        System.out.println("Área rectángulo: " + rect.obtenerArea());
        System.out.println("Área cuadrado: " + cuad.obtenerArea());
    }
}
