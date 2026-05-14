package ar.unrn.patrones.comportamiento.basico.strategy;

/**
 * Implementa una de las variantes concretas del algoritmo y resuelve la multiplicacion sin acoplarla al contexto.
 * El paquete usa Strategy para reemplazar condicionales por objetos que encapsulan cada operacion.
 */
public class MultiplicacionStrategy implements OperacionStrategy {
    @Override
    public int aplicar(int izquierda, int derecha) {
        return izquierda * derecha;
    }
}
