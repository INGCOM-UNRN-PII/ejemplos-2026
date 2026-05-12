package ar.unrn.herencia.figuras.geometria;

import ar.unrn.equals.correcto.persona.Empleado;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete usa una jerarquia geometrica minima para discutir que se hereda, que se agrega y cuando conviene especializar comportamiento.
 */
public class PuntoApp {

    public static void main(String[] args) {
        System.out.println("--- Demostración de Comportamiento y Encapsulamiento con Punto ---\n");
        ar.unrn.equals.correcto.persona.Empleado e = new Empleado("pepe", 40, "LG3333");
        ar.unrn.equals.identidad.simetria.Empleado e2;
        Punto p1 = new Punto(10, 20);

        System.out.println("1. Creamos un punto inicial:");
        System.out.println("   Punto 1 (p1): " + p1);

        System.out.println("\n2. Demostrando el comportamiento de la clase (Delegación de responsabilidad):");

        // --- LA FORMA INCORRECTA (A lo "C") ---
        // Si hiciéramos la lógica matemática fuera de la clase (pidiendo los datos),
        // romperíamos el encapsulamiento de comportamiento.
        // int nuevoX = p1.getX() + 5;
        // int nuevoY = p1.getY() - 10;
        // p1.setX(nuevoX);
        // p1.setY(nuevoY);

        // --- LA FORMA CORRECTA (Orientada a Objetos) ---
        // Le pedimos al objeto que se modifique a sí mismo. Él sabe cómo hacerlo.
        System.out.println("   Le decimos a 'p1' que se desplace (deltaX=5, deltaY=-10)...");
        p1.desplazar(5, -10);

        System.out.println("   Estado de p1 tras desplazarse: " + p1);


        System.out.println("\n3. Calculando distancias y ángulos entre objetos:");
        Punto p2 = new Punto(18, 14); // Vamos a crear un segundo punto para medir

        System.out.println("   Creamos un segundo punto (p2): " + p2);

        // Nuevamente, le delegamos la responsabilidad matemática a la clase Punto.
        // "Oye p1, ¿cuál es tu distancia hasta p2?"
        double distancia = p1.calcularDistancia(p2);

        // "Oye p1, ¿en qué ángulo (en grados) se encuentra p2 respecto a ti?"
        double anguloRadianes = p1.calcularAngulo(p2);
        double anguloGrados = Math.toDegrees(anguloRadianes);

        System.out.println(String.format("   La distancia entre p1 y p2 es: %.2f", distancia));
        System.out.println(String.format("   El ángulo de p1 hacia p2 es: %.2f radianes (%.2f grados)", anguloRadianes, anguloGrados));


        System.out.println("\n--------------------------------------------------");
        System.out.println("Conclusión:");
        System.out.println("En POO no solo agrupamos datos (como en las struct de C), sino");
        System.out.println("también las operaciones asociadas a esos datos. El objeto es un ente");
        System.out.println("activo al que le enviamos mensajes ('desplazate', 'calcula tu distancia')");
        System.out.println("en lugar de usarlo como un mero contenedor de variables.");
    }
}
