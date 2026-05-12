package ar.unrn.dominio.geometria;

/**
 * Modela una figura o valor geometrico concreto y encapsula la formula o transformacion que le corresponde.
 * El paquete modela figuras geometricas simples para concentrar la discusion en calculos de area y responsabilidades de cada tipo.
 */
public final class Triangulo implements FiguraGeometrica {
    private final Punto verticeA;
    private final Punto verticeB;
    private final Punto verticeC;

    public Triangulo(Punto verticeA, Punto verticeB, Punto verticeC) {
        if (verticeA.esColinealCon(verticeB, verticeC)) {
            throw new IllegalArgumentException("Los vértices son colineales o coincidentes, determinando un área degenerada nula.");
        }

        this.verticeA = verticeA;
        this.verticeB = verticeB;
        this.verticeC = verticeC;
    }

    @Override
    public double calcularArea() {
        // Aplicación de la fórmula de Herón derivando el área a partir de las magnitudes euclidianas.
        double a = verticeA.calcularDistancia(verticeB);
        double b = verticeB.calcularDistancia(verticeC);
        double c = verticeC.calcularDistancia(verticeA);
        double semiperimetro = (a + b + c) / 2.0;

        return Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
    }

    @Override
    public double calcularPerimetro() {
        return verticeA.calcularDistancia(verticeB) +
                verticeB.calcularDistancia(verticeC) +
                verticeC.calcularDistancia(verticeA);
    }

    @Override
    public Triangulo trasladar(double dx, double dy) {
        return new Triangulo(
                verticeA.trasladar(dx, dy),
                verticeB.trasladar(dx, dy),
                verticeC.trasladar(dx, dy)
        );
    }

    @Override
    public Triangulo rotar(Punto centro, double anguloRadianes) {
        return new Triangulo(
                verticeA.rotar(centro, anguloRadianes),
                verticeB.rotar(centro, anguloRadianes),
                verticeC.rotar(centro, anguloRadianes)
        );
    }
}
