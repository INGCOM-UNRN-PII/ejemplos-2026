package ar.unrn.genericos;

/**
 * Aplicación de demostración para el uso de la clase genérica Par.
 * Muestra el uso de múltiples parámetros de tipo en una clase.
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
