package ar.unrn.genericos;

/**
 * Ejemplo de parámetros de tipo acotados (Bounded Type Parameters).
 * T solo puede ser de la clase Number o sus subclases.
 * 
 * @param <T> un tipo que extiende de Number.
 */
public class ContenedorNumerico<T extends Number> {
    private final T numero;

    /**
     * Crea un nuevo ContenedorNumerico con el número especificado.
     * 
     * @param numero el valor numérico a contener.
     */
    public ContenedorNumerico(T numero) {
        this.numero = numero;
    }

    /**
     * Obtiene el valor contenido convertido a double.
     * 
     * @return el valor del número como un double.
     */
    public double obtenerValorDoble() {
        return numero.doubleValue();
    }

    /**
     * Compara el valor de este contenedor con otro contenedor numérico.
     * 
     * @param otro el otro contenedor con el que comparar.
     * @return verdadero si este número es mayor que el otro, falso en caso contrario.
     */
    public boolean esMayorQue(ContenedorNumerico<? extends Number> otro) {
        return this.numero.doubleValue() > otro.numero.doubleValue();
    }
}
