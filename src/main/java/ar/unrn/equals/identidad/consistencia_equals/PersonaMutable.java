package ar.unrn.equals.identidad.consistencia_equals;
public class PersonaMutable {
    private String nombre;
    public PersonaMutable(String nombre) { this.nombre = nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PersonaMutable)) return false;
        return nombre.equals(((PersonaMutable) obj).nombre);
    }
    @Override public int hashCode() { return nombre.hashCode(); }
}
