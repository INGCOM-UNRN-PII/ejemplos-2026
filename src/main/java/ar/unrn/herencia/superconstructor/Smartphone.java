package ar.unrn.herencia.superconstructor;

/**
 * Especializa el dispositivo base para mostrar como la subclase completa su inicializacion despues de invocar al constructor padre.
 * El paquete explica el uso de super en constructores para inicializar primero el estado heredado antes de completar la subclase.
 */
public class Smartphone extends Dispositivo {
    private final String modelo;

    public Smartphone(String marca, String modelo) {
        super(marca);
        this.modelo = modelo;
        System.out.println("[Hijo] Inicializando Smartphone modelo: " + modelo);

    }

    @Override
    public void encender() {
        super.encender();
        System.out.println("Smartphone " + modelo + " mostrando logo de inicio...");
    }
}
