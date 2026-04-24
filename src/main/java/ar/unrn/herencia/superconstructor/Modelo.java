package ar.unrn.herencia.superconstructor;

public class Modelo extends Smartphone{
    protected String version;
    public Modelo(String marca, String modelo, String version  ) {
        super(marca, modelo);
        this.version = version;
    }

    @Override
    public void apagar() {
        super.apagar();
        System.out.println("Smartphone version " + version + " apagado.");
    }
}
