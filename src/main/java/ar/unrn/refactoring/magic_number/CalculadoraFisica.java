package ar.unrn.refactoring.magic_number;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde los numeros magicos se reemplazan por nombres que explican la formula y el dominio.
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
