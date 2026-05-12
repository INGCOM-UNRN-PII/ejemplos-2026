package ar.unrn.solid.dip;

/**
 * Representa la parte base del modelo heredado y concentra el estado que toda especializacion necesita recibir por constructor.
 * El paquete explica el principio de inversion de dependencias separando las politicas de alto nivel de los detalles concretos que realizan el trabajo.
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
