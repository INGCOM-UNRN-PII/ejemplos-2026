package ar.unrn.codesmells.dispensables;

/**
 * Representa una pieza del ejemplo de elementos dispensables y ayuda a distinguir lo esencial del ruido accidental.
 * El paquete reúne ejemplos de elementos dispensables, es decir, codigo que sobra, distrae o es mas facil de entender si se elimina o simplifica.
 */
public class Dispensables {

    /**
     * Incrementa un valor entero.
     *
     * @param i el valor a incrementar.
     */
    public void incrementar(int i) {
        // Incrementa i en uno (Comentario redundante)
        i = i + 1;
    }

    /**
     * Código muerto: método que nunca se invoca.
     */
    private void esteMetodoNoSeUsaNunca() {
    }

    /**
     * Representa una pieza del ejemplo de elementos dispensables y ayuda a distinguir lo esencial del ruido accidental.
     * El paquete reúne ejemplos de elementos dispensables, es decir, codigo que sobra, distrae o es mas facil de entender si se elimina o simplifica.
     */
    public interface ProcesableJustInCase {
        /**
         * Método creado "por si acaso".
         */
        void procesarEnElFuturoSiEsNecesario();
    }
}

/**
 * Representa una pieza del ejemplo de elementos dispensables y ayuda a distinguir lo esencial del ruido accidental.
 * El paquete reúne ejemplos de elementos dispensables, es decir, codigo que sobra, distrae o es mas facil de entender si se elimina o simplifica.
 */
class UsuarioDatos {
    /**
     * Nombre del usuario.
     */
    public String nombre;
    /**
     * Correo electrónico del usuario.
     */
    public String email;
}

/**
 * Representa una pieza del ejemplo de elementos dispensables y ayuda a distinguir lo esencial del ruido accidental.
 * El paquete reúne ejemplos de elementos dispensables, es decir, codigo que sobra, distrae o es mas facil de entender si se elimina o simplifica.
 */
class ServicioA {
    /**
     * Realiza el procesamiento.
     */
    void procesar() {
        System.out.println("Validando...");
        System.out.println("Procesando...");
    }
}

/**
 * Representa una pieza del ejemplo de elementos dispensables y ayuda a distinguir lo esencial del ruido accidental.
 * El paquete reúne ejemplos de elementos dispensables, es decir, codigo que sobra, distrae o es mas facil de entender si se elimina o simplifica.
 */
class ServicioB {
    /**
     * Realiza el procesamiento con lógica duplicada.
     */
    void procesar() {
        System.out.println("Validando..."); // Duplicado
        System.out.println("Ejecutando...");
    }
}
