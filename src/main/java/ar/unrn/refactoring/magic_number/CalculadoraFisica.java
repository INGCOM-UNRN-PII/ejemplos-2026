package ar.unrn.refactoring.magic_number;

public class CalculadoraFisica {
    public double calcularEnergiaPotencial(double masa, double altura) {
        // MÉTODO A REFACTORIZAR: 9.81 es la gravedad
        return masa * 9.81 * altura;
    }
}
