package ar.unrn.solid.ocp;

/**
 * Implementación de Forma para un Círculo.
 */
public class Circulo implements Forma {
    private final double radio;

    /**
     * Crea un nuevo círculo con el radio especificado.
     * 
     * @param radio el radio del círculo.
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * Calcula el área del círculo utilizando PI * radio^2.
     * 
     * @return el área del círculo.
     */
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
