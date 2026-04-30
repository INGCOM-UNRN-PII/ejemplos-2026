package ar.unrn.codesmells.dispensables;

/**
 * Dispensables: Comments, Duplicate Code, Data Class, Dead Code, Lazy Class, Speculative Generality.
 */
public class Dispensables {

    // 1. Comments (explicando lo obvio)
    public void incrementar(int i) {
        // Incrementa i en uno
        i = i + 1;
    }

    // 2. Dead Code (método que nadie usa)
    private void esteMetodoNoSeUsaNunca() {
    }

    // 3. Speculative Generality
    public interface ProcesableJustInCase {
        void procesarEnElFuturoSiEsNecesario();
    }
}

// 4. Data Class
class UsuarioDatos {
    public String nombre;
    public String email;
}

// 5. Duplicate Code
class ServicioA {
    void procesar() {
        System.out.println("Validando...");
        System.out.println("Procesando...");
    }
}

class ServicioB {
    void procesar() {
        System.out.println("Validando..."); // Duplicado
        System.out.println("Ejecutando...");
    }
}
