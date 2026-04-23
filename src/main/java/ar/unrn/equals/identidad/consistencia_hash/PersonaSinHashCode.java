package ar.unrn.equals.identidad.consistencia_hash;
@SuppressWarnings("EqualsHashCode")
public class PersonaSinHashCode {
    private final String nombre;
    public PersonaSinHashCode(String nombre) { this.nombre = nombre; }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonaSinHashCode)) return false;
        PersonaSinHashCode persona = (PersonaSinHashCode) o;
        return nombre.equals(persona.nombre);
    }
}
