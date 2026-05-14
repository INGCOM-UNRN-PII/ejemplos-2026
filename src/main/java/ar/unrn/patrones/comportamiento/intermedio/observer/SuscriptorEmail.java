package ar.unrn.patrones.comportamiento.intermedio.observer;

/**
 * Modela un receptor concreto que adapta la noticia al formato de correo electronico.
 * El paquete usa Observer para desacoplar al emisor de los receptores y permitir altas y bajas dinamicas.
 */
public class SuscriptorEmail implements ObservadorNoticia {
    private final String direccion;

    public SuscriptorEmail(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void actualizar(String canal, String noticia) {
        System.out.println("  Email a " + this.direccion + ": " + canal + " -> " + noticia);
    }
}
