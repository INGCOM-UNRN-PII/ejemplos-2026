package ar.unrn.equals.problemas.rendimiento;

import java.util.Objects;

public class ObjetoBueno {
    private final int id;

    public ObjetoBueno(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ObjetoBueno that)) {
            return false;
        }
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
