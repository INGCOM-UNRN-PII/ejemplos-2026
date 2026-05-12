package ar.unrn.basicos.contador;

/**
 * Orquesta la ejecucion del ejemplo y expone por consola el comportamiento que el paquete quiere discutir.
 * El paquete introduce un objeto con estado minimo para mostrar como los mensajes de negocio alteran y consultan ese estado a lo largo del tiempo.
 */
public class ContadorApp {

    /**
     * Punto de entrada de la aplicación.
     */
    static void main() {
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
