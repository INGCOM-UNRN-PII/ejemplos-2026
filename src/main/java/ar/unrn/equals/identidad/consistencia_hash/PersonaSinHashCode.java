package ar.unrn.equals.identidad.consistencia_hash;

/**
 * Modela el valor u objeto concreto sobre el que se pone a prueba una regla del contrato equals/hashCode dentro del paquete.
 * El paquete muestra la relacion obligatoria entre equals y hashCode, especialmente cuando los objetos se almacenan en colecciones basadas en hash.
 */
@SuppressWarnings("EqualsHashCode")
public class PersonaSinHashCode {
    private final String nombre;

    public PersonaSinHashCode(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PersonaSinHashCode)) {
            return false;
        }
        PersonaSinHashCode persona = (PersonaSinHashCode) o;
        return nombre.equals(persona.nombre);
    }
}
