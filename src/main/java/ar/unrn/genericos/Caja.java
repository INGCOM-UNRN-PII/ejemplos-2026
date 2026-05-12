package ar.unrn.genericos;

/**
 * Modela un contenedor generico minimo y hace tangible como un mismo tipo puede reutilizarse con contenidos distintos sin casting.
 * El paquete practica genericos con contenedores y utilidades pequeñas para mostrar reutilizacion de algoritmos sin casting manual.
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
