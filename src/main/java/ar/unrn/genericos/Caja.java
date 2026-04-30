package ar.unrn.genericos;

/**
 * Ejemplo básico de una clase genérica con un solo parámetro de tipo.
 * Representa un contenedor que puede guardar un objeto de cualquier tipo.
 * 
 * @param <T> el tipo de objeto que esta caja puede contener.
 */
public class Caja<T> {
    private T contenido;

    /**
     * Coloca un objeto dentro de la caja.
     * 
     * @param contenido el objeto a guardar en la caja.
     */
    public void poner(T contenido) {
        this.contenido = contenido;
    }

    /**
     * Recupera el objeto almacenado en la caja.
     * 
     * @return el objeto contenido en la caja, o null si está vacía.
     */
    public T obtener() {
        return contenido;
    }

    /**
     * Verifica si la caja está vacía.
     * 
     * @return verdadero si el contenido es nulo, falso en caso contrario.
     */
    public boolean estaVacia() {
        return contenido == null;
    }
}
