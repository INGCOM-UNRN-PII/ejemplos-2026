package ar.unrn.generados.colecciones.genericos;

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
