package ar.unrn.genericos;

/**
 * Ejemplo básico de una clase genérica con un solo parámetro de tipo.
 * @param <T> el tipo de objeto que esta caja puede contener.
 */
public class Caja<T> {
    private T contenido;

    public void poner(T contenido) {
        this.contenido = contenido;
    }

    public T obtener() {
        return contenido;
    }

    public boolean estaVacia() {
        return contenido == null;
    }
}
