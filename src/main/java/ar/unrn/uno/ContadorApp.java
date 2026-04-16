package ar.unrn.uno;

/**
 * Aplicación de consola para demostrar el uso de la clase Contador y el impacto
 * del encapsulamiento.
 */
public class ContadorApp {

    /**
     * Punto de entrada de la aplicación.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        Contador i = new Contador(10);

        // Ejemplo de modificación manual rompiendo la lógica del dominio
        i.setPosicion(i.getPosicion() + 9); // reventando el encapsulamiento
        System.out.println("Estado inicial: " + i);

        try {
            // Esto fallará porque la posición (9) + incremento (9) supera el tope (10)
            System.out.println("Intentando incrementar en 9...");
            System.out.println(i.incrementar(9));
        } catch (IllegalArgumentException e) {
            System.err.println("Error esperado: " + e.getMessage());
        }

        System.out.println("Estado final: " + i);
    }
}
