package ar.unrn.patrones.comportamiento.basico.strategy;

/**
 * Actua como contexto del patron y delega la operacion a la estrategia configurada en cada momento.
 * El paquete usa Strategy para reemplazar condicionales por objetos que encapsulan cada operacion.
 */
public class Calculadora {
    private OperacionStrategy operacion;

    public Calculadora(OperacionStrategy operacion) {
        this.operacion = operacion;
    }

    public void setOperacion(OperacionStrategy operacion) {
        this.operacion = operacion;
    }

    public int resolver(int izquierda, int derecha) {
        return this.operacion.aplicar(izquierda, derecha);
    }
}
