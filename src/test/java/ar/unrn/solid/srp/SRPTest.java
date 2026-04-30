package ar.unrn.solid.srp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SRPTest {
    @Test
    void testCalculoImpuestos() {
        Factura f = new Factura(100.0);
        CalculadoraImpuestos calc = new CalculadoraImpuestos();
        assertEquals(21.0, calc.calcular(f));
    }
}
