package ar.unrn.solid.dip;

/**
 * Clase que controla un dispositivo a través de su abstracción.
 * Cumple con DIP al depender de la interfaz Dispositivo en lugar de
 * implementaciones concretas.
 */
public class Interruptor {
    private final Dispositivo dispositivo;

    /**
     * Crea un nuevo interruptor asociado al dispositivo dado.
     *
     * @param dispositivo el dispositivo que este interruptor controlará.
     */
    public Interruptor(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    /**
     * Acciona el interruptor para encender el dispositivo asociado.
     */
    public void operar() {
        dispositivo.encender();
    }
}
