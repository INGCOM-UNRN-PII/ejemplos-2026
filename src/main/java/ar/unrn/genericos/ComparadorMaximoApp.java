package ar.unrn.genericos;

import java.util.Arrays;
import java.util.List;

public class ComparadorMaximoApp {
    public static void main(String[] args) {
        System.out.println("--- Ejemplo Comparador Máximo (Recursive Type Bound) ---");

        List<String> frutas = Arrays.asList("Pera", "Manzana", "Zandía", "Banana");
        String maxFruta = ComparadorMaximo.encontrarMaximo(frutas);
        System.out.println("La fruta máxima (alfabéticamente) es: " + maxFruta);

        List<Integer> numeros = Arrays.asList(4, 8, 15, 16, 23, 42);
        System.out.println("El número máximo es: " + ComparadorMaximo.encontrarMaximo(numeros));
    }
}
