package ar.unrn.equals.identidad.mutabilidad;

/**
 * Modela el valor u objeto concreto sobre el que se pone a prueba una regla del contrato equals/hashCode dentro del paquete.
 * El paquete usa estos tipos para mostrar como la mutabilidad puede romper la identidad logica despues de insertar objetos en una coleccion.
 */
public class PersonaMutable {
    private String nombre;

    public PersonaMutable(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PersonaMutable)) {
            return false;
        }
        PersonaMutable persona = (PersonaMutable) o;
        return nombre.equals(persona.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}
