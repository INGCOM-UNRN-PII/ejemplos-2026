package ar.unrn.patrones.comportamiento.avanzado.chain_of_responsibility;

/**
 * Transporta los datos que cada handler evalua para decidir si puede resolver o debe escalar el caso.
 * El paquete usa Chain of Responsibility para escalar solicitudes sin acoplar al cliente con un handler concreto.
 */
public class SolicitudSoporte {
    private final CategoriaSoporte categoria;
    private final int prioridad;
    private final String descripcion;

    public SolicitudSoporte(CategoriaSoporte categoria, int prioridad, String descripcion) {
        if (prioridad < 1 || prioridad > 3) {
            throw new IllegalArgumentException("La prioridad debe estar entre 1 y 3.");
        }
        this.categoria = categoria;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
    }

    public CategoriaSoporte getCategoria() {
        return this.categoria;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}
