package ar.unrn.genericos;

public class ContenedorNumericoApp {
    public static void main(String[] args) {
        System.out.println("--- Ejemplo Contenedor Numérico (Bounded) ---");

        ContenedorNumerico<Integer> entero = new ContenedorNumerico<>(50);
        ContenedorNumerico<Double> decimal = new ContenedorNumerico<>(45.5);

        System.out.println("Valor entero como double: " + entero.obtenerValorDoble());
        System.out.println("¿50 es mayor que 45.5? " + entero.esMayorQue(decimal));
    }
}
