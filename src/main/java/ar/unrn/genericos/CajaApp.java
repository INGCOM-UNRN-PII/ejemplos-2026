package ar.unrn.genericos;

/**
 * Aplicación de demostración para el uso de la clase genérica Caja.
 * Muestra cómo instanciar la clase con diferentes tipos de datos.
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
