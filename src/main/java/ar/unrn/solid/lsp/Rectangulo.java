package ar.unrn.solid.lsp;

public class Rectangulo implements FiguraLSP {
    private final int ancho;
    private final int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public int obtenerArea() {
        return ancho * alto;
    }
}
