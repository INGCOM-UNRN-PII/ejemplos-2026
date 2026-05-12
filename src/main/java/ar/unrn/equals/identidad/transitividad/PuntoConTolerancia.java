package ar.unrn.equals.identidad.transitividad;

/**
 * Modela el valor u objeto concreto sobre el que se pone a prueba una regla del contrato equals/hashCode dentro del paquete.
 * El paquete demuestra que una definicion laxa de igualdad puede romper la transitividad y volver ambiguas las comparaciones encadenadas.
 */
public class PuntoConTolerancia {
    private final int x, y;

    public PuntoConTolerancia(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PuntoConTolerancia)) {
            return false;
        }
        PuntoConTolerancia otro = (PuntoConTolerancia) obj;
        return Math.abs(x - otro.x) <= 1 && Math.abs(y - otro.y) <= 1;
    }

    @Override
    public int hashCode() {
        return 42;
    }
}
