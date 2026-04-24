package ar.unrn.dominio.combate;

/**
 * Representa un arma con daño y cantidad limitada de usos.
 * Sigue el principio de encapsulamiento estricto: sin accesores (getters/setters).
 */
public class Arma {
    private final int danioBase;
    private int usosRestantes;

    /**
     * @param danio el daño que inflige cada uso.
     * @param usos la cantidad de veces que se puede utilizar.
     */
    public Arma(int danio, int usos) {
        this.danioBase = danio;
        this.usosRestantes = usos;
    }

    /**
     * Comportamiento: El arma es disparada y devuelve el daño infligido.
     * No hay un método getUsosRestantes(); el objeto gestiona su propio estado.
     * @return el daño infligido por este disparo.
     */
    public int disparar() {
        int danioEfectivo = 0;
        if (usosRestantes > 0) {
            danioEfectivo = danioBase;
            usosRestantes--;
        }
        return danioEfectivo;
    }
}
