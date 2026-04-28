package ar.unrn.genericos;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class UtilidadesListasTest {

    @Test
    void testSumarDiferentesTipos() {
        List<Integer> enteros = Arrays.asList(1, 2, 3);
        List<Double> dobles = Arrays.asList(1.1, 2.2);
        
        assertEquals(6.0, UtilidadesListas.sumar(enteros));
        assertEquals(3.3, UtilidadesListas.sumar(dobles), 0.001);
    }

    @Test
    void testAgregarNumerosLowerBounded() {
        List<Number> listaDeNumeros = new ArrayList<>();
        UtilidadesListas.agregarNumeros(listaDeNumeros);
        
        assertEquals(5, listaDeNumeros.size());
        assertEquals(1, listaDeNumeros.get(0));
        assertEquals(5, listaDeNumeros.get(4));
        
        List<Object> listaDeObjetos = new ArrayList<>();
        UtilidadesListas.agregarNumeros(listaDeObjetos);
        assertEquals(5, listaDeObjetos.size());
    }

    @Test
    void testImprimirLista() {
        List<String> strings = Arrays.asList("A", "B", "C");
        // No hay mucho que asertar aquí sin capturar salida, 
        // pero validamos que no lance excepciones.
        assertDoesNotThrow(() -> UtilidadesListas.imprimirLista(strings));
    }
}
