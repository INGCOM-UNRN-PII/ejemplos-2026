package ar.unrn.basicos.contador;

/**
 * Clase que representa un contador con un límite máximo (tope).
 * Permite incrementar la posición actual asegurando que no supere el tope definido.
 */
public class Contador {
    /**
     * El valor máximo que el contador no debe superar al incrementarse.
     */
    private int tope;

    /**
     * La posición o valor actual del contador.
     */
    private int posicion;

    /**
     * Construye un nuevo Contador con el tope especificado.
     * La posición inicial será siempre 0.
     *
     * @param tope El valor máximo que el contador puede alcanzar.
     */
    public Contador(int tope) {
        this.tope = tope;
        this.posicion = 0;
    }

    /**
     * Incrementa la posición actual del contador en la distancia indicada.
     *
     * @param distancia La cantidad a incrementar. Debe ser estrictamente mayor que 0.
     *
     * @return La nueva posición del contador tras el incremento.
     * @throws IllegalArgumentException si la distancia es negativa o cero,
     *                                  o si el incremento hace que la posición supere el tope.
     */
    public int incrementar(int distancia) {
        if (distancia > 0) {
            if ((posicion + distancia) > tope) {
                throw new IllegalArgumentException("Nos pasamos del tope");
            }
            posicion = posicion + distancia;
            return posicion;
        } else {
            throw new IllegalArgumentException("la distancia es negativa");
        }
    }

    /**
     * Obtiene la posición actual del contador.
     *
     * @return La posición actual.
     */
    public int getPosicion() {
        return posicion;
    }

    /**
     * Establece manualmente la posición actual del contador.
     *
     * @param posicion La nueva posición a establecer.
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    /**
     * Devuelve una representación en formato de cadena del estado actual del contador.
     *
     * @return Una cadena con el formato "Contador: [posicion] / [tope]".
     */
    @Override
    public String toString() {
        return "Contador: " + posicion + " / " + tope;
    }

}
