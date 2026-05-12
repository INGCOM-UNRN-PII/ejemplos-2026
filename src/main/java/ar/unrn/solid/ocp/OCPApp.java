package ar.unrn.solid.ocp;

import java.util.Arrays;

/**
 * Aplicación de demostración para el Principio Abierto/Cerrado (OCP).
 * Muestra cómo se pueden agregar nuevas formas sin modificar el GeneradorArea.
 */
public class OCPApp {
    /**
     * Punto de entrada de la aplicación.
     *
     * @param args argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        System.out.println("--- OCP: Open/Closed Principle ---");
        GeneradorArea generador = new GeneradorArea();

        double total = generador.calcularAreaTotal(Arrays.asList(
                new Rectangulo(10, 5),
                new Circulo(3)
        ));

        System.out.println("Área total: " + total);
    }
}
