package ar.unrn.genericos;

/**
 * Ejemplo de parámetros de tipo acotados (Bounded Type Parameters).
 * T solo puede ser de la clase Number o sus subclases.
 *
 * @param <T> un tipo que extiende de Number.
 */
public class ContenedorNumerico<T extends Number> {
    private final T numero;

    public ContenedorNumerico(T numero) {
        this.numero = numero;
    }

    public double obtenerValorDoble() {
        return numero.doubleValue();
    }

    public boolean esMayorQue(ContenedorNumerico<? extends Number> otro) {
        return this.numero.doubleValue() > otro.numero.doubleValue();
    }
}
