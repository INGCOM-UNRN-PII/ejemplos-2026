package ar.unrn.solid.isp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ISPTest {
    @Test
    void testRobotSoloTrabaja() {
        Trabajador robot = new Robot();
        // Validamos que sea Instancia de Trabajador pero NO de Alimentable
        assertTrue(robot instanceof Trabajador);
        assertFalse(robot instanceof Alimentable);
    }

    @Test
    void testHumanoAmbasCosas() {
        Humano humano = new Humano();
        assertTrue(humano instanceof Trabajador);
        assertTrue(humano instanceof Alimentable);
    }
}
