package ar.unrn.dominio.geometria;

import java.util.Objects;

/**
 * Vector de posición inmutable implementado como clase final (Value Object).
 * Mantiene encapsulamiento estricto mediante inmutabilidad y atributos privados.
 */
public final class Punto {
    private final double x;
    private final double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public Punto trasladar(double dx, double dy) {
        return new Punto(this.x + dx, this.y + dy);
    }

    /**
     * Rota el punto respecto a un centro dado un ángulo en radianes.
     * Utiliza la matriz de rotación estándar:
     * x' = (x-cx)cosθ - (y-cy)sinθ + cx
     * y' = (x-cx)sinθ + (y-cy)cosθ + cy
     */
    public Punto rotar(Punto centro, double anguloRadianes) {
        double cos = Math.cos(anguloRadianes);
        double sin = Math.sin(anguloRadianes);
        double dx = this.x - centro.x();
        double dy = this.y - centro.y();

        double newX = dx * cos - dy * sin + centro.x();
        double newY = dx * sin + dy * cos + centro.y();

        return new Punto(newX, newY);
    }

    /**
     * Calcula la distancia euclidiana empleando la norma euclidiana optimizada.
     */
    public double calcularDistancia(Punto otro) {
        return Math.hypot(otro.x() - this.x, otro.y() - this.y);
    }

    /**
     * Retorna el azimut del vector en radianes [-pi, pi].
     */
    public double calcularAngulo(Punto otro) {
        return Math.atan2(otro.y() - this.y, otro.x() - this.x);
    }

    /**
     * Proyección escalar de la magnitud vectorial sobre el eje de abscisas.
     */
    public double distanciaX(Punto otro) {
        return Math.abs(otro.x() - this.x);
    }

    /**
     * Proyección escalar de la magnitud vectorial sobre el eje de ordenadas.
     */
    public double distanciaY(Punto otro) {
        return Math.abs(otro.y() - this.y);
    }

    /**
     * Evalúa si este punto es colineal con otros dos puntos dados,
     * calculando el determinante del producto vectorial.
     */
    public boolean esColinealCon(Punto p1, Punto p2) {
        double determinante = (p1.x - this.x) * (p2.y - this.y) - (p1.y - this.y) * (p2.x - this.x);
        return Math.abs(determinante) < 1e-9;
    }

    /**
     * Retorna un nuevo punto preservando la coordenada Y de la instancia actual
     * y adoptando la coordenada X del punto provisto.
     */
    public Punto alinearXCon(Punto otro) {
        return new Punto(otro.x, this.y);
    }

    /**
     * Retorna un nuevo punto preservando la coordenada X de la instancia actual
     * y adoptando la coordenada Y del punto provisto.
     */
    public Punto alinearYCon(Punto otro) {
        return new Punto(this.x, otro.y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Punto punto = (Punto) o;
        return Double.compare(punto.x, x) == 0 && Double.compare(punto.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return String.format("Punto[x=%.2f, y=%.2f]", x, y);
    }
}
