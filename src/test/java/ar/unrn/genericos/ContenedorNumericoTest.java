package ar.unrn.genericos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContenedorNumericoTest {

    @Test
    void testConInteger() {
        ContenedorNumerico<Integer> entero = new ContenedorNumerico<>(10);
        assertEquals(10.0, entero.obtenerValorDoble());
    }

    @Test
    void testConDouble() {
        ContenedorNumerico<Double> decimal = new ContenedorNumerico<>(15.5);
        assertEquals(15.5, decimal.obtenerValorDoble());
    }

    @Test
    void testComparacionDiferentesTiposNumericos() {
        ContenedorNumerico<Integer> entero = new ContenedorNumerico<>(20);
        ContenedorNumerico<Double> decimal = new ContenedorNumerico<>(15.5);
        
        assertTrue(entero.esMayorQue(decimal));
        assertFalse(decimal.esMayorQue(entero));
    }
}
