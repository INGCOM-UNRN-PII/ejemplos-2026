package ar.unrn.solid.isp;

public class Humano implements Trabajador, Alimentable {
    @Override
    public void trabajar() {
        System.out.println("Humano trabajando");
    }

    @Override
    public void comer() {
        System.out.println("Humano alimentándose");
    }
}
