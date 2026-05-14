package ar.unrn.patrones.comportamiento.avanzado.chain_of_responsibility;

/**
 * Atiende incidentes simples de acceso y deja pasar el resto para no mezclar automatizacion con soporte especializado.
 * El paquete usa Chain of Responsibility para escalar solicitudes sin acoplar al cliente con un handler concreto.
 */
public class BotPrimerNivel extends ManejadorSoporte {
    @Override
    protected boolean puedeResolver(SolicitudSoporte solicitud) {
        return solicitud.getCategoria() == CategoriaSoporte.ACCESO && solicitud.getPrioridad() == 1;
    }

    @Override
    protected void atender(SolicitudSoporte solicitud) {
        System.out.println("BotPrimerNivel resuelve acceso básico: " + solicitud.getDescripcion());
    }
}
