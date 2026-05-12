package ar.unrn.generados.util.matematica;

/**
 * Agrupa operaciones matematicas sencillas para que otras clases reutilicen calculos sin duplicar formulas.
 * El paquete extrae operaciones matematicas simples a una utilidad reusable para que el ejemplo muestre encapsulamiento de funciones comunes.
 */
public class Matematica {

    /**
     * Calcula el factorial de un número entero no negativo.
     *
     * @param n número del cual calcular el factorial.
     *
     * @return factorial de n.
     * @throws IllegalArgumentException si n es negativo.
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo: " + n);
        }
        if (n <= 1) {
            return 1;
        }
        long resultado = 1;
        for (int i = 2; i <= n; i = i + 1) {
            resultado = resultado * i;
        }
        return resultado;
    }

    /**
     * Determina si un número es par.
     */
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }
}
