package ar.unrn.genericos;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete practica genericos con contenedores y utilidades pequeñas para mostrar reutilizacion de algoritmos sin casting manual.
 */
public class CajaApp {

    /**
     * Punto de entrada de la aplicación.
     *
     * @param args argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        System.out.println("--- Ejemplo Caja Genérica ---");

        Caja<String> cajaDeTexto = new Caja<>();
        cajaDeTexto.poner("Mensaje en la caja");
        System.out.println("Contenido: " + cajaDeTexto.obtener());

        Caja<Integer> cajaDeEnteros = new Caja<>();
        cajaDeEnteros.poner(100);
        System.out.println("Contenido entero: " + cajaDeEnteros.obtener());
    }
}
