package ar.unrn.solid.isp;

/**
 * Representa un cliente o implementacion concreta del ejemplo y deja ver que conjunto minimo de operaciones necesita de verdad.
 * El paquete usa estos tipos para mostrar que una interfaz debe exponer solo las operaciones que cada cliente realmente necesita.
 */
public class Humano implements Trabajador, Alimentable {
    /**
     * El humano realiza su trabajo.
     */
    @Override
    public void trabajar() {
        System.out.println("Humano trabajando");
    }

    /**
     * El humano se alimenta.
     */
    @Override
    public void comer() {
        System.out.println("Humano alimentándose");
    }
}
