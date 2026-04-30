package ar.unrn.solid.lsp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LSPTest {
    
    @Test
    void testViolacionLSP() {
        RectanguloMal r = new CuadradoMal();
        r.establecerAncho(5);
        r.establecerAlto(4);
        
        // En un rectángulo, si el ancho es 5 y el alto es 4, el área debería ser 20.
        // Pero en CuadradoMal, el área será 16. Esto viola LSP.
        assertNotEquals(20, r.obtenerArea());
    }

    @Test
    void testLSPBien() {
        FiguraLSP r = new Rectangulo(5, 4);
        assertEquals(20, r.obtenerArea());
        
        FiguraLSP c = new Cuadrado(5);
        assertEquals(25, c.obtenerArea());
    }
}
