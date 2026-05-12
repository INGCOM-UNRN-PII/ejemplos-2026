package ar.unrn.herencia.superconstructor;

/**
 * Representa la parte base del modelo heredado y concentra el estado que toda especializacion necesita recibir por constructor.
 * El paquete explica el uso de super en constructores para inicializar primero el estado heredado antes de completar la subclase.
 */
public class Dispositivo {
    private final String marca;

    public Dispositivo(String marca) {
        this.marca = marca;
        System.out.println("[Padre] Inicializando dispositivo marca: " + marca);
    }

    public void encender() {
        System.out.println("Dispositivo encendido.");
    }

    public String getMarca() {
        return marca;
    }

    public void apagar() {
        System.out.println("Adiós (desde el abuelo)");
    }
}
