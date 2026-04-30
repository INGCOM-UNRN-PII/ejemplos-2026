package ar.unrn.solid.lsp;

/**
 * Interfaz que define una figura que puede proporcionar su área.
 * Utilizada para demostrar el Principio de Sustitución de Liskov (LSP).
 */
public interface FiguraLSP {
    /**
     * Obtiene el área de la figura.
     * 
     * @return el área calculada.
     */
    int obtenerArea();
}
