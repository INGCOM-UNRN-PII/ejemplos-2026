package ar.unrn.patrones.comportamiento.avanzado.chain_of_responsibility;

/**
 * Define la estructura base de la cadena y concentra la logica comun para atender o escalar un incidente.
 * El paquete usa Chain of Responsibility para escalar solicitudes sin acoplar al cliente con un handler concreto.
 */
public abstract class ManejadorSoporte {
    private ManejadorSoporte siguiente;

    public ManejadorSoporte enlazarCon(ManejadorSoporte siguiente) {
        this.siguiente = siguiente;
        return siguiente;
    }

    public void resolver(SolicitudSoporte solicitud) {
        if (puedeResolver(solicitud)) {
            atender(solicitud);
            return;
        }
        if (this.siguiente == null) {
            throw new IllegalStateException("No hay handler para: " + solicitud.getDescripcion());
        }
        System.out.println(getClass().getSimpleName() + " escala: " + solicitud.getDescripcion());
        this.siguiente.resolver(solicitud);
    }

    protected abstract boolean puedeResolver(SolicitudSoporte solicitud);

    protected abstract void atender(SolicitudSoporte solicitud);
}
