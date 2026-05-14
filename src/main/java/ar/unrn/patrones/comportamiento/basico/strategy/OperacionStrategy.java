package ar.unrn.patrones.comportamiento.basico.strategy;

/**
 * Define el contrato comun de los algoritmos que la calculadora puede intercambiar en tiempo de ejecucion.
 * El paquete usa Strategy para reemplazar condicionales por objetos que encapsulan cada operacion.
 */
public interface OperacionStrategy {
    /**
     * Ejecuta la operacion elegida sobre dos operandos.
     *
     * @param izquierda primer operando.
     * @param derecha segundo operando.
     * @return resultado de aplicar la estrategia.
     */
    int aplicar(int izquierda, int derecha);
}
