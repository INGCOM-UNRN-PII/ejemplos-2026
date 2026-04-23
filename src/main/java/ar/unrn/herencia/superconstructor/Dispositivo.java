package ar.unrn.herencia.superconstructor;
public class Dispositivo {
    private final String marca;
    public Dispositivo(String marca) {
        this.marca = marca;
        System.out.println("[Padre] Inicializando dispositivo marca: " + marca);
    }
    public void encender() {
        System.out.println("Dispositivo encendido.");
    }
    public String getMarca() { return marca; }
}
