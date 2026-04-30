package ar.unrn.solid.ocp;

/**
 * Interfaz que define el contrato para cualquier figura geométrica.
 * Ejemplo de cumplimiento del Open/Closed Principle (OCP).
 */
public interface Forma {
    /**
     * Calcula el área de la forma.
     * 
     * @return el área calculada.
     */
    double calcularArea();
}
