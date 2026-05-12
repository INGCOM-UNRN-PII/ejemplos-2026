package ar.unrn.solid.lsp;

/**
 * Representa uno de los tipos concretos de la jerarquia y permite discutir si puede sustituir al tipo base sin romper expectativas.
 * El paquete discute el principio de sustitucion de Liskov y muestra cuando una subclase deja de comportarse como su tipo base promete.
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
