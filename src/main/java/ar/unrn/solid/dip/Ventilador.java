package ar.unrn.solid.dip;

public class Ventilador implements Dispositivo {
    @Override
    public void encender() {
        System.out.println("Ventilador girando");
    }

    @Override
    public void apagar() {
        System.out.println("Ventilador detenido");
    }
}
