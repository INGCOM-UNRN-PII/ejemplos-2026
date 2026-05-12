package ar.unrn.genericos;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete practica genericos con contenedores y utilidades pequeñas para mostrar reutilizacion de algoritmos sin casting manual.
 */
public class ContenedorNumericoApp {

    /**
     * Punto de entrada de la aplicación.
     *
     * @param args argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        System.out.println("--- Ejemplo Contenedor Numérico (Bounded) ---");

        ContenedorNumerico<Integer> entero = new ContenedorNumerico<>(50);
        ContenedorNumerico<Double> decimal = new ContenedorNumerico<>(45.5);

        System.out.println("Valor entero como double: " + entero.obtenerValorDoble());
        System.out.println("¿50 es mayor que 45.5? " + entero.esMayorQue(decimal));
    }
}
