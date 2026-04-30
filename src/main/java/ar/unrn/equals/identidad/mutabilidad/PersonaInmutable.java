package ar.unrn.equals.identidad.mutabilidad;

public class PersonaInmutable {
    private final String nombre;

    public PersonaInmutable(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PersonaInmutable)) {
            return false;
        }
        PersonaInmutable persona = (PersonaInmutable) o;
        return nombre.equals(persona.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}
