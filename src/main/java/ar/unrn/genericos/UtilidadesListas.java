package ar.unrn.genericos;

import java.util.List;

/**
 * Ejemplo de métodos genéricos y uso de comodines (wildcards).
 */
public class UtilidadesListas {

    /**
     * Método genérico que imprime cualquier lista.
     * @param lista la lista a imprimir.
     */
    public static void imprimirLista(List<?> lista) {
        for (Object elemento : lista) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    /**
     * Upper Bounded Wildcard: Acepta una lista de T o cualquier subclase de T.
     * @param lista lista de números.
     * @return la suma de los elementos como double.
     */
    public static double sumar(List<? extends Number> lista) {
        double suma = 0.0;
        for (Number n : lista) {
            suma += n.doubleValue();
        }
        return suma;
    }

    /**
     * Lower Bounded Wildcard: Acepta una lista de T o cualquier superclase de T.
     * Útil para "consumir" elementos y agregarlos a una lista.
     * @param lista lista donde se agregarán los números.
     */
    public static void agregarNumeros(List<? super Integer> lista) {
        for (int i = 1; i <= 5; i++) {
            lista.add(i);
        }
    }
}
