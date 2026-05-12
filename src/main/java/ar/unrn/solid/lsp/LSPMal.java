package ar.unrn.solid.lsp;

/**
 * Representa una variante deliberadamente defectuosa que sirve para exponer el problema de diseno que el paquete esta discutiendo.
 * El paquete discute el principio de sustitucion de Liskov y muestra cuando una subclase deja de comportarse como su tipo base promete.
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

/**
 * Representa una variante deliberadamente defectuosa que sirve para exponer el problema de diseno que el paquete esta discutiendo.
 * El paquete discute el principio de sustitucion de Liskov y muestra cuando una subclase deja de comportarse como su tipo base promete.
 */
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
