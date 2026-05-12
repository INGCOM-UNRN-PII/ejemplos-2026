package ar.unrn.genericos;

/**
 * Modela una utilidad o contenedor generico pensado para reutilizar comportamiento conservando seguridad de tipos en compilacion.
 * El paquete practica genericos con contenedores y utilidades pequeñas para mostrar reutilizacion de algoritmos sin casting manual.
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
     *
     * @return verdadero si este número es mayor que el otro, falso en caso contrario.
     */
    public boolean esMayorQue(ContenedorNumerico<? extends Number> otro) {
        return this.numero.doubleValue() > otro.numero.doubleValue();
    }
}
