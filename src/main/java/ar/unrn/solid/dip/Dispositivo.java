package ar.unrn.solid.dip;

/**
 * Interfaz que define las operaciones básicas de un dispositivo electrónico.
 * Ejemplo del Principio de Inversión de Dependencias (DIP).
 */
public interface Dispositivo {
    /**
     * Activa el dispositivo.
     */
    void encender();
    /**
     * Desactiva el dispositivo.
     */
    void apagar();
}
