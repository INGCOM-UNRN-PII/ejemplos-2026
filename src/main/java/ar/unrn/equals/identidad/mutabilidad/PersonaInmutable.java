package ar.unrn.equals.identidad.mutabilidad;

/**
 * Modela el valor u objeto concreto sobre el que se pone a prueba una regla del contrato equals/hashCode dentro del paquete.
 * El paquete usa estos tipos para mostrar como la mutabilidad puede romper la identidad logica despues de insertar objetos en una coleccion.
 */
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
