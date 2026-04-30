package ar.unrn.smells.fragilidad;

public class FragilidadApp {
    public static void main(String[] args) {
        System.out.println("--- Smell: Fragilidad ---");
        try {
            new ModuloA().ejecutar();
            new ModuloB().procesar();
        } catch (Exception e) {
            System.out.println("Fragilidad detectada: " + e.getMessage());
        }
    }
}
