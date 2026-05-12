package ar.unrn.equals.identidad.simetria;

/**
 * Modela el valor u objeto concreto sobre el que se pone a prueba una regla del contrato equals/hashCode dentro del paquete.
 * El paquete discute la simetria de equals dentro de una jerarquia, donde comparar en un sentido y en el inverso debe arrojar el mismo resultado.
 */
public class Persona {
    protected final String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Persona)) {
            return false;
        }
        Persona otra = (Persona) obj;
        return java.util.Objects.equals(nombre, otra.nombre);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hashCode(nombre);
    }
}
