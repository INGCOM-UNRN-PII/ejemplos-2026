package ar.unrn.solid.dip;

import org.junit.jupiter.api.Test;
import java.util.concurrent.atomic.AtomicBoolean;
import static org.junit.jupiter.api.Assertions.*;

class DIPTest {
    @Test
    void testInterruptorFuncionaConCualquierDispositivo() {
        AtomicBoolean encendido = new AtomicBoolean(false);
        
        // Mock simple usando clase anónima o lambda
        Dispositivo dispositivoMock = new Dispositivo() {
            @Override public void encender() { encendido.set(true); }
            @Override public void apagar() { encendido.set(false); }
        };
        
        Interruptor interruptor = new Interruptor(dispositivoMock);
        interruptor.operar();
        
        assertTrue(encendido.get());
    }
}
