package ar.unrn.solid.isp;

/**
 * Representa a un trabajador humano que puede trabajar y comer.
 */
public class Humano implements Trabajador, Alimentable {
    /**
     * El humano realiza su trabajo.
     */
    @Override
    public void trabajar() { System.out.println("Humano trabajando"); }
    /**
     * El humano se alimenta.
     */
    @Override
    public void comer() { System.out.println("Humano alimentándose"); }
}
