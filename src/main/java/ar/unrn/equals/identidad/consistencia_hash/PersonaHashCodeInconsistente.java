package ar.unrn.equals.identidad.consistencia_hash;
public class PersonaHashCodeInconsistente {
    private final String nombre;
    public PersonaHashCodeInconsistente(String nombre) { this.nombre = nombre; }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonaHashCodeInconsistente)) return false;
        PersonaHashCodeInconsistente p = (PersonaHashCodeInconsistente) o;
        return nombre.equals(p.nombre);
    }
    @Override public int hashCode() { return (int)(Math.random() * 1000); }
}
