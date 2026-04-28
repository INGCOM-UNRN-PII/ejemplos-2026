package ar.unrn.genericos;

/**
 * Ejemplo de clase genérica con dos parámetros de tipo.
 * Útil para representar pares clave-valor.
 * @param <K> el tipo de la clave.
 * @param <V> el tipo del valor.
 */
public class Par<K, V> {
    private final K clave;
    private final V valor;

    public Par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public K obtenerClave() {
        return clave;
    }

    public V obtenerValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "(" + clave + ", " + valor + ")";
    }
}
