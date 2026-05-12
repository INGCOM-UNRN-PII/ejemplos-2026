package ar.unrn.solid.lsp;

/**
 * Define el contrato minimo que las implementaciones del paquete deben cumplir para colaborar sin depender de detalles concretos.
 * El paquete discute el principio de sustitucion de Liskov y muestra cuando una subclase deja de comportarse como su tipo base promete.
 */
public interface FiguraLSP {
    /**
     * Obtiene el área de la figura.
     *
     * @return el área calculada.
     */
    int obtenerArea();
}
