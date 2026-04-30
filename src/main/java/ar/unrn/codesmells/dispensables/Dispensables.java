package ar.unrn.codesmells.dispensables;

/**
 * Clase que agrupa ejemplos de Code Smells de tipo "Dispensables".
 */
public class Dispensables {

    /**
     * Incrementa un valor entero.
     * @param i el valor a incrementar.
     */
    public void incrementar(int i) {
        // Incrementa i en uno (Comentario redundante)
        i = i + 1;
    }

    /** Código muerto: método que nunca se invoca. */
    private void esteMetodoNoSeUsaNunca() {}

    /** Ejemplo de generalidad especulativa. */
    public interface ProcesableJustInCase {
        /** Método creado "por si acaso". */
        void procesarEnElFuturoSiEsNecesario();
    }
}

/** Clase de datos sin comportamiento (Data Class). */
class UsuarioDatos {
    /** Nombre del usuario. */
    public String nombre;
    /** Correo electrónico del usuario. */
    public String email;
}

/** Servicio con código duplicado. */
class ServicioA {
    /** Realiza el procesamiento. */
    void procesar() {
        System.out.println("Validando...");
        System.out.println("Procesando...");
    }
}
/** Otro servicio con código duplicado. */
class ServicioB {
    /** Realiza el procesamiento con lógica duplicada. */
    void procesar() {
        System.out.println("Validando..."); // Duplicado
        System.out.println("Ejecutando...");
    }
}
