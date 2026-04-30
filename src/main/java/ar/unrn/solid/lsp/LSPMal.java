package ar.unrn.solid.lsp;

/**
 * VIOLACIÓN LSP: Un cuadrado NO es un rectángulo en términos de comportamiento
 * si permitimos cambiar ancho y alto de forma independiente.
 */
class RectanguloMal {
    protected int ancho;
    protected int alto;

    public void establecerAncho(int ancho) {
        this.ancho = ancho;
    }

    public void establecerAlto(int alto) {
        this.alto = alto;
    }

    public int obtenerArea() {
        return ancho * alto;
    }
}

class CuadradoMal extends RectanguloMal {
    @Override
    public void establecerAncho(int ancho) {
        this.ancho = ancho;
        this.alto = ancho; // Rompe la expectativa de un rectángulo
    }

    @Override
    public void establecerAlto(int alto) {
        this.ancho = alto;
        this.alto = alto;
    }
}
