package ar.unrn.dominio.combate;

/**
 * Representa un combatiente que posee un arma y puntos de salud.
 * El estado es totalmente privado y no se expone mediante getters.
 */
public class Combatiente {
    private final String nombre;
    private int salud;
    private final Arma arma;

    public Combatiente(String nombre, int salud, Arma arma) {
        this.nombre = nombre;
        this.salud = salud;
        this.arma = arma;
    }

    /**
     * Comportamiento: Ataca a otro combatiente.
     * En lugar de preguntar por el arma y el daño, el combatiente simplemente "le dice"
     * al arma que dispare y al oponente que reciba el daño.
     *
     * @param oponente el combatiente al cual atacar.
     */
    public void atacar(Combatiente oponente) {
        if (this.salud > 0) {
            int danioRealizado = arma.disparar();
            oponente.recibirDanio(danioRealizado);
        }
    }

    /**
     * El método es package-private para que otros Combatientes en el mismo
     * paquete puedan invocarlo durante un ataque.
     */
    void recibirDanio(int puntos) {
        this.salud = Math.max(0, this.salud - puntos);
    }

    /**
     * Comportamiento: Informa si el combatiente ya no puede pelear.
     * Expone estado de forma indirecta a través de una pregunta de negocio.
     */
    public boolean estaFueraDeCombate() {
        return this.salud <= 0;
    }
}
