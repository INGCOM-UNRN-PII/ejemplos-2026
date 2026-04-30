package ar.unrn.refactoring.guard_clauses;

public class SistemaPagos {
    public double obtenerMontoReembolso(boolean esElegible, boolean estaVencido, double monto) {
        double resultado;
        // MÉTODO A REFACTORIZAR: Anidamiento excesivo (Arrow Code)
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
