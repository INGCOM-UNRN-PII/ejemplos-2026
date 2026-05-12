package ar.unrn.solid.ocp;

/**
 * Representa una variante concreta del ejemplo y ayuda a ver si la extension del comportamiento exige o no tocar la logica existente.
 * El paquete esta orientado a explicar el principio abierto/cerrado: agregar comportamiento no deberia exigir reescribir la logica existente.
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
