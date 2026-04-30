package ar.unrn.solid.dip;

public class Lampara implements Dispositivo {
    @Override
    public void encender() {
        System.out.println("Lámpara encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Lámpara apagada");
    }
}
