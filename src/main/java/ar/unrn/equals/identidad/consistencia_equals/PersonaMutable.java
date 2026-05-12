package ar.unrn.equals.identidad.consistencia_equals;

/**
 * Modela el valor u objeto concreto sobre el que se pone a prueba una regla del contrato equals/hashCode dentro del paquete.
 * El paquete expone por que equals debe ser consistente entre invocaciones sucesivas mientras los objetos no cambian de estado relevante.
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
    public boolean equals(Object obj) {
        if (!(obj instanceof PersonaMutable)) {
            return false;
        }
        return nombre.equals(((PersonaMutable) obj).nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}
