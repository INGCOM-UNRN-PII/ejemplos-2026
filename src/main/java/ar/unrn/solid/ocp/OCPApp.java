package ar.unrn.solid.ocp;

import java.util.Arrays;

public class OCPApp {
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
