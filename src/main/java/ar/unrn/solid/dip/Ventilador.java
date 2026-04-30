package ar.unrn.solid.dip;

/**
 * Implementación de Dispositivo para un Ventilador.
 */
public class Ventilador implements Dispositivo {
    /**
     * Enciende el ventilador.
     */
    @Override
    public void encender() { System.out.println("Ventilador girando"); }
    /**
     * Detiene el ventilador.
     */
    @Override
    public void apagar() { System.out.println("Ventilador detenido"); }
}
