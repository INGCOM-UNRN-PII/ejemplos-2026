package ar.unrn.dominio.combate;

/**
 * Modela un participante del combate y concentra una regla concreta de ataque, daño o equipamiento dentro del escenario.
 * El paquete modela un combate sencillo para practicar colaboracion entre objetos sin exponer estado innecesario y dejando las reglas donde corresponden.
 */
public class Arma {
    private final int danioBase;
    private int usosRestantes;

    /**
     * @param danio el daño que inflige cada uso.
     * @param usos  la cantidad de veces que se puede utilizar.
     */
    public Arma(int danio, int usos) {
        this.danioBase = danio;
        this.usosRestantes = usos;
    }

    /**
     * Comportamiento: El arma es disparada y devuelve el daño infligido.
     * No hay un método getUsosRestantes(); el objeto gestiona su propio estado.
     *
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
