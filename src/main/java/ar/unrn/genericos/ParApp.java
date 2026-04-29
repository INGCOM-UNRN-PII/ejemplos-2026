package ar.unrn.genericos;

public class ParApp {
    public static void main(String[] args) {
        System.out.println("--- Ejemplo Par Clave-Valor ---");
        
        Par<String, Double> precioProducto = new Par<>("Manzana", 1.50);
        System.out.println("Producto: " + precioProducto.obtenerClave());
        System.out.println("Precio: " + precioProducto.obtenerValor());
        System.out.println("Representación: " + precioProducto);
    }
}
