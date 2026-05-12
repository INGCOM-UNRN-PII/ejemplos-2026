package ar.unrn.equals.identidad.consistencia_hash;

import java.util.Objects;

/**
 * Modela el valor u objeto concreto sobre el que se pone a prueba una regla del contrato equals/hashCode dentro del paquete.
 * El paquete muestra la relacion obligatoria entre equals y hashCode, especialmente cuando los objetos se almacenan en colecciones basadas en hash.
 */
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
