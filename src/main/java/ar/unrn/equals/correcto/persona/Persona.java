package ar.unrn.equals.correcto.persona;

import java.util.Objects;

/**
 * Representa a una persona con un nombre y una edad.
 * Esta clase sirve como ejemplo de cómo implementar correctamente
 * el protocolo {@link Object#equals(Object)} / {@link Object#hashCode()}.
 */
class Persona {

    /**
     * El nombre de la persona.
     */
    private String nombre;

    /**
     * La edad de la persona en años.
     */
    private int edad;

    /**
     * Construye una nueva instancia de {@code Persona}.
     *
     * @param nombre El nombre de la persona.
     * @param edad   La edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Compara este objeto {@code Persona} con otro objeto para determinar si son iguales.
     * La comparación se basa en el nombre y la edad. Utiliza getClass() para asegurar
     * que la comparación solo sea válida entre objetos de la misma clase exacta.
     *
     * @param otro El objeto a comparar con esta persona.
     *
     * @return {@code true} si los objetos son de la misma clase y tienen el mismo
     * nombre y edad; {@code false} en caso contrario.
     */
    @Override
    public boolean equals(Object otro) {
        boolean esIgual = false;
        if (this == otro) {
            esIgual = true;
        } else if (otro != null && getClass() == otro.getClass()) {
            Persona persona = (Persona) otro;
            esIgual = (edad == persona.edad &&
                    Objects.equals(nombre, persona.nombre));
        }
        return esIgual;
    }

    /**
     * Devuelve un valor de código hash para este objeto {@code Persona}.
     * El cálculo se basa en el nombre y la edad para mantener consistencia
     * con el método {@link #equals(Object)}.
     *
     * @return El valor del código hash calculado para esta persona.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }

    /**
     * Devuelve una representación en forma de cadena de este objeto {@code Persona}.
     *
     * @return Una cadena que contiene el nombre y la edad de la persona.
     */
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
