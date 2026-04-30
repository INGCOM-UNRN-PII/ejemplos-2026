package ar.unrn.solid.dip;

/**
 * DIP CUMPLIDO: El Interruptor depende de la abstracción Dispositivo.
 */
public class Interruptor {
    private final Dispositivo dispositivo;

    public Interruptor(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void operar() {
        dispositivo.encender();
    }
}
