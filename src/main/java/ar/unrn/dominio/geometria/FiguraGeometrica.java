package ar.unrn.dominio.geometria;

/**
 * Define el comportamiento comun que cualquier figura del paquete debe ofrecer para responder preguntas geometricas sin exponer su formula interna.
 * El paquete modela figuras geometricas simples para concentrar la discusion en calculos de area y responsabilidades de cada tipo.
 */
public interface FiguraGeometrica {
    double calcularArea();

    double calcularPerimetro();

    FiguraGeometrica trasladar(double dx, double dy);

    FiguraGeometrica rotar(Punto centro, double anguloRadianes);
}
