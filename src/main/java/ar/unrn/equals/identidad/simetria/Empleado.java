package ar.unrn.equals.identidad.simetria;

/**
 * Modela el valor u objeto concreto sobre el que se pone a prueba una regla del contrato equals/hashCode dentro del paquete.
 * El paquete discute la simetria de equals dentro de una jerarquia, donde comparar en un sentido y en el inverso debe arrojar el mismo resultado.
 */
public class Empleado extends Persona {
    private final int legajo;

    public Empleado(String nombre, int legajo) {
        super(nombre);
        this.legajo = legajo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Empleado)) {
            return false;
        }
        Empleado otro = (Empleado) obj;
        return nombre.equals(otro.nombre) && legajo == otro.legajo;
    }

    @Override
    public int hashCode() {
        return 31 * nombre.hashCode() + legajo;
    }
}
