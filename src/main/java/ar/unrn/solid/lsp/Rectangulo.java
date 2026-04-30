package ar.unrn.solid.lsp;

/**
 * Implementación de FiguraLSP para un Rectángulo.
 */
public class Rectangulo implements FiguraLSP {
    private final int ancho;
    private final int alto;

    /**
     * Crea un nuevo rectángulo con las dimensiones especificadas.
     * 
     * @param ancho el ancho del rectángulo.
     * @param alto el alto del rectángulo.
     */
    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    /**
     * Calcula el área del rectángulo (ancho * alto).
     * 
     * @return el área del rectángulo.
     */
    @Override
    public int obtenerArea() {
        return ancho * alto;
    }
}
