package ar.unrn.equals.identidad.simetria;

public class Persona {
    protected final String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Persona)) {
            return false;
        }
        Persona otra = (Persona) obj;
        return java.util.Objects.equals(nombre, otra.nombre);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hashCode(nombre);
    }
}
