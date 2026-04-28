package ar.unrn.genericos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CajaTest {

    @Test
    void testCajaConString() {
        Caja<String> cajaDeTexto = new Caja<>();
        assertTrue(cajaDeTexto.estaVacia());
        
        cajaDeTexto.poner("Hola Generics");
        assertFalse(cajaDeTexto.estaVacia());
        assertEquals("Hola Generics", cajaDeTexto.obtener());
    }

    @Test
    void testCajaConInteger() {
        Caja<Integer> cajaDeEnteros = new Caja<>();
        cajaDeEnteros.poner(42);
        assertEquals(42, cajaDeEnteros.obtener());
    }

    @Test
    void testCajaConNull() {
        Caja<Object> caja = new Caja<>();
        caja.poner(null);
        assertTrue(caja.estaVacia());
    }
}
