package ar.unrn.solid.isp;

/**
 * Define el contrato minimo que las implementaciones del paquete deben cumplir para colaborar sin depender de detalles concretos.
 * El paquete usa estos tipos para mostrar que una interfaz debe exponer solo las operaciones que cada cliente realmente necesita.
 */
public interface Trabajador {
    /**
     * Realiza una tarea de trabajo.
     */
    void trabajar();
}
