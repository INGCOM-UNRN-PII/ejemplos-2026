package ar.unrn.patrones.comportamiento.intermedio.observer;

/**
 * Orquesta la ejecucion del ejemplo y muestra como los observadores se suman o se quitan sin alterar al emisor.
 * El paquete usa Observer para desacoplar al emisor de los receptores y permitir altas y bajas dinamicas.
 */
public class MainObserver {
    public static void main(String[] args) {
        CanalNoticias canal = new CanalNoticias("Patrones UNRN");
        ObservadorNoticia ana = new SuscriptorEmail("ana@unrn.edu.ar");
        ObservadorNoticia bruno = new SuscriptorMovil("bruno");

        System.out.println("--- Nivel intermedio: Observer ---");
        canal.suscribir(ana);
        canal.suscribir(bruno);
        canal.publicar("Se publicó la guía de Observer.");

        System.out.println("\nBruno desactiva las notificaciones.\n");
        canal.desuscribir(bruno);
        canal.publicar("Hay un nuevo ejercicio resuelto.");
    }
}
