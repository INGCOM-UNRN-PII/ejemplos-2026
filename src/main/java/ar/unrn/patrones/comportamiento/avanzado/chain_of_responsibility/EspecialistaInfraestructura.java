package ar.unrn.patrones.comportamiento.avanzado.chain_of_responsibility;

/**
 * Cierra la cadena resolviendo incidentes criticos o de infraestructura que nadie anterior pudo atender.
 * El paquete usa Chain of Responsibility para escalar solicitudes sin acoplar al cliente con un handler concreto.
 */
public class EspecialistaInfraestructura extends ManejadorSoporte {
    @Override
    protected boolean puedeResolver(SolicitudSoporte solicitud) {
        return solicitud.getCategoria() == CategoriaSoporte.INFRAESTRUCTURA || solicitud.getPrioridad() == 3;
    }

    @Override
    protected void atender(SolicitudSoporte solicitud) {
        System.out.println("EspecialistaInfraestructura toma el caso: " + solicitud.getDescripcion());
    }
}
