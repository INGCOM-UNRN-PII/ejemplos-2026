package ar.unrn.solid.dip;

/**
 * Representa un detalle concreto del ejemplo y muestra por que conviene ocultarlo detras de una abstraccion para desacoplar la politica de alto nivel.
 * El paquete explica el principio de inversion de dependencias separando las politicas de alto nivel de los detalles concretos que realizan el trabajo.
 */
public class Ventilador implements Dispositivo {
    /**
     * Enciende el ventilador.
     */
    @Override
    public void encender() {
        System.out.println("Ventilador girando");
    }

    /**
     * Detiene el ventilador.
     */
    @Override
    public void apagar() {
        System.out.println("Ventilador detenido");
    }
}
