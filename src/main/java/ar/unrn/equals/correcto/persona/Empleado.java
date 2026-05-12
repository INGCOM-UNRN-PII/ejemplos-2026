package ar.unrn.equals.correcto.persona;


import java.util.Objects;

/**
 * Modela el valor u objeto concreto sobre el que se pone a prueba una regla del contrato equals/hashCode dentro del paquete.
 * El paquete usa este tipo para mostrar una implementacion correcta de equals y hashCode, donde la identidad se apoya en atributos estables y en una comparacion coherente.
 */
public final class Empleado extends Persona {
    private final String legajo;

    /**
     * Construye una nueva instancia de {@code Persona}.
     *
     * @param nombre El nombre de la persona.
     * @param edad   La edad de la persona.
     */
    public Empleado(String nombre, int edad, String legajo) {
        super(nombre, edad);
        Objects.requireNonNull(legajo);
        this.legajo = legajo;
    }

    @Override
    public boolean equals(Object otro) {
        if (this == otro) {
            return true;
        }
        if (otro == null || getClass() != otro.getClass()) {
            return false;
        }
        if (!super.equals(otro)) {
            return false;
        }
        Empleado empleado = (Empleado) otro;
        return Objects.equals(legajo, empleado.legajo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), legajo);
    }

}
