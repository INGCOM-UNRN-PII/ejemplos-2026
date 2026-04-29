package ar.unrn.genericos;

public class CajaApp {
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
