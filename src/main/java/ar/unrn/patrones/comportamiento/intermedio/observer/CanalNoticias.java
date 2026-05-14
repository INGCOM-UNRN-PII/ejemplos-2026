package ar.unrn.patrones.comportamiento.intermedio.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa al sujeto observado y administra la lista de observadores interesados en recibir novedades.
 * El paquete usa Observer para desacoplar al emisor de los receptores y permitir altas y bajas dinamicas.
 */
public class CanalNoticias {
    private final String nombre;
    private final List<ObservadorNoticia> observadores;

    public CanalNoticias(String nombre) {
        this.nombre = nombre;
        this.observadores = new ArrayList<>();
    }

    public void suscribir(ObservadorNoticia observador) {
        this.observadores.add(observador);
    }

    public void desuscribir(ObservadorNoticia observador) {
        this.observadores.remove(observador);
    }

    public void publicar(String noticia) {
        System.out.println("[" + this.nombre + "] Nueva noticia: " + noticia);
        for (ObservadorNoticia observador : this.observadores) {
            observador.actualizar(this.nombre, noticia);
        }
    }
}
