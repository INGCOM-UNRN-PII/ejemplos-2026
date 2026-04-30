package ar.unrn.equals.problemas.inconsistencia;

import java.util.Objects;

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
