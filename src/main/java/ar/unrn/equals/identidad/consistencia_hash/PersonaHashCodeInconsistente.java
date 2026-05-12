package ar.unrn.equals.identidad.consistencia_hash;

/**
 * Modela el valor u objeto concreto sobre el que se pone a prueba una regla del contrato equals/hashCode dentro del paquete.
 * El paquete muestra la relacion obligatoria entre equals y hashCode, especialmente cuando los objetos se almacenan en colecciones basadas en hash.
 */
public class PersonaHashCodeInconsistente {
    private final String nombre;

    public PersonaHashCodeInconsistente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PersonaHashCodeInconsistente)) {
            return false;
        }
        PersonaHashCodeInconsistente p = (PersonaHashCodeInconsistente) o;
        return nombre.equals(p.nombre);
    }

    @Override
    public int hashCode() {
        return (int) (Math.random() * 1000);
    }
}
