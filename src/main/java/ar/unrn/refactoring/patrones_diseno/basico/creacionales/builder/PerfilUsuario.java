package ar.unrn.refactoring.patrones_diseno.basico.creacionales.builder;

/**
 * Representa el codigo base del ejercicio y sirve como material sobre el que se razona el refactoring propuesto por el paquete.
 * El paquete concentra un ejercicio donde un objeto se arma con muchos datos opcionales y la creacion resulta dificil de leer.
 */
public class PerfilUsuario {
    private final String nombre;
    private final String email;
    private final String telefono;
    private final String direccion;
    private final boolean notificaciones;

    public PerfilUsuario(String nombre, String email, String telefono, String direccion, boolean notificaciones) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.notificaciones = notificaciones;
    }

    public String resumen() {
        return nombre + " - " + email + " - " + telefono + " - " + direccion + " - " + notificaciones;
    }
}
