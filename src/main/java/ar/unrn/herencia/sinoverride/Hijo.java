package ar.unrn.herencia.sinoverride;

public class Hijo extends Padre {
    public void mostrarMezaje(String texto) {
        System.out.println("Hijo (error tipográfico): " + texto);
    }

    public void mostrarMensaje(Object texto) {
        System.out.println("Hijo (sobrecarga): " + texto);
    }
}
