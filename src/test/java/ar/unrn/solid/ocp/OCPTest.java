package ar.unrn.solid.ocp;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class OCPTest {
    @Test
    void testAreaTotal() {
        GeneradorArea generador = new GeneradorArea();
        double total = generador.calcularAreaTotal(Arrays.asList(
            new Rectangulo(10, 5), // 50
            new Circulo(1)        // PI
        ));
        assertEquals(50 + Math.PI, total, 0.001);
    }
}
