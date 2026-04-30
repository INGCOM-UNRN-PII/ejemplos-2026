package ar.unrn.genericos;

/**
 * Ejemplo de clase genérica con dos parámetros de tipo.
 * Útil para representar pares clave-valor inmutables.
 * 
 * @param <K> el tipo de la clave.
 * @param <V> el tipo del valor.
 */
public class Par<K, V> {
    private final K clave;
    private final V valor;

    /**
     * Crea un nuevo Par con la clave y el valor especificados.
     * 
     * @param clave la clave del par.
     * @param valor el valor asociado a la clave.
     */
    public Par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    /**
     * Obtiene la clave del par.
     * 
     * @return la clave almacenada.
     */
    public K obtenerClave() {
        return clave;
    }

    /**
     * Obtiene el valor del par.
     * 
     * @return el valor almacenado.
     */
    public V obtenerValor() {
        return valor;
    }

    /**
     * Devuelve una representación en cadena del par.
     * 
     * @return una cadena con el formato (clave, valor).
     */
    @Override
    public String toString() {
        return "(" + clave + ", " + valor + ")";
    }
}
