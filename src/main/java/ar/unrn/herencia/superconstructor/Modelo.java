package ar.unrn.herencia.superconstructor;

/**
 * Aporta un dato reutilizable del ejemplo de constructores heredados y ayuda a separar lo comun de lo especifico de cada dispositivo.
 * El paquete explica el uso de super en constructores para inicializar primero el estado heredado antes de completar la subclase.
 */
public class Modelo extends Smartphone {
    protected String version;

    public Modelo(String marca, String modelo, String version) {
        super(marca, modelo);
        this.version = version;
    }

    @Override
    public void apagar() {
        super.apagar();
        System.out.println("Smartphone version " + version + " apagado.");
    }
}
