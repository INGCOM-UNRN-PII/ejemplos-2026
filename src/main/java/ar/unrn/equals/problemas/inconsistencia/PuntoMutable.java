package ar.unrn.equals.problemas.inconsistencia;

import java.util.Objects;

/**
 * Modela el valor u objeto concreto sobre el que se pone a prueba una regla del contrato equals/hashCode dentro del paquete.
 * El paquete muestra como un objeto mutable deja de ser ubicable cuando el hash cambia despues de haber sido insertado en una coleccion.
 */
class PuntoMutable {
    private int x, y;

    public PuntoMutable(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PuntoMutable p)) {
            return false;
        }
        return x == p.x && y == p.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
