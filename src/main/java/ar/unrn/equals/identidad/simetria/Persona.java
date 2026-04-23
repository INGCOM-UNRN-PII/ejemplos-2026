package ar.unrn.equals.identidad.simetria;
public class Persona {
    protected final String nombre;
    public Persona(String nombre) { this.nombre = nombre; }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Persona)) return false;
        Persona otra = (Persona) obj;
        return nombre.equals(otra.nombre);
    }
    @Override public int hashCode() { return nombre.hashCode(); }
}
