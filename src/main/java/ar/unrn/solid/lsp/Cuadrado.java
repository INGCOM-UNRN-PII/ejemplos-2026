package ar.unrn.solid.lsp;

/**
 * Implementación de FiguraLSP para un Círculo.
 */
public class Cuadrado implements FiguraLSP {
    private final int lado;

    /**
     * Crea un nuevo cuadrado con el lado especificado.
     * 
     * @param lado el tamaño del lado del cuadrado.
     */
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    /**
     * Calcula el área del cuadrado (lado * lado).
     * 
     * @return el área del cuadrado.
     */
    @Override
    public int obtenerArea() {
        return lado * lado;
    }
}
