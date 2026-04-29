package ar.unrn.dominio.geometria;

public interface FiguraGeometrica {
    double calcularArea();
    double calcularPerimetro();
    FiguraGeometrica trasladar(double dx, double dy);
    FiguraGeometrica rotar(Punto centro, double anguloRadianes);
}
