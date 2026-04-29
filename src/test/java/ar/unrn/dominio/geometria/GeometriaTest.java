package ar.unrn.dominio.geometria;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Pruebas de Dominio Geométrico")
class GeometriaTest {

    private static final double DELTA = 1e-9;

    @Test
    @DisplayName("Punto: Operaciones básicas e inmutabilidad")
    void testPunto() {
        Punto p1 = new Punto(1, 1);
        Punto p2 = new Punto(4, 5);

        assertEquals(5.0, p1.calcularDistancia(p2), DELTA);
        assertEquals(3.0, p1.distanciaX(p2), DELTA);
        assertEquals(4.0, p1.distanciaY(p2), DELTA);

        Punto trasladado = p1.trasladar(2, 3);
        assertEquals(new Punto(3, 4), trasladado);
        assertNotSame(p1, trasladado, "La traslación debe retornar una nueva instancia");
    }

    @Test
    @DisplayName("Punto: Colinealidad")
    void testColinealidad() {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(1, 1);
        Punto p3 = new Punto(2, 2);
        Punto p4 = new Punto(1, 0);

        assertTrue(p1.esColinealCon(p2, p3));
        assertFalse(p1.esColinealCon(p2, p4));
    }

    @Test
    @DisplayName("Círculo: Cálculos y validaciones")
    void testCirculo() {
        Punto centro = new Punto(0, 0);
        Punto frontera = new Punto(3, 0); // Radio = 3
        Circulo circulo = new Circulo(centro, frontera);

        assertEquals(Math.PI * 9, circulo.calcularArea(), DELTA);
        assertEquals(2 * Math.PI * 3, circulo.calcularPerimetro(), DELTA);

        assertThrows(IllegalArgumentException.class, () -> new Circulo(centro, centro));
    }

    @Test
    @DisplayName("Rectángulo: Cálculos y proyección")
    void testRectangulo() {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(4, 3);
        Rectangulo rect = new Rectangulo(p1, p2);

        assertEquals(12.0, rect.calcularArea(), DELTA);
        assertEquals(14.0, rect.calcularPerimetro(), DELTA);

        Punto[] vertices = rect.proyectarVertices();
        assertEquals(4, vertices.length);
        assertEquals(new Punto(4, 0), vertices[1]);
        assertEquals(new Punto(0, 3), vertices[3]);

        assertThrows(IllegalArgumentException.class, () -> new Rectangulo(p1, new Punto(4, 0)));
    }

    @Test
    @DisplayName("Triángulo: Cálculos mediante Herón")
    void testTriangulo() {
        Punto t1 = new Punto(0, 0);
        Punto t2 = new Punto(4, 0);
        Punto t3 = new Punto(0, 3);
        Triangulo triangulo = new Triangulo(t1, t2, t3);

        assertEquals(6.0, triangulo.calcularArea(), DELTA);
        assertEquals(12.0, triangulo.calcularPerimetro(), DELTA);

    @Test
    @DisplayName("Punto: Rotación")
    void testRotacionPunto() {
        Punto p = new Punto(1, 0);
        Punto centro = new Punto(0, 0);
        
        // Rotar 90 grados (PI/2)
        Punto rotado = p.rotar(centro, Math.PI / 2);
        
        assertEquals(0.0, rotado.x(), DELTA);
        assertEquals(1.0, rotado.y(), DELTA);
    }

    @Test
    @DisplayName("Figuras: Transformaciones combinadas")
    void testTransformacionesFiguras() {
        Punto centro = new Punto(0, 0);
        Punto frontera = new Punto(2, 0);
        Circulo circulo = new Circulo(centro, frontera);
        
        // Trasladar y luego rotar
        FiguraGeometrica transformado = circulo.trasladar(5, 5).rotar(new Punto(0, 0), Math.PI);
        
        // El nuevo centro debería estar en (-5, -5) tras rotar (5,5) 180 grados sobre el origen
        assertTrue(transformado instanceof Circulo);
    }
}
