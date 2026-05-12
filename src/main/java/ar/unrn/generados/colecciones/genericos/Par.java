package ar.unrn.generados.colecciones.genericos;

/**
 * Agrupa dos valores tipados y sirve para mostrar como los genericos mantienen juntas piezas relacionadas conservando seguridad de tipos.
 * El paquete agrupa ejemplos breves de genericos para mostrar como Java captura tipos y reutiliza algoritmos sin perder seguridad en compilacion.
 */
public class Par<K, V> {
    private final K clave;
    private final V valor;

    public Par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public K getClave() {
        return clave;
    }

    public V getValor() {
        return valor;
    }
}
