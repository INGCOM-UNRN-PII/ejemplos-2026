package ar.unrn.patrones.comportamiento.intermedio.observer;

/**
 * Define el contrato de los participantes que reaccionan cuando el canal publica una novedad.
 * El paquete usa Observer para desacoplar al emisor de los receptores y permitir altas y bajas dinamicas.
 */
public interface ObservadorNoticia {
    /**
     * Recibe una noticia publicada por el canal observado.
     *
     * @param canal nombre del canal que emite.
     * @param noticia mensaje publicado.
     */
    void actualizar(String canal, String noticia);
}
