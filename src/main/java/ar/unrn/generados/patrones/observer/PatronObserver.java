package ar.unrn.generados.patrones.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación del Patrón de Diseño: Observador (Observer).
 * <p>
 * Este patrón define una dependencia de uno-a-muchos entre objetos, de forma
 * que cuando un objeto (el Sujeto) cambia su estado, todos sus dependientes
 * (los Observadores) son notificados y actualizados automáticamente.
 * <p>
 * Es fundamental para desacoplar componentes: el Sujeto no necesita saber
 * exactamente quién lo observa, solo que implementan la interfaz 'Observador'.
 */

// 1. Interfaz que deben implementar todos los observadores.
/**
 * Define el contrato minimo que las implementaciones del paquete deben cumplir para colaborar sin depender de detalles concretos.
 * El paquete implementa Observer con fines didacticos para hacer visible como un sujeto desacoplado distribuye cambios a varios observadores.
 */
interface Observador {
    void actualizar(String mensaje);
}

// 2. Interfaz para el sujeto observable (Sujeto).
/**
 * Define el contrato minimo que las implementaciones del paquete deben cumplir para colaborar sin depender de detalles concretos.
 * El paquete implementa Observer con fines didacticos para hacer visible como un sujeto desacoplado distribuye cambios a varios observadores.
 */
interface Observable {
    void agregarObservador(Observador o);

    void quitarObservador(Observador o);

    void notificar();
}

/**
 * Representa un participante concreto del patron Observer dentro de la demostracion del paquete.
 * El paquete implementa Observer con fines didacticos para hacer visible como un sujeto desacoplado distribuye cambios a varios observadores.
 */
class CanalNoticias implements Observable {
    private List<Observador> suscriptores = new ArrayList<>();
    private String ultimaNoticia;

    public void publicarNoticia(String noticia) {
        this.ultimaNoticia = noticia;
        System.out.println("Canal publica: " + noticia);
        notificar();
    }

    @Override
    public void agregarObservador(Observador o) {
        suscriptores.add(o);
    }

    @Override
    public void quitarObservador(Observador o) {
        suscriptores.remove(o);
    }

    @Override
    public void notificar() {
        for (Observador o : suscriptores) {
            o.actualizar(ultimaNoticia);
        }
    }
}

/**
 * Representa un participante concreto del patron Observer dentro de la demostracion del paquete.
 * El paquete implementa Observer con fines didacticos para hacer visible como un sujeto desacoplado distribuye cambios a varios observadores.
 */
class AppMovil implements Observador {
    @Override
    public void actualizar(String mensaje) {
        System.out.println("[App Móvil] Notificación recibida: " + mensaje);
    }
}

/**
 * Representa un observador concreto pensado para espacios compartidos, donde el mismo evento debe mostrarse con otra forma de presentacion.
 * El paquete implementa Observer con fines didacticos para hacer visible como un sujeto desacoplado distribuye cambios a varios observadores.
 */
class PantallaPublica implements Observador {
    @Override
    public void actualizar(String mensaje) {
        System.out.println("[Pantalla Pública] Mostrando noticia: " + mensaje);
    }
}

/**
 * Ejecuta la demostracion del patron Observer y hace visible en consola la propagacion de cambios desde un sujeto a varios observadores.
 * El paquete implementa Observer con fines didacticos para hacer visible como un sujeto desacoplado distribuye cambios a varios observadores.
 */
public class PatronObserver {

    public static void main(String[] args) {
        System.out.println("--- Demostración del Patrón Observer ---");

        CanalNoticias canal = new CanalNoticias();

        Observador miCelular = new AppMovil();
        Observador pantallaTerminal = new PantallaPublica();

        // Suscribimos a los observadores.
        canal.agregarObservador(miCelular);
        canal.agregarObservador(pantallaTerminal);

        // Al publicar una noticia, ambos reciben la actualización.
        canal.publicarNoticia("¡Llegó el primer envío de vacunas!");

        // Si quitamos un observador, ya no recibirá más avisos.
        canal.quitarObservador(miCelular);
        System.out.println("\n(Se ha desuscrito la App Móvil)");

        canal.publicarNoticia("El clima estará soleado mañana.");

        // Reflexión Técnica:
        // En C, implementarías esto mediante una lista de "function pointers" (callbacks).
        // En Java, el uso de interfaces te da una estructura más robusta y fácil de 
        // mantener, evitando el "callback hell" y asegurando que los observadores
        // tengan un contrato claro de cómo ser notificados.
    }
}
