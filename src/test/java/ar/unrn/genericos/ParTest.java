package ar.unrn.genericos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParTest {

    @Test
    void testParDeDiferentesTipos() {
        Par<String, Integer> par = new Par<>("ID", 123);
        assertEquals("ID", par.obtenerClave());
        assertEquals(123, par.obtenerValor());
    }

    @Test
    void testParDeMismoTipo() {
        Par<Double, Double> punto = new Par<>(10.5, 20.0);
        assertEquals(10.5, punto.obtenerClave());
        assertEquals(20.0, punto.obtenerValor());
    }

    @Test
    void testToString() {
        Par<String, String> par = new Par<>("Lunes", "Trabajo");
        assertEquals("(Lunes, Trabajo)", par.toString());
    }
}
