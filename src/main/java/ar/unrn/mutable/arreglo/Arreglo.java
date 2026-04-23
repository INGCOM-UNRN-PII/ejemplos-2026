package ar.unrn.dos.mutable.arreglo;

import java.util.Arrays;
import java.util.Objects;

/**
 * Clase que envuelve un arreglo de enteros para proporcionar acceso controlado.
 * </p>
 * Creada para demostrar los problemas de referencias a objetos mutables.
 */
public class Arreglo {

    /**
     * El arreglo interno de enteros.
     */
    private final int[] arreglo;

    /**
     * Construye una nueva instancia de Arreglo.
     *
     * @param arreglo El arreglo inicial. No puede ser {@code null}.
     * @throws NullPointerException si el arreglo es {@code null}.
     * @contract.pre arreglo != null
     */
    public Arreglo(int[] arreglo) {
        Objects.requireNonNull(arreglo, "El arreglo no puede ser nulo");
        this.arreglo = arreglo;
    }

    /**
     * Modifica el valor en una posición específica.
     *
     * @param posicion El índice a modificar.
     * @param valor    El nuevo valor a asignar.
     * @throws ArrayIndexOutOfBoundsException si la posición es inválida.
     */
    public void modificar(int posicion, int valor) {
        this.arreglo[posicion] = valor;
    }

    /**
     * Obtiene el valor en una posición específica.
     *
     * @param posicion El índice del valor a obtener.
     * @return El valor en la posición indicada.
     * @throws ArrayIndexOutOfBoundsException si la posición es inválida.
     */
    public int obtener(int posicion) {
        return this.arreglo[posicion];
    }

    /**
     * Devuelve una representación en cadena del arreglo.
     *
     * @return Una cadena que representa el contenido del arreglo.
     */
    @Override
    public String toString() {
        return Arrays.toString(arreglo);
    }
}
