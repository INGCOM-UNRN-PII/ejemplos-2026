package ar.unrn.refactoring.guard_clauses;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde las guard clauses reemplazan anidamientos para dejar visibles las precondiciones del flujo.
 */
public class SistemaPagos {
    /**
     * Calcula el monto de reembolso aplicando condiciones.
     * MÉTODO A REFACTORIZAR: Anidamiento excesivo (Arrow Code) reemplazable por Guard Clauses.
     * 
     * @param esElegible   si el cliente califica para el reembolso.
     * @param estaVencido  si la fecha de solicitud ha expirado.
     * @param monto        el monto original del pago.
     * @return el monto de reembolso calculado.
     */
    public double obtenerMontoReembolso(boolean esElegible, boolean estaVencido, double monto) {
        double resultado;
        if (esElegible) {
            if (!estaVencido) {
                resultado = monto * 0.9;
            } else {
                resultado = 0;
            }
        } else {
            resultado = 0;
        }
        return resultado;
    }
}
