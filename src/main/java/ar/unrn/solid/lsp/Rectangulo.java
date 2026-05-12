package ar.unrn.solid.lsp;

/**
 * Representa uno de los tipos concretos de la jerarquia y permite discutir si puede sustituir al tipo base sin romper expectativas.
 * El paquete discute el principio de sustitucion de Liskov y muestra cuando una subclase deja de comportarse como su tipo base promete.
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
