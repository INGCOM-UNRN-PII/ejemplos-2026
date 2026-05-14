package ar.unrn.patrones.comportamiento.avanzado.chain_of_responsibility;

/**
 * Cubre consultas funcionales del sistema y absorbe problemas que ya requieren criterio humano de negocio.
 * El paquete usa Chain of Responsibility para escalar solicitudes sin acoplar al cliente con un handler concreto.
 */
public class AgenteAplicacion extends ManejadorSoporte {
    @Override
    protected boolean puedeResolver(SolicitudSoporte solicitud) {
        return solicitud.getCategoria() == CategoriaSoporte.FUNCIONAL && solicitud.getPrioridad() <= 2;
    }

    @Override
    protected void atender(SolicitudSoporte solicitud) {
        System.out.println("AgenteAplicacion guía al usuario: " + solicitud.getDescripcion());
    }
}
