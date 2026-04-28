package ar.unrn.genericos;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ComparadorMaximoTest {

    @Test
    void testMaximoDeEnteros() {
        List<Integer> numeros = Arrays.asList(3, 7, 1, 9, 2);
        assertEquals(9, ComparadorMaximo.encontrarMaximo(numeros));
    }

    @Test
    void testMaximoDeStrings() {
        List<String> palabras = Arrays.asList("Alfa", "Zeta", "Beta");
        assertEquals("Zeta", ComparadorMaximo.encontrarMaximo(palabras));
    }

    @Test
    void testListaVaciaLanzaExcepcion() {
        List<Integer> vacia = Arrays.asList();
        assertThrows(IllegalArgumentException.class, () -> 
            ComparadorMaximo.encontrarMaximo(vacia)
        );
    }

    @Test
    void testMaximoConUnSoloElemento() {
        List<Double> unSoloElemento = Arrays.asList(5.5);
        assertEquals(5.5, ComparadorMaximo.encontrarMaximo(unSoloElemento));
    }
}
