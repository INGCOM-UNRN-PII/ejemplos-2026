package ar.unrn.equals.identidad.consistencia_hash;

import java.util.Objects;

public class PersonaCorrecta {
    private final String nombre;

    public PersonaCorrecta(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersonaCorrecta otra = (PersonaCorrecta) obj;
        return Objects.equals(nombre, otra.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
