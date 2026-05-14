package ar.unrn.refactoring.patrones_diseno.basico.estructurales.facade;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde el alta de clientes requiere coordinar muchos servicios desde la interfaz.
 */
public class AltaClienteApp {
    private final ValidadorClientes validador = new ValidadorClientes();
    private final RepositorioClientes repositorio = new RepositorioClientes();
    private final ServicioBienvenida bienvenida = new ServicioBienvenida();

    public void registrar(String nombre, String email) {
        validador.validar(nombre, email);
        repositorio.guardar(nombre, email);
        bienvenida.enviar(nombre, email);
    }
}

class ValidadorClientes {
    public void validar(String nombre, String email) {
        if (nombre.isBlank() || email.isBlank()) {
            throw new IllegalArgumentException("Datos invalidos");
        }
    }
}

class RepositorioClientes {
    public void guardar(String nombre, String email) {
        System.out.println("Guardando " + nombre + " - " + email);
    }
}

class ServicioBienvenida {
    public void enviar(String nombre, String email) {
        System.out.println("Bienvenida a " + nombre + " en " + email);
    }
}
