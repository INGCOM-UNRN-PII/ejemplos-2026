package ar.unrn.herencia.superconstructor;
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
