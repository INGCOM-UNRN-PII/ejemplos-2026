package ar.unrn.refactoring.polimorfismo;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde condicionales por tipo se reemplazan por polimorfismo para repartir mejor la variacion.
 */
public class CalculadoraSueldo {
    
    /**
     * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
     * El paquete concentra un ejercicio donde condicionales por tipo se reemplazan por polimorfismo para repartir mejor la variacion.
     */
    enum Tipo { INGENIERO, VENDEDOR, GERENTE }

    /**
     * Calcula el sueldo de un empleado basado en su tipo y valores base.
     * MÉTODO A REFACTORIZAR: Uso de condicionales sobre tipo.
     * 
     * @param tipo  el tipo de empleado.
     * @param base  el sueldo base.
     * @param bonos el monto de bonos adicionales.
     * @return el sueldo total calculado.
     * @throws RuntimeException si el tipo de empleado no es soportado.
     */
    public double calcularSueldo(Tipo tipo, double base, double bonos) {
        switch (tipo) {
            case INGENIERO:
                return base;
            case VENDEDOR:
                return base + (bonos * 0.1);
            case GERENTE:
                return base + bonos;
            default:
                throw new RuntimeException("Tipo no soportado");
        }
    }
}
