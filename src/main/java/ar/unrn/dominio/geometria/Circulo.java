package ar.unrn.dominio.geometria;

/**
 * Círculo definido estrictamente por dos puntos.
 * El radio se deriva dinámicamente delegando en el comportamiento topológico del Punto.
 */
public final class Circulo implements FiguraGeometrica {
    private final Punto centro;
    private final Punto puntoFrontera;

    public Circulo(Punto centro, Punto puntoFrontera) {
        if (centro.calcularDistancia(puntoFrontera) == 0) {
            throw new IllegalArgumentException("El punto frontera debe diferir del centro para establecer un radio no nulo.");
        }
        this.centro = centro;
        this.puntoFrontera = puntoFrontera;
    }

    private double calcularRadio() {
        return centro.calcularDistancia(puntoFrontera);
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(calcularRadio(), 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * calcularRadio();
    }

    @Override
    public Circulo trasladar(double dx, double dy) {
        return new Circulo(centro.trasladar(dx, dy), puntoFrontera.trasladar(dx, dy));
    }
}
