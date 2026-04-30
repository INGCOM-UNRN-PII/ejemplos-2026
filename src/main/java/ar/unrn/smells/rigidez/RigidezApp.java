package ar.unrn.smells.rigidez;

/**
 * Aplicación de demostración para el olor de diseño: Rigidez.
 */
public class RigidezApp {
    /**
     * Punto de entrada de la aplicación.
     * 
     * @param args argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        System.out.println("--- Smell: Rigidez ---");
        new GeneradorReporte().exportar("datos", "PDF");
        new SistemaCaja().cobrar();
    }
}
