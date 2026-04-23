package ar.unrn.equals.identidad.transitividad;
public class PuntoConTolerancia {
    private final int x, y;
    public PuntoConTolerancia(int x, int y) { this.x = x; this.y = y; }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PuntoConTolerancia)) return false;
        PuntoConTolerancia otro = (PuntoConTolerancia) obj;
        return Math.abs(x - otro.x) <= 1 && Math.abs(y - otro.y) <= 1;
    }
    @Override public int hashCode() { return 42; }
}
