package ar.unrn.solid.ocp;

/**
 * Define el contrato minimo que las implementaciones del paquete deben cumplir para colaborar sin depender de detalles concretos.
 * El paquete esta orientado a explicar el principio abierto/cerrado: agregar comportamiento no deberia exigir reescribir la logica existente.
 */
public interface Forma {
    /**
     * Calcula el área de la forma.
     *
     * @return el área calculada.
     */
    double calcularArea();
}
