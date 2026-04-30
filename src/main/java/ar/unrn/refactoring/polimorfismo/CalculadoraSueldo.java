package ar.unrn.refactoring.polimorfismo;

public class CalculadoraSueldo {

    enum Tipo {INGENIERO, VENDEDOR, GERENTE}

    public double calcularSueldo(Tipo tipo, double base, double bonos) {
        // MÉTODO A REFACTORIZAR: Uso de condicionales sobre tipo
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
