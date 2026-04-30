package ar.unrn.solid.dip;

/**
 * Implementación de Dispositivo para una Lámpara.
 */
public class Lampara implements Dispositivo {
    /**
     * Enciende la lámpara.
     */
    @Override
    public void encender() { System.out.println("Lámpara encendida"); }
    /**
     * Apaga la lámpara.
     */
    @Override
    public void apagar() { System.out.println("Lámpara apagada"); }
}
