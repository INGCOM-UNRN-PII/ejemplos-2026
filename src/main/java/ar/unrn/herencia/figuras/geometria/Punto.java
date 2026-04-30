package ar.unrn.herencia.figuras.geometria;

import java.util.Objects;

/**
 * Representa un punto en el espacio bidimensional (coordenadas x, y).
 * Ejemplifica el concepto de Encapsulamiento y la asignación de responsabilidades.
 * <p>
 * En C, solíamos usar una struct {@code struct Punto { int x; int y; }} y funciones
 * separadas para operar sobre ella. En Java, protegemos los datos (campos privados)
 * y controlamos el acceso, pero además, dotamos al objeto de comportamiento propio
 * (métodos como calcular la distancia o desplazarse), siguiendo los principios de la
 * Programación Orientada a Objetos.
 * </p>
 */
public class Punto {

    /**
     * Coordenada en el eje horizontal.
     * Encapsulada (privada) para evitar modificaciones no controladas.
     */
    private int x;

    /**
     * Coordenada en el eje vertical.
     * Encapsulada (privada) para evitar modificaciones no controladas.
     */
    private int y;

    /**
     * Construye un nuevo {@code Punto} en el espacio bidimensional.
     *
     * @param x posición inicial en el eje horizontal (abscisas).
     * @param y posición inicial en el eje vertical (ordenadas).
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Obtiene el valor actual de la coordenada horizontal (X).
     *
     * @return El valor actual de la coordenada X.
     */
    public int getX() {
        return x;
    }

    /**
     * Establece un nuevo valor para la coordenada horizontal (X).
     *
     * @param x El nuevo valor para la coordenada X.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Obtiene el valor actual de la coordenada vertical (Y).
     *
     * @return El valor actual de la coordenada Y.
     */
    public int getY() {
        return y;
    }

    /**
     * Establece un nuevo valor para la coordenada vertical (Y).
     *
     * @param y El nuevo valor para la coordenada Y.
     */
    public void setY(int y) {
        this.y = y;
    }

    // --- COMPORTAMIENTO PROPIO DEL OBJETO ---

    /**
     * Desplaza este punto en el plano sumando las cantidades especificadas
     * a sus coordenadas actuales.
     *
     * @param deltaX La cantidad a sumar (o restar si es negativa) a la coordenada X.
     * @param deltaY La cantidad a sumar (o restar si es negativa) a la coordenada Y.
     */
    public void desplazar(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    /**
     * Calcula la distancia euclidiana entre este punto y otro punto dado.
     * <p>
     * Utiliza el teorema de Pitágoras: d = sqrt((x2 - x1)^2 + (y2 - y1)^2)
     * </p>
     *
     * @param otro El punto hacia el cual calcular la distancia. No debe ser {@code null}.
     *
     * @return La distancia euclidiana entre los dos puntos.
     */
    public double calcularDistancia(Punto otro) {
        Objects.requireNonNull(otro, "El punto de destino no puede ser nulo");
        int difX = this.x - otro.x;
        int difY = this.y - otro.y;
        return Math.sqrt((difX * difX) + (difY * difY));
    }

    /**
     * Calcula el ángulo en radianes entre el eje X positivo y el vector formado
     * por este punto y otro punto dado.
     * <p>
     * Este punto actúa como el origen (0,0) relativo para el cálculo.
     * El ángulo devuelto está en el rango de -pi a pi.
     * </p>
     *
     * @param otro El punto que define el vector. No debe ser {@code null}.
     *
     * @return El ángulo en radianes entre el eje X positivo y el vector.
     */
    public double calcularAngulo(Punto otro) {
        Objects.requireNonNull(otro, "El punto de destino no puede ser nulo");
        int difX = otro.x - this.x;
        int difY = otro.y - this.y;
        return Math.atan2(difY, difX);
    }

    /**
     * Devuelve una representación en formato de cadena de este punto.
     *
     * @return Una cadena con el formato {@code "(x, y)"}.
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
