package ar.unrn.solid.dip;

/**
 * Representa un detalle concreto del ejemplo y muestra por que conviene ocultarlo detras de una abstraccion para desacoplar la politica de alto nivel.
 * El paquete explica el principio de inversion de dependencias separando las politicas de alto nivel de los detalles concretos que realizan el trabajo.
 */
public class Lampara implements Dispositivo {
    /**
     * Enciende la lámpara.
     */
    @Override
    public void encender() {
        System.out.println("Lámpara encendida");
    }

    /**
     * Apaga la lámpara.
     */
    @Override
    public void apagar() {
        System.out.println("Lámpara apagada");
    }
}
