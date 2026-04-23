package ar.unrn.equals.identidad.mutabilidad;
public class PersonaMutable {
    private String nombre;
    public PersonaMutable(String nombre) { this.nombre = nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonaMutable)) return false;
        PersonaMutable persona = (PersonaMutable) o;
        return nombre.equals(persona.nombre);
    }
    @Override public int hashCode() { return nombre.hashCode(); }
}
