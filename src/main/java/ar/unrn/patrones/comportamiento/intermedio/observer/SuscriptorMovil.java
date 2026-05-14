package ar.unrn.patrones.comportamiento.intermedio.observer;

/**
 * Modela un receptor concreto que transforma la noticia en una notificacion para la app movil.
 * El paquete usa Observer para desacoplar al emisor de los receptores y permitir altas y bajas dinamicas.
 */
public class SuscriptorMovil implements ObservadorNoticia {
    private final String usuario;

    public SuscriptorMovil(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void actualizar(String canal, String noticia) {
        System.out.println("  Push para " + this.usuario + ": " + canal + " -> " + noticia);
    }
}
