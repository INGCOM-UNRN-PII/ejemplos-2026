package ar.unrn.refactoring.magic_number;

/**
 * Clase que realiza cálculos físicos.
 * Ejemplo para refactorizar Magic Numbers a constantes simbólicas.
 */
public class CalculadoraFisica {
    /**
     * Calcula la energía potencial gravitatoria.
     * 
     * @param masa   la masa del objeto en kg.
     * @param altura la altura en metros.
     * @return la energía potencial en Joules.
     */
    public double calcularEnergiaPotencial(double masa, double altura) {
        // MÉTODO A REFACTORIZAR: 9.81 es la gravedad constante.
        return masa * 9.81 * altura;
    }
}
