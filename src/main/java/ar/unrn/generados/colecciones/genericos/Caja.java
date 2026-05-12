package ar.unrn.generados.colecciones.genericos;

/**
 * Modela un contenedor generico minimo y hace tangible como un mismo tipo puede reutilizarse con contenidos distintos sin casting.
 * El paquete agrupa ejemplos breves de genericos para mostrar como Java captura tipos y reutiliza algoritmos sin perder seguridad en compilacion.
 */
public class Caja<T> {
    @javax.annotation.Nullable
    private T contenido;

    public void poner(T algo) {
        this.contenido = algo;
    }

    public T sacar() {
        return contenido;
    }
}
