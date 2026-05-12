package ar.unrn.dominio.geometria;

/**
 * Modela una figura o valor geometrico concreto y encapsula la formula o transformacion que le corresponde.
 * El paquete modela figuras geometricas simples para concentrar la discusion en calculos de area y responsabilidades de cada tipo.
 */
public final class Rectangulo implements FiguraGeometrica {
    private final Punto verticeInferior;
    private final Punto verticeOpuesto;

    public Rectangulo(Punto verticeInferior, Punto verticeOpuesto) {
        if (verticeInferior.distanciaX(verticeOpuesto) == 0 || verticeInferior.distanciaY(verticeOpuesto) == 0) {
            throw new IllegalArgumentException("Los vértices opuestos son ortogonalmente colineales, determinando un área degenerada.");
        }
        this.verticeInferior = verticeInferior;
        this.verticeOpuesto = verticeOpuesto;
    }

    @Override
    public double calcularArea() {
        return verticeInferior.distanciaX(verticeOpuesto) * verticeInferior.distanciaY(verticeOpuesto);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (verticeInferior.distanciaX(verticeOpuesto) + verticeInferior.distanciaY(verticeOpuesto));
    }

    @Override
    public Rectangulo trasladar(double dx, double dy) {
        return new Rectangulo(
                verticeInferior.trasladar(dx, dy),
                verticeOpuesto.trasladar(dx, dy)
        );
    }

    /**
     * Rota la diagonal del rectángulo. El resultado es un nuevo AABB
     * definido por los nuevos extremos de la diagonal rotada.
     * Nota: Si el ángulo no es múltiplo de π/2, las dimensiones pueden variar.
     */
    @Override
    public Rectangulo rotar(Punto centro, double anguloRadianes) {
        return new Rectangulo(
                verticeInferior.rotar(centro, anguloRadianes),
                verticeOpuesto.rotar(centro, anguloRadianes)
        );
    }

    /**
     * Proyecta el polígono resolviendo los vértices ortogonales adyacentes
     * delegando la recombinación espacial a la entidad Punto.
     */
    public Punto[] proyectarVertices() {
        Punto verticeAdyacenteX = verticeInferior.alinearXCon(verticeOpuesto);
        Punto verticeAdyacenteY = verticeInferior.alinearYCon(verticeOpuesto);

        return new Punto[]{verticeInferior, verticeAdyacenteX, verticeOpuesto, verticeAdyacenteY};
    }
}
