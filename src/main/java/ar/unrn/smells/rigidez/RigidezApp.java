package ar.unrn.smells.rigidez;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete muestra rigidez, donde una modificacion puntual obliga a tocar muchas clases relacionadas para mantener todo funcionando.
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
