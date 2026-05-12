package ar.unrn.solid.ocp;

/**
 * Representa una variante concreta del ejemplo y ayuda a ver si la extension del comportamiento exige o no tocar la logica existente.
 * El paquete esta orientado a explicar el principio abierto/cerrado: agregar comportamiento no deberia exigir reescribir la logica existente.
 */
public class Rectangulo implements Forma {
    private final double ancho;
    private final double alto;

    /**
     * Crea un nuevo rectángulo con las dimensiones especificadas.
     *
     * @param ancho el ancho del rectángulo.
     * @param alto  el alto del rectángulo.
     */
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    /**
     * Calcula el área del rectángulo multiplicando ancho por alto.
     *
     * @return el área del rectángulo.
     */
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
