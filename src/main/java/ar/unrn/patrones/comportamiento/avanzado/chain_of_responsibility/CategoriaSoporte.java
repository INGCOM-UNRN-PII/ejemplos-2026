package ar.unrn.patrones.comportamiento.avanzado.chain_of_responsibility;

/**
 * Enumera las familias de incidentes que atraviesan la cadena de soporte.
 * El paquete usa Chain of Responsibility para escalar solicitudes sin acoplar al cliente con un handler concreto.
 */
public enum CategoriaSoporte {
    ACCESO,
    FUNCIONAL,
    INFRAESTRUCTURA
}
