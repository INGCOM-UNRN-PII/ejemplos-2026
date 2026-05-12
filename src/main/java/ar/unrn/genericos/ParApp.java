package ar.unrn.genericos;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete practica genericos con contenedores y utilidades pequeñas para mostrar reutilizacion de algoritmos sin casting manual.
 */
public class ParApp {
    
    /**
     * Punto de entrada de la aplicación.
     * 
     * @param args argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        System.out.println("--- Ejemplo Par Clave-Valor ---");
        
        Par<String, Double> precioProducto = new Par<>("Manzana", 1.50);
        System.out.println("Producto: " + precioProducto.obtenerClave());
        System.out.println("Precio: " + precioProducto.obtenerValor());
        System.out.println("Representación: " + precioProducto);
    }
}
