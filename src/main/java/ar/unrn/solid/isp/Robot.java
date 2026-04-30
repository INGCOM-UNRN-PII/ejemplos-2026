package ar.unrn.solid.isp;

public class Robot implements Trabajador {
    @Override
    public void trabajar() {
        System.out.println("Robot trabajando incansablemente");
    }
}
