package ar.unrn.equals.problemas.colisiones;
public class MalaMesa {
    private final String id;
    public MalaMesa(String id) { this.id = id; }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MalaMesa m)) return false;
        return id.equals(m.id);
    }
    @Override public int hashCode() { return 42; }
    @Override public String toString() { return id; }
}
