package ar.unrn.equals.problemas.colisiones;

/**
 * Modela el valor u objeto concreto sobre el que se pone a prueba una regla del contrato equals/hashCode dentro del paquete.
 * El paquete ilustra el costo de producir hashes pobres, porque demasiadas colisiones degradan el rendimiento real de tablas hash.
 */
public class MalaMesa {
    private final String id;

    public MalaMesa(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MalaMesa m)) {
            return false;
        }
        return id.equals(m.id);
    }

    @Override
    public int hashCode() {
        return 42;
    }

    @Override
    public String toString() {
        return id;
    }
}
