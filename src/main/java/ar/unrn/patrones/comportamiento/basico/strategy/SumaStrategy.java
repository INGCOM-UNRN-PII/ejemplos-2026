package ar.unrn.patrones.comportamiento.basico.strategy;

/**
 * Implementa una de las variantes concretas del algoritmo y resuelve la suma sin que el contexto conozca su formula.
 * El paquete usa Strategy para reemplazar condicionales por objetos que encapsulan cada operacion.
 */
public class SumaStrategy implements OperacionStrategy {
    @Override
    public int aplicar(int izquierda, int derecha) {
        return izquierda + derecha;
    }
}
