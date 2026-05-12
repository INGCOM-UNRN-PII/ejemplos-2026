package ar.unrn.genericos;

import java.util.Arrays;
import java.util.List;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete practica genericos con contenedores y utilidades pequeñas para mostrar reutilizacion de algoritmos sin casting manual.
 */
public class ComparadorMaximoApp {
    
    /**
     * Punto de entrada de la aplicación.
     * 
     * @param args argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        System.out.println("--- Ejemplo Comparador Máximo (Recursive Type Bound) ---");
        
        List<String> frutas = Arrays.asList("Pera", "Manzana", "Zandía", "Banana");
        String maxFruta = ComparadorMaximo.encontrarMaximo(frutas);
        System.out.println("La fruta máxima (alfabéticamente) es: " + maxFruta);

        List<Integer> numeros = Arrays.asList(4, 8, 15, 16, 23, 42);
        System.out.println("El número máximo es: " + ComparadorMaximo.encontrarMaximo(numeros));
    }
}
